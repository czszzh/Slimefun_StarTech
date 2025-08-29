package me.czssj_.StarTech.category.Tools;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class Tools 
{
    public static final SlimefunItemStack EQUIP_REMOVER = new SlimefunItemStack(
        "SST_EQUIP_REMOVER",
        Material.CLOCK,
        "§e装备清除器"
    );

    public static final SlimefunItemStack AUTO_BATTERY = new SlimefunItemStack(
        "SST_AUTO_BATTERY",
        Material.IRON_INGOT,
        "§e便携自动充电电池",
        meta -> {
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
    );
    static { AUTO_BATTERY.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1); }

    public static final SlimefunItemStack STAR_BATTERY = new SlimefunItemStack(
        "SST_STAR_BATTERY",
        Material.BRICK,
        "§b便携式星尘自动充电电池",
        meta -> {
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
    );
    static { STAR_BATTERY.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1); }
        

    public static final SlimefunItemStack EST_BATTER = new SlimefunItemStack(
        "SST_EST_BATTER",
        Material.NETHERITE_INGOT,
        "§6便携式究极自动充电电池",
        meta -> {
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
    );
    static { EST_BATTER.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1); }

    public static final SlimefunItemStack MOB_SERACH = new SlimefunItemStack(
        "SST_MOB_SERACH",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRhMzMyYWJkZTMzM2ExNWE2YzZmY2ZlY2E4M2YwMTU5ZWE5NGI2OGU4ZjI3NGJhZmMwNDg5MmI2ZGJmYyJ9fX0=",
        "§e便携式生物探测仪"
    );

    public static final SlimefunItemStack TURBINE_PROPELLER = new SlimefunItemStack(
        "SST_TURBINE_PROPELLER",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTUxNmNiOGUxYTM4YjQzNTVlODczYWE1Y2JkYzVkODM2YjU2MWMxNDQ5YWFmNTE0YTIyYWRhMmE4MTRkZTIifX19",
        "§e便携式涡轮推进器"
    );

    public static final SlimefunItemStack INVISIBILITY_DIVICE = new SlimefunItemStack(
        "SST_INVISIBILITY_DIVICE",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODVjNGVmZmJhNGQ5OWY0MzczMTRjOGE4NzU1ODU2NzEzZmQ4NWRjZDE1YjM2OTBjNzQ5Y2UxZTQ0NDc0In19fQ==",
        "§e全息隐身器"
    );

    public static final SlimefunItemStack VISION_GOGGLE = new SlimefunItemStack(
        "SST_VISION_GOGGLE",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTFlNWFkMTIxMTRlNDAzY2ZhMDJiOTgyNGFmNTI5ZWY0MDM3Mjc5NDQzODk1MmUwYjIyMjU3NjkzNGNmMGQ0NyJ9fX0=",
        "§e夜视望远镜"
    );

}
