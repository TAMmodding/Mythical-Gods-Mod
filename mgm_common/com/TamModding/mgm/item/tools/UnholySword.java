package com.TamModding.mgm.item.tools;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import com.TamModding.mgm.entitys.BaseBossEntity;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class UnholySword extends SwordsBase {
    public UnholySword(int par1, EnumToolMaterial par2EnumToolMaterial) {
        super(par1, par2EnumToolMaterial);
        super.registerTextures("UnholySword");
    }
    
   
    @Override
    /* Makes the UnholySword not work against normal mobs, it will give DiamondsSword damage +4 */
    public int getDamageVsEntity(Entity par1Entity) {
        // TODO -> Set all the BossMonsters to get a lot of damage
        if (par1Entity instanceof BaseBossEntity)
            return super.getDamageVsEntity(par1Entity);
        else
            return Item.swordDiamond.getDamageVsEntity(par1Entity) + 4;
    }
}
