package com.TamModding.mgm.block;

import net.minecraft.block.material.Material;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class CrackedMossy extends BlocksBase {
    public CrackedMossy(int blockID) {
        super(blockID, Material.rock);
        this.registerTexture("CrackedMossy");
        setBlockUnbreakable();
        setResistance(6000000.0F);
        setStepSound(soundStoneFootstep);
        disableStats();
    }
}
