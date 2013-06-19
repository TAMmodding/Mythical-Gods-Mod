package com.TamModding.mgm.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding Copyright (c) 2013
 */
public class CommonProxyMythicalGods implements IGuiHandler {
    public void registerRenderThings() {

    }

    public void registerSoundHandler() {

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        return null;

    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        return null;

    }

}
