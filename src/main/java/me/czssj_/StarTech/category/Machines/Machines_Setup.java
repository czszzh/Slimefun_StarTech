package me.czssj_.StarTech.category.Machines;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.czssj_.StarTech.StarTech;
import static me.czssj_.StarTech.setup.register.GROUP_MACHINES;

public class Machines_Setup 
{
    public static void recipe(StarTech plugin)
    {
        new SlimefunItem(GROUP_MACHINES, Machines.TABLE_CORE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.COLLECTOR,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.FORGING_FURNACE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.CATCHER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.PURIFIER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.FORGED,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.MA,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.MINER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.CONNECTER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.TUBE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.RECEIVER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.POWERCOLLECTER,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);

        new SlimefunItem(GROUP_MACHINES, Machines.STORE,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);
    }
}
