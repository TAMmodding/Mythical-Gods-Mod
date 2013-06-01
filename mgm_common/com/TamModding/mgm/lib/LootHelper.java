package com.TamModding.mgm.lib;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class LootHelper {
    /**
     * Initialize the ChestGenHooks and adds the different loot
     */
    public static void init() {
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemHelper.unholyGem), 1, 3, 15));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemHelper.holyGem), 1, 3, 10));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemHelper.unholyGem), 1, 3, 15));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemHelper.holyGem), 1, 3, 10));
    }
}
