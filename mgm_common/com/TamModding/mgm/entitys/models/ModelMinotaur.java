package com.TamModding.mgm.entitys.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */


public class ModelMinotaur extends ModelBase
{
  //fields
    ModelRenderer Nose;
    ModelRenderer Arm_joint1;
    ModelRenderer Arm_joint2;
    ModelRenderer Arm_joint3;
    ModelRenderer Arm_joint4;
    ModelRenderer HeadJoint5;
    ModelRenderer Bicep1;
    ModelRenderer Bicep2;
    ModelRenderer Eyebrows1;
    ModelRenderer Eyebrows2;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg7;
    ModelRenderer leg8;
    ModelRenderer horn1;
    ModelRenderer horn2;
    ModelRenderer horn3;
    ModelRenderer horn4;
    ModelRenderer Lower_Body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg5;
    ModelRenderer leg6;
    ModelRenderer Chest_1;
    ModelRenderer Chest_2;
    ModelRenderer Packs1;
    ModelRenderer Packs2;
  
  public ModelMinotaur()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Nose = new ModelRenderer(this, 47, 1);
      Nose.addBox(0F, 0F, 0F, 6, 3, 2);
      Nose.setRotationPoint(-3F, -24F, -7F);
      Nose.setTextureSize(128, 128);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Arm_joint1 = new ModelRenderer(this, 66, 28);
      Arm_joint1.addBox(0F, 0F, 0F, 3, 2, 3);
      Arm_joint1.setRotationPoint(9.5F, -8F, -1.5F);
      Arm_joint1.setTextureSize(128, 128);
      Arm_joint1.mirror = true;
      setRotation(Arm_joint1, -0.0371786F, 0F, -0.2602503F);
      Arm_joint2 = new ModelRenderer(this, 66, 28);
      Arm_joint2.addBox(-3F, 0F, 0F, 3, 2, 3);
      Arm_joint2.setRotationPoint(-8.5F, -8F, -0.5F);
      Arm_joint2.setTextureSize(128, 128);
      Arm_joint2.mirror = true;
      setRotation(Arm_joint2, -0.4089647F, 0F, 0.2602503F);
      Arm_joint3 = new ModelRenderer(this, 89, 25);
      Arm_joint3.addBox(0F, 0F, 0F, 5, 2, 5);
      Arm_joint3.setRotationPoint(3.5F, 10F, -3.6F);
      Arm_joint3.setTextureSize(128, 128);
      Arm_joint3.mirror = true;
      setRotation(Arm_joint3, 0F, 0F, 0F);
      Arm_joint4 = new ModelRenderer(this, 89, 25);
      Arm_joint4.addBox(-3F, 0F, 0F, 5, 2, 5);
      Arm_joint4.setRotationPoint(-5.5F, 10F, -3.6F);
      Arm_joint4.setTextureSize(128, 128);
      Arm_joint4.mirror = true;
      setRotation(Arm_joint4, 0F, 0F, 0F);
      HeadJoint5 = new ModelRenderer(this, 1, 26);
      HeadJoint5.addBox(0F, 0F, 0F, 6, 4, 4);
      HeadJoint5.setRotationPoint(-3F, -23F, -5F);
      HeadJoint5.setTextureSize(128, 128);
      HeadJoint5.mirror = true;
      setRotation(HeadJoint5, 0F, 0F, 0F);
      Bicep1 = new ModelRenderer(this, 92, 0);
      Bicep1.addBox(0F, 0F, 0F, 4, 7, 6);
      Bicep1.setRotationPoint(-11F, -16F, -4F);
      Bicep1.setTextureSize(128, 128);
      Bicep1.mirror = true;
      setRotation(Bicep1, 0.1487144F, 0F, 0.2230717F);
      Bicep2 = new ModelRenderer(this, 92, 0);
      Bicep2.addBox(0F, 0F, 0F, 4, 7, 6);
      Bicep2.setRotationPoint(8F, -16F, -5F);
      Bicep2.setTextureSize(128, 128);
      Bicep2.mirror = true;
      setRotation(Bicep2, 0.1487144F, 0.1115358F, -0.240525F);
      Eyebrows1 = new ModelRenderer(this, 33, 29);
      Eyebrows1.addBox(0F, 0F, 0F, 2, 1, 1);
      Eyebrows1.setRotationPoint(-3F, -27F, -7F);
      Eyebrows1.setTextureSize(128, 128);
      Eyebrows1.mirror = true;
      setRotation(Eyebrows1, 0F, 0F, 0.4089647F);
      Eyebrows2 = new ModelRenderer(this, 33, 29);
      Eyebrows2.addBox(0F, 0F, 0F, 2, 1, 1);
      Eyebrows2.setRotationPoint(1F, -26F, -7F);
      Eyebrows2.setTextureSize(128, 128);
      Eyebrows2.mirror = true;
      setRotation(Eyebrows2, 0F, 0F, -0.4089656F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -4F, -6F, 8, 8, 6);
      head.setRotationPoint(0F, -24F, 0F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 49, 78);
      body.addBox(-6F, -10F, -7F, 12, 18, 10);
      body.setRotationPoint(0F, -10F, 1F);
      body.setTextureSize(128, 128);
      body.mirror = true;
      setRotation(body, 0.2664467F, 0F, 0F);
      leg7 = new ModelRenderer(this, 95, 65);
      leg7.addBox(-4F, -9F, 3F, 4, 14, 4);
      leg7.setRotationPoint(-9F, -5.6F, -9F);
      leg7.setTextureSize(128, 128);
      leg7.mirror = true;
      setRotation(leg7, -0.8938358F, 0F, 0.1115358F);
      leg8 = new ModelRenderer(this, 95, 65);
      leg8.addBox(0F, 0F, -3F, 4, 14, 4);
      leg8.setRotationPoint(9F, -6.6F, 0F);
      leg8.setTextureSize(128, 128);
      leg8.mirror = true;
      setRotation(leg8, -0.8194786F, 0F, 0F);
      horn1 = new ModelRenderer(this, 57, 58);
      horn1.addBox(-4F, -5F, -4F, 1, 4, 1);
      horn1.setRotationPoint(-1F, -29.5F, 1F);
      horn1.setTextureSize(128, 128);
      horn1.mirror = true;
      setRotation(horn1, 0.6320364F, -0.0197253F, -0.4848711F);
      horn2 = new ModelRenderer(this, 57, 58);
      horn2.addBox(3F, -5F, -4F, 1, 4, 1);
      horn2.setRotationPoint(0F, -26.5F, 1F);
      horn2.setTextureSize(128, 128);
      horn2.mirror = true;
      setRotation(horn2, 0.2094395F, 0F, 0.2617994F);
      horn3 = new ModelRenderer(this, 55, 59);
      horn3.addBox(0F, 0F, 0F, 1, 3, 1);
      horn3.setRotationPoint(-5.2F, -32.5F, -5.3F);
      horn3.setTextureSize(128, 128);
      horn3.mirror = true;
      setRotation(horn3, 0F, 0F, 0F);
      horn4 = new ModelRenderer(this, 53, 59);
      horn4.addBox(-1F, 0F, 0F, 1, 3, 1);
      horn4.setRotationPoint(4.8F, -32.5F, -4F);
      horn4.setTextureSize(128, 128);
      horn4.mirror = true;
      setRotation(horn4, 0F, 0F, 0F);
      Lower_Body = new ModelRenderer(this, 74, 52);
      Lower_Body.addBox(0F, 0F, 0F, 12, 6, 4);
      Lower_Body.setRotationPoint(-6F, -3F, 3F);
      Lower_Body.setTextureSize(128, 128);
      Lower_Body.mirror = true;
      setRotation(Lower_Body, -1.51761F, 0F, 0F);
      leg1 = new ModelRenderer(this, 42, 109);
      leg1.addBox(0F, 0F, 0F, 5, 12, 5);
      leg1.setRotationPoint(6F, -18F, -4F);
      leg1.setTextureSize(128, 128);
      leg1.mirror = true;
      setRotation(leg1, 0.1373543F, -0.0371786F, -0.2230717F);
      leg2 = new ModelRenderer(this, 42, 109);
      leg2.addBox(-4F, 0F, 0F, 5, 12, 5);
      leg2.setRotationPoint(-6F, -18F, -3F);
      leg2.setTextureSize(128, 128);
      leg2.mirror = true;
      setRotation(leg2, 0.1373543F, 0.0371786F, 0.2230717F);
      leg3 = new ModelRenderer(this, 0, 82);
      leg3.addBox(0F, 0F, 0F, 8, 12, 7);
      leg3.setRotationPoint(2F, -1F, -3F);
      leg3.setTextureSize(128, 128);
      leg3.mirror = true;
      setRotation(leg3, -0.1745329F, 0F, 0F);
      leg4 = new ModelRenderer(this, 1, 82);
      leg4.addBox(-4F, 0F, 0F, 8, 12, 7);
      leg4.setRotationPoint(-6F, -1F, -3F);
      leg4.setTextureSize(128, 128);
      leg4.mirror = true;
      setRotation(leg4, -0.1745329F, 0F, 0F);
      leg5 = new ModelRenderer(this, 87, 17);
      leg5.addBox(0F, 0F, 0F, 6, 12, 6);
      leg5.setRotationPoint(3F, 12F, -4F);
      leg5.setTextureSize(128, 128);
      leg5.mirror = true;
      setRotation(leg5, 0F, 0F, 0F);
      leg6 = new ModelRenderer(this, 87, 17);
      leg6.addBox(-4F, 0F, 0F, 6, 12, 6);
      leg6.setRotationPoint(-5F, 12F, -4F);
      leg6.setTextureSize(128, 128);
      leg6.mirror = true;
      setRotation(leg6, 0F, 0F, 0F);
      Chest_1 = new ModelRenderer(this, 64, 10);
      Chest_1.addBox(0F, 0F, 0F, 5, 7, 2);
      Chest_1.setRotationPoint(1F, -15F, -9F);
      Chest_1.setTextureSize(128, 128);
      Chest_1.mirror = true;
      setRotation(Chest_1, 0.2602503F, 0F, 0F);
      Chest_2 = new ModelRenderer(this, 64, 10);
      Chest_2.addBox(0F, 0F, 0F, 5, 7, 2);
      Chest_2.setRotationPoint(-6F, -15F, -9F);
      Chest_2.setTextureSize(128, 128);
      Chest_2.mirror = true;
      setRotation(Chest_2, 0.2602503F, 0F, 0F);
      Packs1 = new ModelRenderer(this, 72, 0);
      Packs1.addBox(0F, 0F, 0F, 6, 1, 1);
      Packs1.setRotationPoint(-3F, -7F, -5F);
      Packs1.setTextureSize(128, 128);
      Packs1.mirror = true;
      setRotation(Packs1, -1.264073F, 0F, 0F);
      Packs2 = new ModelRenderer(this, 73, 0);
      Packs2.addBox(0F, 0F, 0F, 4, 1, 1);
      Packs2.setRotationPoint(-2F, -4F, -5F);
      Packs2.setTextureSize(128, 128);
      Packs2.mirror = true;
      setRotation(Packs2, 0.2974289F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);

    GL11.glTranslatef(0F, -6F, 0F);
    GL11.glScalef(5F, 5F, 5F);//HERE


    Nose.render(f5);
    Arm_joint1.render(f5);
    Arm_joint2.render(f5);
    Arm_joint3.render(f5);
    Arm_joint4.render(f5);
    HeadJoint5.render(f5);
    Bicep1.render(f5);
    Bicep2.render(f5);
    Eyebrows1.render(f5);
    Eyebrows2.render(f5);
    head.render(f5);
    body.render(f5);
    leg7.render(f5);
    leg8.render(f5);
    horn1.render(f5);
    horn2.render(f5);
    horn3.render(f5);
    horn4.render(f5);
    Lower_Body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    leg5.render(f5);
    leg6.render(f5);
    Chest_1.render(f5);
    Chest_2.render(f5);
    Packs1.render(f5);
    Packs2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
