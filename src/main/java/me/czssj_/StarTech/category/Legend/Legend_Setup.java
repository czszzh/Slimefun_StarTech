package me.czssj_.StarTech.category.Legend;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.czssj_.StarTech.StarTech;
import static me.czssj_.StarTech.setup.register.GROUP_LEGEND;

public class Legend_Setup 
{
    public static void recipe(StarTech plugin)
    {
        new SlimefunItem(GROUP_LEGEND, Legend.RECORD_OF_STARTECH,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_LEGEND, Legend.RECORD_OF_MOON,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_LEGEND, Legend.RECORD_OF_MARS,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_LEGEND, Legend.RECORD_OF_EARTH,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_LEGEND, Legend.RECORD_OF_SATURN,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_LEGEND, Legend.RECORD_OF_PLUTO,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);
    }
}
