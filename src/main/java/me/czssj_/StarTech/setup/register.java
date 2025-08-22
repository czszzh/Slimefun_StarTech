package me.czssj_.StarTech.setup;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.czssj_.StarTech.StarTech;

public class register 
{
    public static final NestedItemGroup Main = new NestedItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech"),
        new CustomItemStack(Groups.GROUP_MAIN, "§5舵星科技", "", "&a> Click to open")
    );

    public static final SubItemGroup GROUP_MATERIALS = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Materials"),
        Main,
        new CustomItemStack(Groups.GROUP_MATERIALS, "&5舵星科技 &f- §9星源材料", "", "")
    );

    public static final SubItemGroup GROUP_MACHINES = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Machines"),
        Main,
        new CustomItemStack(Groups.GROUP_MACHINES, "&5舵星科技 &f- §9星源机器", "", "")
    );

    public static final SubItemGroup GROUP_GENERATORS = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Generators"),
        Main,
        new CustomItemStack(Groups.GROUP_GENERATORS, "&5舵星科技 &f- §9星源发电机", "", "")
    );

    public static final SubItemGroup GROUP_CRAFT = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Craft"),
        Main,
        new CustomItemStack(Groups.GROUP_CRAFT, "&5舵星科技 &f- §9星源工艺", "", "")
    );

    public static final SubItemGroup GROUP_MOBTECH = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_MobTech"),
        Main,
        new CustomItemStack(Groups.GROUP_MOBTECH, "&5舵星科技 &f- §9舵星生物科技", "", "")
    );

    public static final SubItemGroup GROUP_TRANSPRORT = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Transport"),
        Main,
        new CustomItemStack(Groups.GROUP_TRANSPRORT, "&5舵星科技 &f- §9传输设施", "", "")
    );

    public static final SubItemGroup GROUP_FOOD = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Food"),
        Main,
        new CustomItemStack(Groups.GROUP_FOOD, "&5舵星科技 &f- §9太空美食", "", "")
    );

    public static final SubItemGroup GROUP_NETWORK = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Network"),
        Main,
        new CustomItemStack(Groups.GROUP_NETWORK, "&5舵星科技 &f- §9舵星网络", "", "")
    );

    public static final SubItemGroup GROUP_TOOLS = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Tools"),
        Main,
        new CustomItemStack(Groups.GROUP_TOOLS, "&5舵星科技 &f- §9舵星工具", "", "")
    );

    public static final SubItemGroup GROUP_WEAPONS = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Weapons"),
        Main,
        new CustomItemStack(Groups.GROUP_WEAPONS, "&5舵星科技 &f- §9舵星武器", "", "")
    );

    public static final SubItemGroup GROUP_ARMOR = new SubItemGroup(    
        new NamespacedKey(StarTech.getInstance(), "StarTech_Armor"),
        Main,
        new CustomItemStack(Groups.GROUP_ARMOR, "&5舵星科技 &f- §9舵星装备", "", "")
    );

    public static final SubItemGroup GROUP_LEGEND = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Legend"),
        Main,
        new CustomItemStack(Groups.GROUP_LEGEND, "&5舵星科技 §3曾经的传说", "", "")
    );

    public static final SubItemGroup GROUP_CONTRIBUTORS = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Contributors"),
        Main,
        new CustomItemStack(Material.PLAYER_HEAD, "&5舵星科技 &f- §9贡献者", "", "")
    );
}
