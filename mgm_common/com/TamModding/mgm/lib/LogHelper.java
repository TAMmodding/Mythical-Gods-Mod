package com.TamModding.mgm.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;
/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class LogHelper {

    private static Logger MGMLogger = Logger.getLogger(Reference.MOD_ID);

    public static void init() {

        MGMLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        MGMLogger.log(logLevel, message);
    }

}
