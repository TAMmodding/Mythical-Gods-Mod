package com.TamModding.mgm.proxy;

import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import com.TamModding.mgm.MythicalGods;
import com.TamModding.mgm.weapons.models.ModelLyre;
import com.TamModding.mgm.weapons.render.RenderModelLyre;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class ClientProxyMythicalGods extends CommonProxyMythicalGods {
    @Override
    public void registerRenderThings() {
        
        MinecraftForgeClient.registerItemRenderer(MythicalGods.new3DItem.itemID, (IItemRenderer)new RenderModelLyre());

    }
    
   
}
