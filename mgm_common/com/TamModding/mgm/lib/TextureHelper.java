package com.TamModding.mgm.lib;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class TextureHelper {
    /**
     * Get the texture Icon for the texture name without the MODID
     * 
     * @param iconRegister IconRegister
     * @param name The texture name
     * @return The texture Icon
     */
    public static Icon getIconFromTextureName(IconRegister iconRegister, String name) {
        return iconRegister.registerIcon(Reference.RESOURCE_FOLDER + ":" + name);
    }

}
