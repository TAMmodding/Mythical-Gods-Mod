package com.TamModding.mgm.lib.cape;

import java.util.EnumSet;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

import com.TamModding.mgm.lib.Reference;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding (Msvisser)
 * Copyright (c) 2013
 */
public class CapeTickHandler implements ITickHandler {
    private static int tickSkip = 0;
    private static Minecraft mc = Minecraft.getMinecraft();

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData) {
        if (tickSkip >= Reference.CAPE_TICK_SKIP) {
            if (mc.theWorld != null && mc.theWorld.playerEntities.size() > 0) {
                // Player entitys
                @SuppressWarnings("unchecked")
                List<EntityPlayer> playerEnt = mc.theWorld.playerEntities;

                // Loop through all player and check if they are on the list
                for (int players = 0; players < playerEnt.size(); players++) {
                    // Specific player
                    EntityPlayer player = playerEnt.get(players);
                    String playerUsername = player.username.toLowerCase();
                    if (CapeHelper.listDevs.contains(playerUsername)) {
                        player.cloakUrl = Reference.PATH_CAPES_DEV;
                    } else if (CapeHelper.listTesters.contains(playerUsername)) {
                        player.cloakUrl = Reference.PATH_CAPES_TESTER;
                    }
                }
            }

            tickSkip = 0;
        } else {
            tickSkip += 1;
        }
    }

    @Override
    public void tickEnd(EnumSet<TickType> type, Object... tickData) {
    }

    @Override
    public EnumSet<TickType> ticks() {
        return EnumSet.of(TickType.CLIENT);
    }

    @Override
    public String getLabel() {
        return "MGMCapeTickHandler";
    }
}
