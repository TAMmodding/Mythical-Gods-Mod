package com.TamModding.mgm.item.tools;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.TamModding.mgm.entitys.BaseBossEntity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class HolySword extends SwordsBase {
    public HolySword(int par1, EnumToolMaterial par2EnumToolMaterial) {
        super(par1, par2EnumToolMaterial);
        super.registerTextures("HolySword");
    }

    @SideOnly(Side.CLIENT)
    @Override
    /* Make the item glow, like enchanted */
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
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
