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
public class ModelFlyPig extends ModelBase {
    // fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;

    public ModelFlyPig() {
        textureWidth = 64;
        textureHeight = 64;

        Shape1 = new ModelRenderer(this, 16, 32);
        Shape1.addBox(0F, 0F, 0F, 6, 6, 12);
        Shape1.setRotationPoint(5F, 11F, -4F);
        Shape1.setTextureSize(64, 64);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 16, 16);
        Shape2.addBox(0F, 0F, 0F, 4, 3, 1);
        Shape2.setRotationPoint(-2F, 12F, -15F);
        Shape2.setTextureSize(64, 64);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 16, 32);
        Shape3.addBox(0F, 0F, 0F, 6, 6, 12);
        Shape3.setRotationPoint(-11F, 11F, -4F);
        Shape3.setTextureSize(64, 64);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 16, 44);
        Shape4.addBox(0F, 0F, 0F, 4, 4, 1);
        Shape4.setRotationPoint(6F, 12F, -5F);
        Shape4.setTextureSize(64, 64);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 16, 44);
        Shape5.addBox(0F, 0F, 0F, 4, 4, 1);
        Shape5.setRotationPoint(-10F, 12F, -5F);
        Shape5.setTextureSize(64, 64);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -4F, -8F, 8, 8, 8);
        head.setRotationPoint(0F, 12F, -6F);
        head.setTextureSize(64, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 28, 8);
        body.addBox(-5F, -10F, -7F, 10, 16, 8);
        body.setRotationPoint(0F, 11F, 3F);
        body.setTextureSize(64, 64);
        body.mirror = true;
        setRotation(body, 1.570796F, 0F, 0F);
        leg1 = new ModelRenderer(this, 0, 16);
        leg1.addBox(-2F, 0F, -2F, 4, 6, 4);
        leg1.setRotationPoint(-3F, 18F, 7F);
        leg1.setTextureSize(64, 64);
        leg1.mirror = true;
        setRotation(leg1, 0F, 0F, 0F);
        leg2 = new ModelRenderer(this, 0, 16);
        leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
        leg2.setRotationPoint(3F, 18F, 7F);
        leg2.setTextureSize(64, 64);
        leg2.mirror = true;
        setRotation(leg2, 0F, 0F, 0F);
        leg3 = new ModelRenderer(this, 0, 16);
        leg3.addBox(-2F, 18F, -2F, 4, 6, 4);
        leg3.setRotationPoint(-3F, 0F, -5F);
        leg3.setTextureSize(64, 64);
        leg3.mirror = true;
        setRotation(leg3, 0F, 0F, 0F);
        leg4 = new ModelRenderer(this, 0, 16);
        leg4.addBox(-2F, 0F, -2F, 4, 6, 4);
        leg4.setRotationPoint(3F, 18F, -5F);
        leg4.setTextureSize(64, 64);
        leg4.mirror = true;
        setRotation(leg4, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
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
