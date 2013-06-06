package com.TamModding.mgm.entitys;

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

import com.TamModding.mgm.lib.Reference;

public class EntityChickenBoss extends BaseBossEntity {
    public EntityChickenBoss(World par1World) {
        super(par1World);
        texture = Reference.PATH_ENTITYS + "ChickenBoss.png";
        moveSpeed = 0.25F;
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, new EntityAIWander(this, moveSpeed));
        tasks.addTask(2, new EntityAIBreakDoor(this));
        tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, moveSpeed, false));
        tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        tasks.addTask(5, new EntityAIWander(this, moveSpeed));
        targetTasks.addTask(6, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
        this.setEntityHealth(this.getMaxHealth());
        experienceValue = 100;
        isImmuneToFire = false;
        this.getNavigator().setCanSwim(true);
    }
    
    @Override
    public int getMaxSpawnedInChunk()
    {
        return 1;
    }

    @Override
    public int getTotalArmorValue() {
        return 1;
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    public int getMaxHealth() {
        return 2000;
    }

    @Override
    public int getAttackStrength(Entity par1Entity) {
        return 20;
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }

    @Override
    protected String getLivingSound() {
        return "mob.chicken.say";
    }

    @Override
    protected String getHurtSound() {
        return "mob.chicken.hurt";
    }

    @Override
    protected String getDeathSound() {
        return "mob.chicken.hurt";
    }

    @Override
    protected void playStepSound(int par1, int par2, int par3, int par4) {
        worldObj.playSoundAtEntity(this, "mob.chicken.step", 0.15F, 2.0F);
    }

    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);

        for (int k = 0; k < j; ++k)
        {
            this.dropItem(Item.feather.itemID, 1);
        }

        if (this.isBurning())
        {
            this.dropItem(Item.chickenCooked.itemID, 1);
        }
        else
        {
            this.dropItem(Item.chickenRaw.itemID, 1);
        }
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
