package com.TamModding.mgm.sound;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MGM_SoundLoadEvent {
    
    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) {
            Minecraft mc = Minecraft.getMinecraft();
            event.manager.soundPoolSounds.addSound("sound/CowMooSoundEffect.ogg", new File(mc.mcDataDir, "resources/mods/MGM/sounds/sound/CowMooSoundEffect.ogg"));
            event.manager.soundPoolSounds.addSound("sound/CowMooSoundEffect1.ogg", new File(mc.mcDataDir, "resources/mods/MGM/sounds/sound/CowMooSoundEffect1.ogg"));
    }

}
