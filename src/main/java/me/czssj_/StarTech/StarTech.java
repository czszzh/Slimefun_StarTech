package me.czssj_.StarTech;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.bukkit.plugin.java.JavaPlugin;
import org.json.JSONException;
import org.json.JSONObject;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import me.czssj_.StarTech.category.Materials.Materials_Setup;

public class StarTech extends JavaPlugin implements SlimefunAddon 
{
    private static StarTech instance;
    private static final Logger LOGGER = Logger.getLogger("StarTech");

    @Override
    public void onEnable() 
    {
        instance = this;
        Config cfg = new Config(this);

        checkForDepends();

        if (cfg.getBoolean("options.auto-update")) 
        {
            checkForUpdates();
        }

        Materials_Setup.recipe(this);
    }

    @Override
    public void onDisable() 
    {
        LOGGER.info("Good Bye! ;)");
    }

    @Override
    public String getBugTrackerURL() 
    {
        return "https://github.com/czszzh/Slimefun_StarTech/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() 
    {
        return this;
    }

    public static StarTech getInstance() 
    {
        return instance;
    }

    private void checkForDepends()
    {
        // 必需前置
        if (!getServer().getPluginManager().isPluginEnabled("Galactifun"))
        {
            LOGGER.warning("本插件需要 星际(Galactifun) 才能运行!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        else
        {
            LOGGER.info("前置 星际(Galactifun) 已加载");
        }
        
        if (!getServer().getPluginManager().isPluginEnabled("InfinityExpansion"))
        {
            LOGGER.warning("本插件需要 无尽贪婪(InfinityExpansion) 才能运行!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        else
        {
            LOGGER.info("前置 无尽贪婪(InfinityExpansion) 已加载");
        }

        if (!getServer().getPluginManager().isPluginEnabled("Supreme"))
        {
            LOGGER.warning("本插件需要 至尊研究院(Supreme) 才能运行!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        else
        {
            LOGGER.info("前置 至尊研究院(Supreme) 已加载");
        }

        if (!getServer().getPluginManager().isPluginEnabled("Networks"))
        {
            LOGGER.warning("本插件需要 网络(Networks) 才能运行!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        else
        {
            LOGGER.info("前置 网络(Networks) 已加载");
        }

        if (!getServer().getPluginManager().isPluginEnabled("TranscEndence"))
        {
            LOGGER.warning("本插件需要 末地科技(TranscEndence) 才能运行!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        else
        {
            LOGGER.info("前置 末地科技(TranscEndence) 已加载");
        }

        if (!getServer().getPluginManager().isPluginEnabled("MythicMobs"))
        {
            LOGGER.warning("本插件需要 MythicMobs 才能运行!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        else
        {
            LOGGER.info("前置 MythicMobs 已加载");
        }
        
        if (!getServer().getPluginManager().isPluginEnabled("Slimefun"))
        {
            LOGGER.warning("粘液科技本体都没有还想玩这个附属插件?");
            getServer().getPluginManager().disablePlugin(this);
        }
    }

    private void checkForUpdates() 
    {
        configureSslContext();
        try 
        {
            String apiUrl = "https://api.github.com/repos/czszzh/Slimefun_StarTech/releases/latest";
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            if (connection.getResponseCode() == 200) 
            {
                StringBuilder jsonResponse;
                try (Scanner scanner = new Scanner(connection.getInputStream())) 
                {
                    jsonResponse = new StringBuilder();
                    while (scanner.hasNext()) jsonResponse.append(scanner.nextLine());
                }

                JSONObject jsonObject = new JSONObject(jsonResponse.toString());
                String latestVersion = jsonObject.getString("tag_name");

                if (!getDescription().getVersion().equals(latestVersion)) 
                {
                    LOGGER.warning(String.format("发现新版本: %s", latestVersion));

                    String downloadUrl = jsonObject.getJSONArray("assets").getJSONObject(0).getString("browser_download_url");
                    LOGGER.warning(String.format("下载链接: %s", downloadUrl));

                } 
                else 
                {
                    LOGGER.info(String.format("当前已经是最新版本: %s", latestVersion));
                }
            } 
            else 
            {
                LOGGER.warning(String.format("无法检查更新,GitHub API 返回了 %s", connection.getResponseCode()));
            }
        } 
        catch (IOException | JSONException e) 
        {
            LOGGER.severe(String.format("检查更新时发生错误: %s", e.getMessage()));
        }
    }

    //忽略ssl证书
    private void configureSslContext() 
    {
        try 
        {
            TrustManager[] trustAllCerts = new TrustManager[] 
            {
                new X509TrustManager() 
                {
                    @Override
                    public X509Certificate[] getAcceptedIssuers() 
                    { 
                        return null; 
                    }

                    @Override
                    public void checkClientTrusted(X509Certificate[] certs, String authType) {}
                    
                    @Override
                    public void checkServerTrusted(X509Certificate[] certs, String authType) {}
                }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());

            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
        } 
        catch (KeyManagementException | NoSuchAlgorithmException e) 
        {
            LOGGER.severe(String.format("配置 SSL 证书时发生错误: %s", e.getMessage()));
        }
    }
}
