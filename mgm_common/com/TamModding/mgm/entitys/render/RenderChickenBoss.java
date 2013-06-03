package com.TamModding.mgm.entitys.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

import com.TamModding.mgm.entitys.EntityChickenBoss;
import com.TamModding.mgm.entitys.models.ModelChickenBoss;


/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */

public class RenderChickenBoss extends RenderLiving {
    protected ModelChickenBoss model;

    public RenderChickenBoss(ModelBase modelChickenBoss, float par2) {
        super(modelChickenBoss, par2);
        model = (ModelChickenBoss) mainModel;
    }

    public void renderChickenBoss(EntityChickenBoss par1EntityChickenBoss, double par2, double par4, double par6, float par8, float par9) {
        super.doRenderLiving(par1EntityChickenBoss, par2, par4, par6, par8, par9);
    }

    @Override
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        this.renderChickenBoss((EntityChickenBoss) par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    @Override
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        this.renderChickenBoss((EntityChickenBoss) par1Entity, par2, par4, par6, par8, par9);
    }

}

