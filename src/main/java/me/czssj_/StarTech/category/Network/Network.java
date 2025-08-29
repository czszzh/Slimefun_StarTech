package me.czssj_.StarTech.category.Network;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class Network 
{
    public static final SlimefunItemStack NET_DEL_EQUIPMENT = new SlimefunItemStack(
        "SST_NET_DEL_EQUIPMENT",
        Material.PISTON,
        "§e网络装备去除器"
    );

    public static final SlimefunItemStack NET_DEL_HEAD = new SlimefunItemStack(
        "SST_NET_DEL_HEAD",
        Material.SHROOMLIGHT,
        "§e网络头颅去除器"
    );

    public static final SlimefunItemStack NET_DEL_WEAPON = new SlimefunItemStack(
        "SST_NET_DEL_WEAPON",
        Material.STICKY_PISTON,
        "§e网络武器去除器"
    );

    public static final SlimefunItemStack NET_WHITELIST = new SlimefunItemStack(
        "SST_NET_WHITELIST",
        Material.LIGHT_BLUE_STAINED_GLASS_PANE,
        "§f网络白名单"
    );

    public static final SlimefunItemStack NET_CREATER = new SlimefunItemStack(
        "SST_NET_CREATER",
        Material.LIGHT_BLUE_GLAZED_TERRACOTTA,
        "§6至尊星源网络合成机"
    );

    public static final SlimefunItemStack NET_CHUNK_CATCHER = new SlimefunItemStack(
        "SST_NET_CHUNK_CATCHER",
        Material.EXPOSED_COPPER_GRATE,
        "§e区块抓取器"
    );

    public static final SlimefunItemStack NET_CHUNK_PUSHER = new SlimefunItemStack(
        "SST_NET_CHUNK_PUSHER",
        Material.EXPOSED_COPPER_BULB,
        "§e区块推送器"
    );

    public static final SlimefunItemStack DIMENSION_ITEM_LAUNCHER = new SlimefunItemStack(
        "SST_DIMENSIONITEM_LAUNCHER",
        Material.CHISELED_BOOKSHELF,
        "§e维度物品发射器"
    );

    public static final SlimefunItemStack DIMENSION_ITEM_RECEIVER = new SlimefunItemStack(
        "SST_DIMENSIONITEM_RECEIVER",
        Material.BOOKSHELF,
        "§e维度物品接收器"
    );

    public static final SlimefunItemStack DIMENSION_ITEM_CONFIGURATOR = new SlimefunItemStack(
        "SST_DIMENSIONITEM_CONFIGURATOR",
        Material.BREEZE_ROD,
        "§e维度物品配置器"
    );

}
