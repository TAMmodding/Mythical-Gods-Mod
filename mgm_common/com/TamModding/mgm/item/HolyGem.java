package com.TamModding.mgm.item;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class HolyGem extends ItemsBase {
    public HolyGem(int par1) {
        super(par1);
        super.registerTextures("HolyGem");
        this.setMaxStackSize(64);
    }

    @SideOnly(Side.CLIENT)
    @Override
    /* Make the item glow, like enchanted */
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }
}
