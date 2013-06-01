package com.TamModding.mgm.block;

import java.util.Random;

import net.minecraft.block.material.Material;

import com.TamModding.mgm.lib.ItemHelper;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class UnholyOre extends BlocksBase {
    public UnholyOre(int par1) {
        super(par1, Material.rock);
        super.registerTexture("UnholyOre");
        this.setHardness(10.0F);
        this.setResistance(10.0F);
    }

    @Override
    public int idDropped(int i, Random random, int j) {
        return ItemHelper.unholyGem.itemID;
    }
}