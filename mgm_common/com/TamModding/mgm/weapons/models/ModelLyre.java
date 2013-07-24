package com.TamModding.mgm.weapons.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;



public class ModelLyre extends ModelBase
{
    //fields
    ModelRenderer Lyre1;
    ModelRenderer Lyre2;
    ModelRenderer Lyre3;
    ModelRenderer Lyre4;
    ModelRenderer Lyre5;
    ModelRenderer Lyre6;
    ModelRenderer Lyre7;
    ModelRenderer Lyre8;
    ModelRenderer string1;
    ModelRenderer string2;
    ModelRenderer string3;
    ModelRenderer string4;
    ModelRenderer string5;

    public ModelLyre()
    {
        textureWidth = 32;
        textureHeight = 32;

        Lyre1 = new ModelRenderer(this, 4, 0);
        Lyre1.addBox(-3F, 9F, 2F, 6, 1, 1);
        Lyre1.setRotationPoint(0F, 0F, 0F);
        Lyre1.setTextureSize(32, 32);
        Lyre1.mirror = true;
        setRotation(Lyre1, 0F, 0F, 0F);
        Lyre2 = new ModelRenderer(this, 18, 0);
        Lyre2.addBox(-4F, 5F, 2F, 1, 4, 1);
        Lyre2.setRotationPoint(0F, 0F, 0F);
        Lyre2.setTextureSize(32, 32);
        Lyre2.mirror = true;
        setRotation(Lyre2, 0F, 0F, 0F);
        Lyre3 = new ModelRenderer(this, 18, 0);
        Lyre3.addBox(3F, 5F, 2F, 1, 4, 1);
        Lyre3.setRotationPoint(0F, 0F, 0F);
        Lyre3.setTextureSize(32, 32);
        Lyre3.mirror = true;
        setRotation(Lyre3, 0F, 0F, 0F);
        Lyre4 = new ModelRenderer(this, 28, 0);
        Lyre4.addBox(-3F, 3F, 2F, 1, 2, 1);
        Lyre4.setRotationPoint(0F, 0F, 0F);
        Lyre4.setTextureSize(32, 32);
        Lyre4.mirror = true;
        setRotation(Lyre4, 0F, 0F, 0F);
        Lyre5 = new ModelRenderer(this, 22, 0);
        Lyre5.addBox(-5F, 2F, 2F, 2, 1, 1);
        Lyre5.setRotationPoint(0F, 0F, 0F);
        Lyre5.setTextureSize(32, 32);
        Lyre5.mirror = true;
        setRotation(Lyre5, 0F, 0F, 0F);
        Lyre6 = new ModelRenderer(this, 28, 0);
        Lyre6.addBox(2F, 3F, 2F, 1, 2, 1);
        Lyre6.setRotationPoint(0F, 0F, 0F);
        Lyre6.setTextureSize(32, 32);
        Lyre6.mirror = true;
        setRotation(Lyre6, 0F, 0F, 0F);
        Lyre7 = new ModelRenderer(this, 22, 0);
        Lyre7.addBox(3F, 2F, 2F, 2, 1, 1);
        Lyre7.setRotationPoint(0F, 0F, 0F);
        Lyre7.setTextureSize(32, 32);
        Lyre7.mirror = true;
        setRotation(Lyre7, 0F, 0F, 0F);
        Lyre8 = new ModelRenderer(this, 4, 2);
        Lyre8.addBox(-2F, 2F, 2F, 4, 1, 1);
        Lyre8.setRotationPoint(0F, 0F, 0F);
        Lyre8.setTextureSize(32, 32);
        Lyre8.mirror = true;
        setRotation(Lyre8, 0F, 0F, 0F);
        string1 = new ModelRenderer(this, 2, 0);
        string1.addBox(2F, 5F, 2F, 0, 4, 1);
        string1.setRotationPoint(0F, 0F, 0F);
        string1.setTextureSize(32, 32);
        string1.mirror = true;
        setRotation(string1, 0F, 0F, 0F);
        string2 = new ModelRenderer(this, 0, 0);
        string2.addBox(1F, 3F, 2F, 0, 6, 1);
        string2.setRotationPoint(0F, 0F, 0F);
        string2.setTextureSize(32, 32);
        string2.mirror = true;
        setRotation(string2, 0F, 0F, 0F);
        string3 = new ModelRenderer(this, 0, 0);
        string3.addBox(0F, 3F, 2F, 0, 6, 1);
        string3.setRotationPoint(0F, 0F, 0F);
        string3.setTextureSize(32, 32);
        string3.mirror = true;
        setRotation(string3, 0F, 0F, 0F);
        string4 = new ModelRenderer(this, 0, 0);
        string4.addBox(-1F, 3F, 2F, 0, 6, 1);
        string4.setRotationPoint(0F, 0F, 0F);
        string4.setTextureSize(32, 32);
        string4.mirror = true;
        setRotation(string4, 0F, 0F, 0F);
        string5 = new ModelRenderer(this, 2, 0);
        string5.addBox(-2F, 5F, 2F, 0, 4, 1);
        string5.setRotationPoint(0F, 0F, 0F);
        string5.setTextureSize(32, 32);
        string5.mirror = true;
        setRotation(string5, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Lyre1.render(f5);
        Lyre2.render(f5);
        Lyre3.render(f5);
        Lyre4.render(f5);
        Lyre5.render(f5);
        Lyre6.render(f5);
        Lyre7.render(f5);
        Lyre8.render(f5);
        string1.render(f5);
        string2.render(f5);
        string3.render(f5);
        string4.render(f5);
        string5.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = 1;
        model.rotateAngleY = 1;
        model.rotateAngleZ = 1;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
    }

}

