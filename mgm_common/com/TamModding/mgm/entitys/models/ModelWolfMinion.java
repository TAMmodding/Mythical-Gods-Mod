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
public class ModelWolfMinion extends ModelBase {
    // fields
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer collar;
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Leg5;
    ModelRenderer Leg6;

    public ModelWolfMinion() {
        textureWidth = 64;
        textureHeight = 32;

        Shape3 = new ModelRenderer(this, 0, 0);
        Shape3.addBox(0F, 0F, 0F, 2, 1, 4);
        Shape3.setRotationPoint(1.5F, 23F, -9F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 0, 0);
        Shape4.addBox(0F, 0F, 0F, 2, 1, 4);
        Shape4.setRotationPoint(-5.5F, 23F, -9F);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 23, 24);
        Shape5.addBox(-1F, -1F, 0F, 2, 2, 2);
        Shape5.setRotationPoint(-1F, 13.5F, -8F);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 0, 0);
        Shape6.addBox(0F, 0F, 0F, 2, 1, 4);
        Shape6.setRotationPoint(0F, 23F, 4F);
        Shape6.setTextureSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 0, 0);
        Shape7.addBox(0F, 0F, 0F, 2, 1, 4);
        Shape7.setRotationPoint(-4F, 23F, 4F);
        Shape7.setTextureSize(64, 32);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        collar = new ModelRenderer(this, 42, 26);
        collar.addBox(-3F, -2F, 0F, 6, 5, 1);
        collar.setRotationPoint(-1F, 13F, -7F);
        collar.setTextureSize(64, 32);
        collar.mirror = true;
        setRotation(collar, 0F, 0F, 0F);
        WolfHead = new ModelRenderer(this, 0, 0);
        WolfHead.addBox(-3F, -3F, -2F, 6, 6, 4);
        WolfHead.setRotationPoint(-1F, 13.5F, -10F);
        WolfHead.setTextureSize(64, 32);
        WolfHead.mirror = true;
        setRotation(WolfHead, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 18, 14);
        Body.addBox(-4F, -2F, -3F, 6, 9, 6);
        Body.setRotationPoint(0F, 14F, 2F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 1.570796F, 0F, 0F);
        Mane = new ModelRenderer(this, 21, 0);
        Mane.addBox(-4F, -3F, -3F, 8, 6, 7);
        Mane.setRotationPoint(-1F, 14F, -3F);
        Mane.setTextureSize(64, 32);
        Mane.mirror = true;
        setRotation(Mane, 1.570796F, 0F, 0F);
        Leg1 = new ModelRenderer(this, 0, 18);
        Leg1.addBox(-1F, 0F, -1F, 2, 4, 2);
        Leg1.setRotationPoint(-2.5F, 16F, 7F);
        Leg1.setTextureSize(64, 32);
        Leg1.mirror = true;
        setRotation(Leg1, -0.1487144F, 0F, 0F);
        Leg2 = new ModelRenderer(this, 0, 18);
        Leg2.addBox(-1F, 0F, -1F, 2, 4, 2);
        Leg2.setRotationPoint(0.5F, 16F, 7F);
        Leg2.setTextureSize(64, 32);
        Leg2.mirror = true;
        setRotation(Leg2, -0.1487195F, 0F, 0F);
        Leg3 = new ModelRenderer(this, 0, 18);
        Leg3.addBox(-1F, 0F, -1F, 2, 8, 2);
        Leg3.setRotationPoint(-4.5F, 16F, -4F);
        Leg3.setTextureSize(64, 32);
        Leg3.mirror = true;
        setRotation(Leg3, -0.3271718F, 0F, 0F);
        Leg4 = new ModelRenderer(this, 0, 18);
        Leg4.addBox(-1F, 0F, -1F, 2, 8, 2);
        Leg4.setRotationPoint(2.5F, 16F, -4F);
        Leg4.setTextureSize(64, 32);
        Leg4.mirror = true;
        setRotation(Leg4, -0.3271794F, 0F, 0F);
        Tail = new ModelRenderer(this, 9, 18);
        Tail.addBox(-1F, 0F, -1F, 2, 4, 2);
        Tail.setRotationPoint(-1F, 12F, 8F);
        Tail.setTextureSize(64, 32);
        Tail.mirror = true;
        setRotation(Tail, 1.130069F, 0F, 0F);
        Ear1 = new ModelRenderer(this, 16, 14);
        Ear1.addBox(-3F, -5F, 0F, 2, 2, 1);
        Ear1.setRotationPoint(-1F, 13.5F, -10F);
        Ear1.setTextureSize(64, 32);
        Ear1.mirror = true;
        setRotation(Ear1, 0.1487195F, 0F, 0F);
        Ear2 = new ModelRenderer(this, 16, 14);
        Ear2.addBox(1F, -5F, 0F, 2, 2, 1);
        Ear2.setRotationPoint(-1F, 13.5F, -10F);
        Ear2.setTextureSize(64, 32);
        Ear2.mirror = true;
        setRotation(Ear2, 0.1487144F, 0F, 0F);
        Nose = new ModelRenderer(this, 0, 10);
        Nose.addBox(-2F, 0F, -5F, 3, 3, 4);
        Nose.setRotationPoint(-0.5F, 13.5F, -10F);
        Nose.setTextureSize(64, 32);
        Nose.mirror = true;
        setRotation(Nose, 0F, 0F, 0F);
        Tail2 = new ModelRenderer(this, 19, 20);
        Tail2.addBox(-6F, 0F, 0F, 3, 5, 3);
        Tail2.setRotationPoint(3.5F, 15.5F, 10.5F);
        Tail2.setTextureSize(64, 32);
        Tail2.mirror = true;
        setRotation(Tail2, 1.486984F, 0F, 0F);
        Tail3 = new ModelRenderer(this, 9, 18);
        Tail3.addBox(0F, 0F, 0F, 2, 4, 2);
        Tail3.setRotationPoint(-2F, 15.58667F, 15.53333F);
        Tail3.setTextureSize(64, 32);
        Tail3.mirror = true;
        setRotation(Tail3, 1.933124F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 23, 15);
        Shape1.addBox(0F, 0F, 0F, 1, 7, 7);
        Shape1.setRotationPoint(-6F, 13F, -8F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0.4461433F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 23, 15);
        Shape2.addBox(0F, 0F, 0F, 1, 7, 7);
        Shape2.setRotationPoint(3F, 13F, -8F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0.4461411F, 0F, 0F);
        Leg5 = new ModelRenderer(this, 0, 18);
        Leg5.addBox(0F, 0F, 0F, 2, 4, 2);
        Leg5.setRotationPoint(-0.5F, 20F, 5.5F);
        Leg5.setTextureSize(64, 32);
        Leg5.mirror = true;
        setRotation(Leg5, 0.1487195F, 0F, 0F);
        Leg6 = new ModelRenderer(this, 0, 18);
        Leg6.addBox(0F, 0F, 0F, 2, 4, 2);
        Leg6.setRotationPoint(-3.5F, 20F, 5.5F);
        Leg6.setTextureSize(64, 32);
        Leg6.mirror = true;
        setRotation(Leg6, 0.1487195F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
        collar.render(f5);
        WolfHead.render(f5);
        Body.render(f5);
        Mane.render(f5);
        Leg1.render(f5);
        Leg2.render(f5);
        Leg3.render(f5);
        Leg4.render(f5);
        Tail.render(f5);
        Ear1.render(f5);
        Ear2.render(f5);
        Nose.render(f5);
        Tail2.render(f5);
        Tail3.render(f5);
        Shape1.render(f5);
        Shape2.render(f5);
        Leg5.render(f5);
        Leg6.render(f5);
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
