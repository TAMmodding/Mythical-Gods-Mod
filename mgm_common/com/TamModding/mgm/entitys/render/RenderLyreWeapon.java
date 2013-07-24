package com.TamModding.mgm.entitys.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.TamModding.mgm.weapons.models.ModelLyre;

public class RenderLyreWeapon implements IItemRenderer {

	protected ModelLyre LyreModel;

	public RenderLyreWeapon(){
		LyreModel = new ModelLyre();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type)
		{
		case EQUIPPED: return true;

		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type){
	case EQUIPPED:
	{
		GL11.glPushMatrix();

		Minecraft.getMinecraft().renderEngine.bindTexture("/mods/MGM/textures/items/lyre.png");

		float scale = 2.0F;
		GL11.glScalef(scale, scale, scale);

		GL11.glRotatef(900F, 15.0F, 500.0F, 15.0F);//TODO This is where you rotate it. You can also have more then one "GL11.glRotatef(float, float, float, float); to make it easier i guess"


		boolean isFirstPerson = false;

		if(data[1] != null && data[1] instanceof EntityPlayer){
			if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F))){
		}
	}

		LyreModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.065F);

		GL11.glPopMatrix();
	}
	default:
		break;
	}
}

}
