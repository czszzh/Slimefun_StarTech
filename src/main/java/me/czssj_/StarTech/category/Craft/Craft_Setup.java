package me.czssj_.StarTech.category.Craft;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.czssj_.StarTech.StarTech;
import static me.czssj_.StarTech.setup.register.GROUP_CRAFT;

public class Craft_Setup 
{
    public static void recipe(StarTech plugin)
    {
        new SlimefunItem(GROUP_CRAFT, Craft.CEILING_LIGHT,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_CRAFT, Craft.SHOW_BLOCK,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_CRAFT, Craft.TEMPERED_GLASS,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_CRAFT, Craft.MSTONE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_CRAFT, Craft.TEMPERED_OBSIDIAN,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_CRAFT, Craft.TEMPERED_GLASS_PANE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_CRAFT, Craft.ENERGY_CONDITION_BLOCK,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_CRAFT, Craft.ENERGY_CONNECT_BLOCK,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);
    }
}
