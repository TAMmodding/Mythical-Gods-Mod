package com.TamModding.mgm.block;

import net.minecraft.block.material.Material;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class LimeStoneBlock extends BlocksBase {
    public LimeStoneBlock(int blockID) {
        super(blockID, Material.rock);
        this.registerTexture("LimeStone");
        this.setHardness(3.0F);
        this.setResistance(10.0F);
    }
}
