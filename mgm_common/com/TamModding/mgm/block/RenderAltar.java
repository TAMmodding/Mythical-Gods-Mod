package com.TamModding.mgm.block;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import com.TamModding.mgm.entitys.models.ModelAltar;
import com.TamModding.mgm.entitys.tileEntitys.TileEntityAltar;


public class RenderAltar extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelAltar modelAltar;

    public RenderAltar()
    {
        modelAltar = new ModelAltar();
    }
    
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityAltar)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityAltar tile, double x, double y, double z, float f)
    {
        int rotation = 0;
        if(tile.worldObj != null)
        {
            rotation = tile.getBlockMetadata();
        }
        
        bindTextureByName("/mods/MGM/textures/blocks/Altar.png");
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y - 0.6F, (float)z + 0.5F);
        GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
        modelAltar.render(0.0625F);
        GL11.glPopMatrix();
    }
    
}
