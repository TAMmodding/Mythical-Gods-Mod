package com.TamModding.mgm.network;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

/**
 * MythicalGods
 *
 * PacketHandler
 *
 * @author BossLetsPlays
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class PacketHandler implements IPacketHandler {

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
        
        MGMPacket packetMyth = PacketTypeHandler.buildPacket(packet.data);
        
        packetMyth.execute(manager, player);
    }
    
    
    

}
