package com.TamModding.mgm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

import com.TamModding.mgm.audio.SoundHandler;
import com.TamModding.mgm.creativetab.MythicalGodsTab;
import com.TamModding.mgm.lib.BlockHelper;
import com.TamModding.mgm.lib.EntityHelper;
import com.TamModding.mgm.lib.ItemHelper;
import com.TamModding.mgm.lib.LogHelper;
import com.TamModding.mgm.lib.LootHelper;
import com.TamModding.mgm.lib.RecipeHelper;
import com.TamModding.mgm.lib.Reference;
import com.TamModding.mgm.lib.cape.CapeHelper;
import com.TamModding.mgm.network.PacketHandler;
import com.TamModding.mgm.proxy.CommonProxyMythicalGods;
import com.TamModding.mgm.world.OreWorldGeneratorEnd;
import com.TamModding.mgm.world.OreWorldGeneratorNether;
import com.TamModding.mgm.world.OreWorldGeneratorOverWorld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.MOD_ID }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class MythicalGods {
    
    @Mod.Instance(Reference.MOD_ID)
    public static MythicalGods instance;
   

    // Create the MGM Creative tab
    public static final CreativeTabs mythicalgodsTab = new MythicalGodsTab(Reference.MOD_ID);
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxyMythicalGods proxy;


   
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        // Register the Sound Handler (Client only)
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
        // Initialize the log helper
        LogHelper.init();
        // Initialize the Blocks and Items
        BlockHelper.init();
        ItemHelper.init();
        // Initialize the Recipes and Dungeon loot
        RecipeHelper.init();
        LootHelper.init();
        // Register the OreGenerator
        GameRegistry.registerWorldGenerator(new OreWorldGeneratorEnd());
        GameRegistry.registerWorldGenerator(new OreWorldGeneratorOverWorld());
        GameRegistry.registerWorldGenerator(new OreWorldGeneratorNether());
        // Initialize the CapeHelper
        CapeHelper.init();
        // Initialize the Entitys
        EntityHelper.init();
       
        // Set the name for the creative tab
        LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.MOD_ID, "Mythical Gods Mod");
    }

    @Init
    public void init(FMLInitializationEvent event) {
        // Register Entity renders
        EntityHelper.registerEntityRenders();
        

       
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
    }
}
