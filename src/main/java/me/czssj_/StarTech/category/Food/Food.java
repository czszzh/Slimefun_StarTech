package me.czssj_.StarTech.category.Food;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class Food
{
    public static final SlimefunItemStack COOKER = new SlimefunItemStack(
        "SST_COOKER",
        Material.CRAFTER,
        "§b万能食品加工台"
    );

    public static final SlimefunItemStack BEEF = new SlimefunItemStack(
        "SST_BEEF",
        Material.COOKED_BEEF,
        "§3惰性牛排",
        meta -> {
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
    );
    static { BEEF.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1); }

    public static final SlimefunItemStack SERVER = new SlimefunItemStack(
        "SST_SERVER",
        Material.BAKED_POTATO,
        "§8变异土豆",
        meta -> {
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
    );
    static { SERVER.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1); }

    public static final SlimefunItemStack DRINK = new SlimefunItemStack(
        "SST_DRINK",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjk2Yjc0MjQ5Y2MxNWNlZmU0NjI0YmU2N2FlODYxZGYyZmU2NGVlNmFjN2Y0NjIzNjNkOTBjY2E5NDgxNTM5In19fQ==",
        "§b星河之饮"
    );

    public static final SlimefunItemStack BOTTLE_OF_COLA = new SlimefunItemStack(
        "SST_BOTTLE_OF_COLA",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTNiMDFmYjJmNmJhNDdjOWQ3NjM4NDkxZjM3Y2Q4NTgyYTkzNzczMTE4NmRmNGQxZWNjZDU5YjY1YmYzNyJ9fX0=",
        "§e瓶装可乐"
    );

    public static final SlimefunItemStack COD_OIL = new SlimefunItemStack(
        "SST_COD_OIL",
        Material.HONEY_BOTTLE,
        "§e鱼肝油"
    );

    public static final SlimefunItemStack LUCKY_POTION = new SlimefunItemStack(
        "SST_LUCKY_POTION",
        Color.GREEN,
        new PotionEffect(PotionEffectType.LUCK, 9600, 1),
        "§b幸运药剂"
    );

    public static final SlimefunItemStack UNLUCKY_POTION = new SlimefunItemStack(
        "SST_UNLUCKY_POTION",
        Color.GRAY,
        new PotionEffect(PotionEffectType.UNLUCK, 9600, 1),
        "§7厄运药剂"
    );

    public static final SlimefunItemStack WITHER_POTION = new SlimefunItemStack(
        "SST_WITHER_POTION",
        Color.RED,
        new PotionEffect(PotionEffectType.WITHER, 1200, 2),
        "§c凋零药剂"
    );

    public static final SlimefunItemStack SHIP_BISCUIT = new SlimefunItemStack(
        "SST_SHIP_BISCUIT",
        Material.COOKIE,
        "§e压缩饼干"
    );

    public static final SlimefunItemStack MOUSSE_CAKE = new SlimefunItemStack(
        "SST_MOUSSE_CAKE",
        Material.CAKE,
        "§a慕斯蛋糕"
    );

    public static final SlimefunItemStack CHOCOLATE = new SlimefunItemStack(
        "SST_CHOCOLATE",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFjZmM3ODY0NjllNjM2YmY0ZWFhYzJlZDQ5ZDlhNmM1MjEyYWY2ZDkwNzFkOTYxOTQ0YmU4YTkzNWY0NzhlIn19fQ==",
        "§e巧克力"
    );

    public static final SlimefunItemStack COCOA_DRINK = new SlimefunItemStack(
        "SST_COCOA_DRINK",
        Material.POTION,Color.MAROON,
        "§6可可饮"
    );

    public static final SlimefunItemStack HEALTH_INCREASE_POTION = new SlimefunItemStack(
        "SST_HEALTH_INCREASE_POTION", 
        Material.POTION,Color.RED,
        "§c生命提升药剂"
    );

    public static final SlimefunItemStack TRUE_DAMAGE_POTION = new SlimefunItemStack(
        "SST_TRUE_DAMAGE_POTION",
        Material.POTION,Color.BLUE,
        "§b真伤药剂"
    );

    public static final SlimefunItemStack BULL_POTION = new SlimefunItemStack(
        "SST_BULL_POTION",
        Material.POTION,Color.YELLOW,
        "§e蛮牛药剂"
    );

}
