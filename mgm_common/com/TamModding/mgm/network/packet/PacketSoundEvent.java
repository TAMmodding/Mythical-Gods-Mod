package com.TamModding.mgm.network.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;

import com.TamModding.mgm.network.MGMPacket;
import com.TamModding.mgm.network.PacketTypeHandler;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.Player;

/**
 * MythicalGods
 *
 * PacketSoundEvent
 *
 * @author BossLetsPlays
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class PacketSoundEvent extends MGMPacket{
    
    public String playerName;
    public String soundName;
    public double x, y, z;
    public float volume, pitch;

    public PacketSoundEvent() {

        super(PacketTypeHandler.SOUND_EVENT, false);
    }

    public PacketSoundEvent(String playerName, String soundName, double x, double y, double z, float volume, float pitch) {

        super(PacketTypeHandler.SOUND_EVENT, false);
        this.playerName = playerName;
        this.soundName = soundName;
        this.x = x;
        this.y = y;
        this.z = z;
        this.volume = volume;
        this.pitch = pitch;
    }

    @Override
    public void writeData(DataOutputStream data) throws IOException {

        data.writeUTF(playerName);
        data.writeUTF(soundName);
        data.writeDouble(x);
        data.writeDouble(y);
        data.writeDouble(z);
        data.writeFloat(volume);
        data.writeFloat(pitch);
    }

    @Override
    public void readData(DataInputStream data) throws IOException {

        playerName = data.readUTF();
        soundName = data.readUTF();
        x = data.readDouble();
        y = data.readDouble();
        z = data.readDouble();
        volume = data.readFloat();
        pitch = data.readFloat();
    }

    @Override
    public void execute(INetworkManager manager, Player player) {

        EntityPlayer thePlayer = (EntityPlayer) player;
        if (thePlayer.username.equalsIgnoreCase(playerName)) {
            FMLClientHandler.instance().getClient().sndManager.playSound(soundName, (float) x, (float) y, (float) z, volume, pitch);
        }
        
    }

}
