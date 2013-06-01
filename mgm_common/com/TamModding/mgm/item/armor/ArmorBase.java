package com.TamModding.mgm.item.armor;

import com.TamModding.mgm.MythicalGods;
import com.TamModding.mgm.lib.TextureHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor{
    private String iconPath;
    
    public ArmorBase(int itemID, EnumArmorMaterial enumArmorMaterial, int renderIndex, int armorType) {
        super(itemID, enumArmorMaterial, renderIndex, armorType);
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
