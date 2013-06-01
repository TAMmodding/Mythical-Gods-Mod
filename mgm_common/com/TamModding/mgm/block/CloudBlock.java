package com.TamModding.mgm.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class CloudBlock extends BlocksBase {
    public CloudBlock(int par1) {
        super(par1, Material.cloth);
        super.registerTexture("CloudBlock");
        this.setHardness(1.0F);
        this.setResistance(1.0F);
        this.setStepSound(soundClothFootstep);
    }

    /* Set the boundingbox of the block to 7/8 of a block */
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        float f = 0.125F;
        return AxisAlignedBB.getAABBPool().getAABB(x, y, z, x + 1, y + 1 - f, z + 1);
    }

    /* Slows entity down when on the block */
    @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
        double slowdown = 0.7D; // 0.4D is soulsand
        par5Entity.motionX *= slowdown;
        par5Entity.motionZ *= slowdown;
    }

    /* Makes the block transparant */
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public int getRenderBlockPass() {
        return 1;
    }
}
