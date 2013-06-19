package com.TamModding.mgm.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;

import com.TamModding.mgm.lib.Reference;
import com.TamModding.mgm.network.packet.PacketSoundEvent;

/**
 * MythicalGods
 *
 * PacketTypeHandler
 *
 * @author BossLetsPlays
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public enum PacketTypeHandler {
    

    SOUND_EVENT(PacketSoundEvent.class);

    private Class<? extends MGMPacket> clazz;

    PacketTypeHandler(Class<? extends MGMPacket> clazz) {

        this.clazz = clazz;
    }

    public static MGMPacket buildPacket(byte[] data) {

        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int selector = bis.read();
        DataInputStream dis = new DataInputStream(bis);

        MGMPacket packet = null;

        try {
            packet = values()[selector].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        packet.readPopulate(dis);

        return packet;
    }

    public static MGMPacket buildPacket(PacketTypeHandler type) {

        MGMPacket packet = null;

        try {
            packet = values()[type.ordinal()].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        return packet;
    }

    public static Packet populatePacket(MGMPacket packetMyth) {

        byte[] data = packetMyth.populate();

        Packet250CustomPayload packet250 = new Packet250CustomPayload();
        packet250.channel = Reference.CHANNEL_NAME;
        packet250.data = data;
        packet250.length = data.length;
        packet250.isChunkDataPacket = packetMyth.isChunkDataPacket;

        return packet250;
    }

}
