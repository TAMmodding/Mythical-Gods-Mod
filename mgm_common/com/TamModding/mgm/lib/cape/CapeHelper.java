package com.TamModding.mgm.lib.cape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ImageBufferDownload;

import com.TamModding.mgm.lib.Reference;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding (Msvisser)
 *         Copyright (c) 2013
 */
public class CapeHelper {
    /* Array lists to save all players with the capes */
    public static ArrayList<String> listDevs = new ArrayList<String>();
    public static ArrayList<String> listTesters = new ArrayList<String>();

    public static void init() {
        // Clear all lists
        listDevs.clear();
        listTesters.clear();
        // Retrieve all players in the lists
        try {
            retrievePlayerData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Obtain texture files
        Minecraft.getMinecraft().renderEngine.obtainImageData(Reference.PATH_CAPES_DEV, new ImageBufferDownload());
        Minecraft.getMinecraft().renderEngine.obtainImageData(Reference.PATH_CAPES_TESTER, new ImageBufferDownload());
        // Register tickhandler to set the capes
        TickRegistry.registerTickHandler(new CapeTickHandler(), Side.CLIENT);
    }

    /**
     * Retrieves the players on the devs and tester list
     */
    public static void retrievePlayerData() throws IOException {
        // Create a buffered reader for the player files
        BufferedReader devsReader = new BufferedReader(new InputStreamReader(new URL(Reference.HTTP_CAPES_DEV).openStream()));
        BufferedReader testersReader = new BufferedReader(new InputStreamReader(new URL(Reference.HTTP_CAPES_TESTER).openStream()));

        String line = "", username = "";
        // Read all lines in devs
        while ((line = devsReader.readLine()) != null) {
            if (!line.startsWith("#")) {
                // Makes the username lowercase and saves it in an array
                username = line.toLowerCase();
                listDevs.add(username);
            }
        }
        // Read all lines in testers
        while ((line = testersReader.readLine()) != null) {
            if (!line.startsWith("#")) {
                // Makes the username lowercase and saves it in an array
                username = line.toLowerCase();
                listTesters.add(username);
            }
        }
    }

}
