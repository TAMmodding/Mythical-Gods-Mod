package com.TamModding.mgm.block;

import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.TamModding.mgm.entitys.models.ModelAltar;
import com.TamModding.mgm.entitys.tileEntitys.TileEntityAltar;

public class ItemAltarRenderer implements IItemRenderer {

    private ModelAltar AltarModel;
    private float scale = 0.5F;

    public ItemAltarRenderer() {

        AltarModel = new ModelAltar();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {

        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        GL11.glScalef(1.0F, 1.0F, 1.0F);        
        TileEntityRenderer.instance.renderTileEntityAt(new TileEntityAltar(), 0.0D, 0.0D, 0.0D, 0.0F);
        GL11.glPopMatrix();
    }
}