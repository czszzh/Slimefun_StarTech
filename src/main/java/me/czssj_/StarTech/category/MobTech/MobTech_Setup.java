package me.czssj_.StarTech.category.MobTech;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.czssj_.StarTech.StarTech;
import static me.czssj_.StarTech.setup.register.GROUP_MOBTECH;

public class MobTech_Setup 
{
    public static void recipe(StarTech plugin)
    {
        new SlimefunItem(GROUP_MOBTECH, MobTech.ORIGINAL_SERUM,
        RecipeType.NULL, new ItemStack[]{
            null,null,null,
            null,null,null,
            null,null,null
        }).register(plugin);
    }
}
