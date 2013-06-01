package com.TamModding.mgm.entitys;

import com.TamModding.mgm.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class EntityShark extends EntityMob {
    public EntityShark(World par1World) {
        super(par1World);
        texture = Reference.PATH_ENTITYS + "Shark.png";
        moveSpeed = 0.27F;
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, new EntityAIWander(this, moveSpeed));
        tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, moveSpeed, false));
        tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        tasks.addTask(5, new EntityAIWander(this, moveSpeed));
        targetTasks.addTask(6, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
        this.setEntityHealth(this.getMaxHealth());
        experienceValue = 5;
        isImmuneToFire = true;
        this.getNavigator().setCanSwim(true);
    }

    @Override
    public boolean getCanSpawnHere() {
        return posY > 45.0D && posY < 63.0D && super.getCanSpawnHere();
    }

    @Override
    public int getTotalArmorValue() {
        return 9;
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    public int getMaxHealth() {
        return 50;
    }

    @Override
    public int getAttackStrength(Entity par1Entity) {
        return 20;
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEAD;
    }

    @Override
    protected String getLivingSound() {
        return null;
    }

    @Override
    protected String getHurtSound() {
        return null;
    }

    @Override
    protected String getDeathSound() {
        return null;
    }

    @Override
    protected void playStepSound(int par1, int par2, int par3, int par4) {
        worldObj.playSoundAtEntity(this, null, 0.15F, 2.0F);
    }

    @Override
    protected int getDropItemId() {
        return Block.blockDiamond.blockID;
    }

    @Override
    protected void dropRareDrop(int par1) {
    }

    @SideOnly(Side.CLIENT)
    public int getBossHealth() {
        return dataWatcher.getWatchableObjectInt(16);
    }

    @Override
    protected void fall(float par1) {
    }

    @Override
    public void mountEntity(Entity par1Entity) {
        ridingEntity = null;
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

}
