package com.TamModding.mgm.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.TamModding.mgm.MythicalGods;
import com.TamModding.mgm.lib.TextureHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class ItemsBase extends Item {
    private String iconPath;

    public ItemsBase(int par1) {
        super(par1);
        this.setCreativeTab(MythicalGods.mythicalgodsTab);
    }

    /**
     * Register the Item texture
     * 
     * @param texture Texture name of the texture wanted
     * @return The item for easier use in constructing items
     */
    public Item registerTextures(String texture) {
        iconPath = texture;
        return this;
    }

    /*
     * Mincraft function to register the item texture registerIcons -> Registers the Icon
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = TextureHelper.getIconFromTextureName(iconRegister, iconPath);
    }
}
