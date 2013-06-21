package com.TamModding.mgm.audio;

import java.util.logging.Level;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

import com.TamModding.mgm.lib.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding 
 *      Copyright (c) 2013
 */
public class SoundHandler {

    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) {
        
        
        for(String sound : Sounds.files){
            
            try {
                event.manager.soundPoolSounds.addSound(sound, this.getClass().getResource("/" + sound));
            } catch(Exception e) {
                LogHelper.log(Level.WARNING, "Failed loading Mythical Gods Mod sound: " + sound);
            }
        }
        
        
        
       
    }
}