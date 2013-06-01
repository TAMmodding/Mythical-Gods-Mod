package com.TamModding.mgm.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

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
public class BlocksBase extends Block {
    protected Icon tileSide;
    protected String tileSideName;
    protected Icon tileTop;
    protected String tileTopName;
    protected Icon tileBottom;
    protected String tileBottomName;

    public BlocksBase(int blockID, Material material) {
        super(blockID, material);
        this.setCreativeTab(MythicalGods.mythicalgodsTab);
    }

    /**
     * Setup single texture for the block
     * 
     * @param text Texture name for all sides
     */
    public void registerTexture(String text) {
        tileSideName = tileTopName = tileBottomName = text;
    }

    /**
     * Setup multiple textures for the block
     * 
     * @param side Texture name for the sides
     * @param top Texture name for the top
     * @param bottom Texture name for the bottom
     */
    public void registerTexture(String side, String top, String bottom) {
        tileSideName = side;
        tileTopName = top;
        tileBottomName = bottom;
    }

    /*
     * Minecraft functions to make the textures work. registerIcons -> Registers the icons into the variables getIcon -> Returns the right icon based
     * on side and metadata
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        tileSide = TextureHelper.getIconFromTextureName(par1IconRegister, tileSideName);
        tileTop = TextureHelper.getIconFromTextureName(par1IconRegister, tileTopName);
        tileBottom = TextureHelper.getIconFromTextureName(par1IconRegister, tileBottomName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return side == 1 ? tileTop : side == 0 ? tileBottom : tileSide;
    }

    /*
     * Mincraft functions to set standard drops and drop-quantities idDropped -> Block ID when dropped quantityDropped -> Ammount of items dropped
     * when broken
     */
    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return blockID;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        return 1;
    }
}
