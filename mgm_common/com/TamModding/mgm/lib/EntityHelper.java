package com.TamModding.mgm.lib;

import com.TamModding.mgm.entitys.EntityApollo;
import com.TamModding.mgm.entitys.EntityChickenBoss;
import com.TamModding.mgm.entitys.EntityFlyPig;
import com.TamModding.mgm.entitys.EntityHeroBrine;
import com.TamModding.mgm.entitys.EntityMinotaur;
import com.TamModding.mgm.entitys.EntityPiggy;
import com.TamModding.mgm.entitys.EntityShark;
import com.TamModding.mgm.entitys.EntityWolfMinion;
import com.TamModding.mgm.entitys.models.ModelApollo;
import com.TamModding.mgm.entitys.models.ModelChickenBoss;
import com.TamModding.mgm.entitys.models.ModelFlyPig;
import com.TamModding.mgm.entitys.models.ModelHeroBrine;
import com.TamModding.mgm.entitys.models.ModelMinotaur;
import com.TamModding.mgm.entitys.models.ModelPiggy;
import com.TamModding.mgm.entitys.models.ModelShark;
import com.TamModding.mgm.entitys.models.ModelWolfMinion;
import com.TamModding.mgm.entitys.render.RenderApollo;
import com.TamModding.mgm.entitys.render.RenderChickenBoss;
import com.TamModding.mgm.entitys.render.RenderFlyPig;
import com.TamModding.mgm.entitys.render.RenderHeroBrine;
import com.TamModding.mgm.entitys.render.RenderMinotaur;
import com.TamModding.mgm.entitys.render.RenderPiggy;
import com.TamModding.mgm.entitys.render.RenderShark;
import com.TamModding.mgm.entitys.render.RenderWolfMinion;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class EntityHelper {
    public static void init() {
        /* Register Entity IDs and EggColors*/
        registerEntity();
        /* Register Entity names*/
        registerEntityNames();
    }
    
    /**
     * Register the entity IDs and EggColors
     */
    private static void registerEntity() {
        EntityRegistry.registerGlobalEntityID(EntityHeroBrine.class, "HeroNite", ReferenceID.HeroBrine, 0xFFFFFF, 0xF6FF00);
        EntityRegistry.registerGlobalEntityID(EntityFlyPig.class, "FlyPig", ReferenceID.FlyPig, 0xFFFFFF, 0xFF70B8);
        EntityRegistry.registerGlobalEntityID(EntityMinotaur.class, "Minotaur", ReferenceID.Minotaur, 0xFFFFFF, 0xE88300);
        EntityRegistry.registerGlobalEntityID(EntityPiggy.class, "Piggy", ReferenceID.Piggy, 0xFFFFFF, 0xFF70B8);
        EntityRegistry.registerGlobalEntityID(EntityShark.class, "Shark", ReferenceID.Shark, 0xFFFFFF, 0x787878);
        EntityRegistry.registerGlobalEntityID(EntityWolfMinion.class, "WolfMinion", ReferenceID.WolfMinion, 0xFFFFFF, 0xC4C4C4);
        EntityRegistry.registerGlobalEntityID(EntityApollo.class, "Apollo", ReferenceID.Apollo, 0xFFAA00, 0xFFFF55);
        EntityRegistry.registerGlobalEntityID(EntityChickenBoss.class, "ChickenBoss", ReferenceID.ChickenBoss, 0xAAAAAA, 0xFFFFFF);
    }
    
    /**
     * Register entity names
     */
    private static void registerEntityNames() {
        LanguageRegistry.instance().addStringLocalization("entity.HeroNite.name", "Final Boss: HeroNite");
        LanguageRegistry.instance().addStringLocalization("entity.FlyPig.name", "Flying Pig");
        LanguageRegistry.instance().addStringLocalization("entity.Minotaur.name", "Boss: Minotaur");
        LanguageRegistry.instance().addStringLocalization("entity.Piggy.name", "Boss: Giant Jeffery");
        LanguageRegistry.instance().addStringLocalization("entity.Shark.name", "Shark");
        LanguageRegistry.instance().addStringLocalization("entity.WolfMinion.name", "Wolf Minion");
        LanguageRegistry.instance().addStringLocalization("entity.Apollo.name", "God Of Music: Apollo");
        LanguageRegistry.instance().addStringLocalization("entity.ChickenBoss.name", "Boss: Giant Chixy");
        
    }
    
    /**
     * Register entity renders
     */
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFlyPig.class, new RenderFlyPig(new ModelFlyPig(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new RenderMinotaur(new ModelMinotaur(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPiggy.class, new RenderPiggy(new ModelPiggy(), 2.3F));
        RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderShark(new ModelShark(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWolfMinion.class, new RenderWolfMinion(new ModelWolfMinion(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHeroBrine.class, new RenderHeroBrine(new ModelHeroBrine(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityApollo.class, new RenderApollo(new ModelApollo(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityChickenBoss.class, new RenderChickenBoss(new ModelChickenBoss(), 2.3F));
    }
}
