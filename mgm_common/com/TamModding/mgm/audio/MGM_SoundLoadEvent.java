package com.TamModding.mgm.audio;

import java.io.File;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class MGM_SoundLoadEvent {

@SideOnly(Side.CLIENT)
@ForgeSubscribe
public void onSoundLoad(SoundLoadEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        									  //Basically what you want the thing to be. if its "MGM/TEST" then for the mob it would be "MGM.TEST"
        event.manager.soundPoolSounds.addSound("MGM/TEST.ogg", new File(mc.mcDataDir, "resources/mod/MGM/TEST.ogg"));
        
        //The path for the sound would be FOR ME ANYWAY (The_Slayer) "mcp/jars/resources/mod/MGM/TEST.ogg"
        //If you have a different setup, find your resources folder.
        
        //For a mob: for eg. protected String getLivingSound(){
        				   //return "MGM.TEST"
        				   //} 
	}
}