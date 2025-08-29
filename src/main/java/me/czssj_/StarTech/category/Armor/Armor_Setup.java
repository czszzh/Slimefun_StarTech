package me.czssj_.StarTech.category.Armor;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.czssj_.StarTech.StarTech;
import static me.czssj_.StarTech.setup.register.GROUP_ARMOR;

public class Armor_Setup 
{
    public static void recipe(StarTech plugin)
    {
        new SlimefunItem(GROUP_ARMOR, Armor.Helmet,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.Chestplate,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.GREAVES,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.Boots,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.VOID_WINGS,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.CREATOR_HELMET,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.NANO_O2_HELMET,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.NANO_CHESTPLATE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.NANO_GREAVES,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_ARMOR, Armor.NANO_BOOTS,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);
    }
}
