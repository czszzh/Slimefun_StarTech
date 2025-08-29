package me.czssj_.StarTech.category.Tools;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.czssj_.StarTech.StarTech;
import static me.czssj_.StarTech.setup.register.GROUP_TOOLS;

import org.bukkit.inventory.ItemStack;

public class Tools_Setup 
{
    public static void recipe(StarTech plugin)
    {
        new SlimefunItem(GROUP_TOOLS, Tools.EQUIP_REMOVER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_TOOLS, Tools.AUTO_BATTERY,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_TOOLS, Tools.STAR_BATTERY,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_TOOLS, Tools.EST_BATTER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_TOOLS, Tools.MOB_SERACH,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_TOOLS, Tools.TURBINE_PROPELLER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_TOOLS, Tools.INVISIBILITY_DIVICE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_TOOLS, Tools.VISION_GOGGLE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);
    }
}
