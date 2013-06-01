package com.TamModding.mgm.entitys;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class BaseBossEntity extends EntityMob{
    public BaseBossEntity(World par1World) {
        super(par1World);
    }

    @Override
    public int getMaxHealth() {
        return 0;
    }
}
