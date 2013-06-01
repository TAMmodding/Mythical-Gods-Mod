package com.TamModding.mgm.entitys.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class ModelPiggy extends ModelBase {
    // fields
    ModelRenderer Shape1;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;

    public ModelPiggy() {
        textureWidth = 256;
        textureHeight = 128;

        Shape1 = new ModelRenderer(this, 64, 64);
        Shape1.addBox(0F, 0F, 0F, 16, 12, 4);
        Shape1.setRotationPoint(-8F, -39F, -45F);
        Shape1.setTextureSize(256, 128);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        head = new ModelRenderer(this, 0, 0);
        head.addBox(0F, 0F, 0F, 32, 32, 32);
        head.setRotationPoint(-16F, -55F, -41F);
        head.setTextureSize(256, 128);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 112, 32);
        body.addBox(0F, 0F, 0F, 40, 64, 32);
        body.setRotationPoint(-20F, 0F, -21F);
        body.setTextureSize(256, 128);
        body.mirror = true;
        setRotation(body, 1.570796F, 0F, 0F);
        leg1 = new ModelRenderer(this, 0, 64);
        leg1.addBox(0F, 0F, 0F, 16, 24, 16);
        leg1.setRotationPoint(-19F, 0F, 24F);
        leg1.setTextureSize(256, 128);
        leg1.mirror = true;
        setRotation(leg1, 0F, 0F, 0F);
        leg2 = new ModelRenderer(this, 0, 64);
        leg2.addBox(0F, 0F, 0F, 16, 24, 16);
        leg2.setRotationPoint(3F, 0F, 24F);
        leg2.setTextureSize(256, 128);
        leg2.mirror = true;
        setRotation(leg2, 0F, 0F, 0F);
        leg3 = new ModelRenderer(this, 0, 64);
        leg3.addBox(0F, 0F, 0F, 16, 24, 16);
        leg3.setRotationPoint(-19F, 0F, -17F);
        leg3.setTextureSize(256, 128);
        leg3.mirror = true;
        setRotation(leg3, 0F, 0F, 0F);
        leg4 = new ModelRenderer(this, 0, 64);
        leg4.addBox(0F, 0F, 0F, 16, 24, 16);
        leg4.setRotationPoint(3F, 0F, -17F);
        leg4.setTextureSize(256, 128);
        leg4.mirror = true;
        setRotation(leg4, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
        head.render(f5);
        body.render(f5);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);
        leg4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
