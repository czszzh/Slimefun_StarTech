package me.czssj_.StarTech.category.Food;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.czssj_.StarTech.StarTech;

public class Health_Increase_Potion extends SlimefunItem implements NotPlaceable
{
    private static final NamespacedKey MAX_HEALTH_MODIFIER = new NamespacedKey(StarTech.getInstance(), "max_health_modifier");
    private final Map<Player, Long> playerEffectEndTimes = new HashMap<>();
    private final Map<Player, Integer> playerTaskIds = new HashMap<>();

    public Health_Increase_Potion(SubItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe)
    {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public void preRegister() 
    {
        ItemUseHandler itemUseHandler = this::itemRightClick;
        addItemHandler(itemUseHandler);
    }
    
    private void itemRightClick(PlayerRightClickEvent event)
    {
        Player p = event.getPlayer();
        ItemStack potion = event.getItem();

        if(getMaxHealthAttribute() == null) return;

        if(playerTaskIds.containsKey(p)) Bukkit.getScheduler().cancelTask(playerTaskIds.get(p));
        
        AttributeModifier modifier = new AttributeModifier(
            MAX_HEALTH_MODIFIER,
            20,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlotGroup.ANY
        );
        p.getAttribute(getMaxHealthAttribute()).addModifier(modifier);

        long endTime = System.currentTimeMillis() + 480000;
        playerEffectEndTimes.put(p, endTime);

        int taskId = Bukkit.getScheduler().runTaskLater(StarTech.getInstance(), () -> {
            if (p.isOnline()) 
            {
                p.getAttribute(getMaxHealthAttribute()).removeModifier(modifier);
                playerEffectEndTimes.remove(p);
                playerTaskIds.remove(p);
            }
        }, 9600L).getTaskId();

        playerTaskIds.put(p, taskId);

        potion.setAmount(potion.getAmount() - 1);
        event.cancel();
    }

    private Attribute getMaxHealthAttribute() 
    {
        try 
        {
            return Attribute.valueOf("MAX_HEALTH");
        } 
        catch (IllegalArgumentException e1) 
        {
            try 
            {
                return Attribute.valueOf("GENERIC_MAX_HEALTH");
            } 
            catch (IllegalArgumentException e2) 
            {
                return null;
            }
        }
    }
}
