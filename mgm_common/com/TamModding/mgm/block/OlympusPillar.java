package com.TamModding.mgm.block;

import net.minecraft.block.material.Material;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class OlympusPillar extends BlocksBase {
    public OlympusPillar(int par1) {
        super(par1, Material.rock);
        super.registerTexture("OlympusPillarSide", "OlympusPillarTop", "OlympusPillarTop");
        this.setHardness(3.0F);
        this.setResistance(10.0F);
    }
}