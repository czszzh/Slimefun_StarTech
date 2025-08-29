package me.czssj_.StarTech.category.Transport;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class Transport 
{
    public static final SlimefunItemStack MV_INPUT = new SlimefunItemStack(
        "SST_MV_INPUT",
        Material.PURPLE_STAINED_GLASS_PANE,
        "§e纬度传输器 §f(§b输入§f)"
    );

    public static final SlimefunItemStack MV_OUTPUT = new SlimefunItemStack(
        "SST_MV_OUTPUT",
        Material.PURPUR_PILLAR,
        "§e纬度传输器 §f(§6输出§f)"
    );

    public static final SlimefunItemStack MV_ENCODER = new SlimefunItemStack(
        "SST_MV_ENCODER",
        Material.LECTERN,
        "§e纬度传输编码器"
    );

    public static final SlimefunItemStack DOOR_FRAME = new SlimefunItemStack(
        "SST_DOOR_FRAME",
        Material.SCULK,
        "§e星门框架"
    );

    public static final SlimefunItemStack DOOR_CONFIG_TABLE = new SlimefunItemStack(
        "SST_DOOR_CONFIG_TABLE",
        Material.CALIBRATED_SCULK_SENSOR,
        "§e星门配置台"
    );

    public static final SlimefunItemStack DOOR_CORE = new SlimefunItemStack(
        "SST_DOOR_CORE",
        Material.REINFORCED_DEEPSLATE,
        "§6星门核心"
    );
}
