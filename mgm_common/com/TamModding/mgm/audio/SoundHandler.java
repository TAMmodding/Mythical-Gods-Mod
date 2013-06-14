package com.TamModding.mgm.audio;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class SoundHandler {

@SideOnly(Side.CLIENT)
@ForgeSubscribe
public void onSoundLoad(SoundLoadEvent event) {
File dataDir = Minecraft.getMinecraft().mcDataDir;

event.manager.soundPoolSounds.addSound("mod/MGM/CowMooSoundEffect.ogg", new File(
dataDir, "resources/mod/MGM/CowMooSoundEffect.ogg"));


event.manager.soundPoolSounds.addSound("mod/MGM/CowMooSoundEffect1.ogg", new File(
dataDir, "resources/mod/MGM/CowMooSoundEffect1.ogg"));

}
}