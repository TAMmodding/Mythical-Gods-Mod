package com.TamModding.mgm.block;

import java.util.Random;

import net.minecraft.block.material.Material;

import com.TamModding.mgm.lib.ItemHelper;

public class ENDUnholyOre extends BlocksBase {
    public ENDUnholyOre(int par1) {
        super(par1, Material.rock);
        super.registerTexture("EndUnholyOre");
        this.setHardness(10.0F);
        this.setResistance(10.0F);
    }

    public int idDropped(int i, Random random, int j) {
        return ItemHelper.unholyGem.itemID;
    }
}