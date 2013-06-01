package com.TamModding.mgm.sound;

import net.minecraftforge.client.event.sound.PlaySoundEffectEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MGM_SoundEffectManager {
    
    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundEffectResult(PlaySoundEffectEvent event) {
            if (event.name.equals("random.click")) {
                    event.result = event.manager.soundPoolSounds.getRandomSoundFromSoundPool("MGM.sound.CowMooSoundEffect.ogg");
                    event.result = event.manager.soundPoolSounds.getRandomSoundFromSoundPool("MGM.sound.CowMooSoundEffect1.ogg");
            }
    }
}


