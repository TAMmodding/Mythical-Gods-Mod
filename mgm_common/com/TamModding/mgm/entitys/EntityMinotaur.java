package com.TamModding.mgm.entitys;

import com.TamModding.mgm.lib.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class EntityMinotaur extends BaseBossEntity {
    public EntityMinotaur(World par1World) {
        super(par1World);
        texture = Reference.PATH_ENTITYS + "Minotaur.png";
        moveSpeed = 0.27F;
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, new EntityAIWander(this, moveSpeed));
        tasks.addTask(2, new EntityAIBreakDoor(this));
        tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, moveSpeed, false));
        tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        tasks.addTask(5, new EntityAIWander(this, moveSpeed));
        targetTasks.addTask(6, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
        this.setEntityHealth(this.getMaxHealth());
        experienceValue = 250;
        isImmuneToFire = true;
    }
    
    @Override
    public int getMaxSpawnedInChunk()
    {
        return 1;
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
        return 2500;
    }

    @Override
    public int getAttackStrength(Entity par1Entity) {
        return 120;
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEAD;
    }

    @Override
    protected String getLivingSound() {
        return "mods.MGM.sounds.CowMooSoundEffect1";
    }

    @Override
    protected String getHurtSound() {
        return "CowMoo_1";
    }

    @Override
    protected String getDeathSound() {
        return null;
    }

    
    @Override
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.irongolem.walk", 1.0F, 1.0F);
    }

    @Override
    protected int getDropItemId() {
        return Item.axeIron.itemID;
    }

    @Override
    protected void dropRareDrop(int par1) {
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
