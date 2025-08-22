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
        new CustomItemStack(item.GROUP_MAIN, "§5舵星科技", "", "&a> Click to open")
    );

    public static final SubItemGroup Materials = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Materials"),
        Main,
        new CustomItemStack(item.GROUP_MATERIALS, "&5舵星科技 &f- §9星源材料", "", "")
    );

    public static final SubItemGroup Machines = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Machines"),
        Main,
        new CustomItemStack(item.GROUP_MACHINES, "&5舵星科技 &f- §9星源机器", "", "")
    );

    public static final SubItemGroup Generators = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Generators"),
        Main,
        new CustomItemStack(item.GROUP_GENERATORS, "&5舵星科技 &f- §9星源发电机", "", "")
    );

    public static final SubItemGroup Craft = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Craft"),
        Main,
        new CustomItemStack(item.GROUP_CRAFT, "&5舵星科技 &f- §9星源工艺", "", "")
    );

    public static final SubItemGroup MobTech = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_MobTech"),
        Main,
        new CustomItemStack(item.GROUP_MOBTECH, "&5舵星科技 &f- §9舵星生物科技", "", "")
    );

    public static final SubItemGroup Transport = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Transport"),
        Main,
        new CustomItemStack(item.GROUP_TRANSPRORT, "&5舵星科技 &f- §9传输设施", "", "")
    );

    public static final SubItemGroup Food = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Food"),
        Main,
        new CustomItemStack(item.GROUP_FOOD, "&5舵星科技 &f- §9太空美食", "", "")
    );

    public static final SubItemGroup Network = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Network"),
        Main,
        new CustomItemStack(item.GROUP_NETWORK, "&5舵星科技 &f- §9舵星网络", "", "")
    );

    public static final SubItemGroup Tools = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Tools"),
        Main,
        new CustomItemStack(item.GROUP_TOOLS, "&5舵星科技 &f- §9舵星工具", "", "")
    );

    public static final SubItemGroup Weapons = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Weapons"),
        Main,
        new CustomItemStack(item.GROUP_WEAPONS, "&5舵星科技 &f- §9舵星武器", "", "")
    );

    public static final SubItemGroup Armor = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Armor"),
        Main,
        new CustomItemStack(item.GROUP_ARMOR, "&5舵星科技 &f- §9舵星装备", "", "")
    );

    public static final SubItemGroup Legend = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Legend"),
        Main,
        new CustomItemStack(item.GROUP_LEGEND, "&5舵星科技 §3曾经的传说", "", "")
    );

    public static final SubItemGroup Contributors = new SubItemGroup(
        new NamespacedKey(StarTech.getInstance(), "StarTech_Contributors"),
        Main,
        new CustomItemStack(Material.BOOK, "&5舵星科技 &f- §9贡献者", "", "")
    );
}
