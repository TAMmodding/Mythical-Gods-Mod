package com.TamModding.mgm.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

import com.TamModding.mgm.lib.ItemHelper;
import com.TamModding.mgm.lib.Reference;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class UnHolyArmor extends ArmorBase {
    public UnHolyArmor(int itemID, EnumArmorMaterial enumArmorMaterial, int renderIndex, int armorType, String texture) {
        super(itemID, enumArmorMaterial, renderIndex, armorType);
        this.registerTextures(texture);
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
        if (stack.itemID == ItemHelper.helmetUnHoly.itemID || stack.itemID == ItemHelper.chestUnHoly.itemID || stack.itemID == ItemHelper.bootsUnHoly.itemID)
            return Reference.PATH_ARMOR + "UnholyArmor_1.png";
        if (stack.itemID == ItemHelper.leggingsUnHoly.itemID)
            return Reference.PATH_ARMOR + "UnholyArmor_2.png";
        return Reference.PATH_ARMOR + "UnholyArmor_2.png";
    }
}
