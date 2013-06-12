package com.TamModding.mgm.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.TamModding.mgm.lib.ItemHelper;
import com.TamModding.mgm.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class HolyArmor extends ArmorBase {
    public HolyArmor(int itemID, EnumArmorMaterial enumArmorMaterial, int renderIndex, int armorType, String texture) {
        super(itemID, enumArmorMaterial, renderIndex, armorType);
        this.registerTextures(texture);
        
       
    }

    
    @SideOnly(Side.CLIENT)
    @Override
    /* Make the item glow, like enchanted */
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
        if (stack.itemID == ItemHelper.helmetHoly.itemID || stack.itemID == ItemHelper.chestHoly.itemID || stack.itemID == ItemHelper.bootsHoly.itemID)
            return Reference.PATH_ARMOR + "HolyArmor_1.png";
        if (stack.itemID == ItemHelper.leggingsHoly.itemID)
            return Reference.PATH_ARMOR + "HolyArmor_2.png";
        return Reference.PATH_ARMOR + "HolyArmor_2.png";
    }
    
    public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack) {
	       
	      if (player.getCurrentItemOrArmor(4) != null && player.getCurrentArmor(3) != null && player.getCurrentItemOrArmor(2) != null && player.getCurrentItemOrArmor(1) != null) {
	          ItemStack helmet = player.getCurrentItemOrArmor(4);
	          ItemStack plate = player.getCurrentItemOrArmor(3);
	          ItemStack legs = player.getCurrentItemOrArmor(2);
	          ItemStack boots = player.getCurrentItemOrArmor(1); 
	          
	          if (helmet.getItem() == ItemHelper.helmetHoly && plate.getItem() == ItemHelper.chestHoly && legs.getItem() == ItemHelper.leggingsHoly && boots.getItem() == ItemHelper.bootsHoly) 
	          {
	        	    player.fallDistance = 0.0F;
	        		player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 200, 2));
	        		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 200, 1));
	          }
	      }
	  }
}
