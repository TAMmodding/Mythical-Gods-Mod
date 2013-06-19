package com.TamModding.mgm.lib;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class Reference {
    /* Basic constants */
    public static final String MOD_ID = "MGM";
    public static final String MOD_NAME = "Mythical Gods Mod";
    public static final String VERSION = "FOR TESTERS ONLY!";
    public static final String SERVER_PROXY_CLASS = "com.TamModding.mgm.proxy.CommonProxyMythicalGods";
    public static final String CLIENT_PROXY_CLASS = "com.TamModding.mgm.proxy.ClientProxyMythicalGods";
    public static final String CHANNEL_NAME = MOD_ID;

    /* Filepath Related Constants */
    public static final String RESOURCE_FOLDER = MOD_ID;
    public static final String PATH_RESOURCES = "/mods/" + RESOURCE_FOLDER + "/";
    public static final String PATH_TEXTURES = PATH_RESOURCES + "textures/";
    public static final String PATH_ARMOR = PATH_TEXTURES + "armor/";
    public static final String PATH_ENTITYS = PATH_TEXTURES + "mobs/";

    /* Paths to the cape files */
    public static final String PATH_CAPES_DEV = "http://tammodding.com/capes/dev.png";
    public static final String PATH_CAPES_TESTER = "http://tammodding.com/capes/tester.png";
    public static final String HTTP_CAPES_DEV = "http://tammodding.com/capes/dev.txt";
    public static final String HTTP_CAPES_TESTER = "http://tammodding.com/capes/tester.txt";
    public static final int CAPE_TICK_SKIP = 200; // Time in ticks (20 tick = 1 sec)

}
