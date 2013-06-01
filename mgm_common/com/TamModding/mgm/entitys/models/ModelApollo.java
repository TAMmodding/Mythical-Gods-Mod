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

;

public class ModelApollo extends ModelBase
{
  //fields
    ModelRenderer Tunic;
    ModelRenderer Belt;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer LeftFeet;
    ModelRenderer RightFeet;
    ModelRenderer Collar;
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer Crest;
    ModelRenderer Crest2;
    ModelRenderer Crest3;
    ModelRenderer Crest4;
    ModelRenderer Crest5;
    ModelRenderer Crest6;
    ModelRenderer leftarm;
    ModelRenderer rightarm;
  
  public ModelApollo()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Tunic = new ModelRenderer(this, 76, 17);
      Tunic.addBox(-4.5F, 11F, -2.5F, 9, 10, 5);
      Tunic.setRotationPoint(0F, 0F, 0F);
      Tunic.setTextureSize(128, 32);
      Tunic.mirror = true;
      setRotation(Tunic, 0F, 0F, 0F);
      Belt = new ModelRenderer(this, 104, 29);
      Belt.addBox(-2F, 11F, -3F, 4, 2, 1);
      Belt.setRotationPoint(0F, 0F, 0F);
      Belt.setTextureSize(128, 32);
      Belt.mirror = true;
      setRotation(Belt, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 10, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(128, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 10, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(128, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      LeftFeet = new ModelRenderer(this, 56, 24);
      LeftFeet.addBox(0F, 22F, -4F, 4, 2, 6);
      LeftFeet.setRotationPoint(0F, 0F, 0F);
      LeftFeet.setTextureSize(128, 32);
      LeftFeet.mirror = true;
      setRotation(LeftFeet, 0F, 0F, 0F);
      RightFeet = new ModelRenderer(this, 56, 24);
      RightFeet.addBox(-4F, 22F, -4F, 4, 2, 6);
      RightFeet.setRotationPoint(0F, 0F, 0F);
      RightFeet.setTextureSize(128, 32);
      RightFeet.mirror = true;
      setRotation(RightFeet, 0F, 0F, 0F);
      Collar = new ModelRenderer(this, 104, 26);
      Collar.addBox(-1F, 3F, -2.5F, 2, 2, 1);
      Collar.setRotationPoint(0F, 0F, 0F);
      Collar.setTextureSize(128, 32);
      Collar.mirror = true;
      setRotation(Collar, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Crest = new ModelRenderer(this, 32, 11);
      Crest.addBox(-1F, -12F, -1F, 2, 4, 1);
      Crest.setRotationPoint(0F, 0F, 0F);
      Crest.setTextureSize(128, 32);
      Crest.mirror = true;
      setRotation(Crest, 0.3885165F, 0F, 0F);
      Crest2 = new ModelRenderer(this, 38, 11);
      Crest2.addBox(-1F, -11F, 1F, 2, 4, 1);
      Crest2.setRotationPoint(0F, 0F, 0F);
      Crest2.setTextureSize(128, 32);
      Crest2.mirror = true;
      setRotation(Crest2, 0.3490659F, 0F, 0F);
      Crest3 = new ModelRenderer(this, 44, 12);
      Crest3.addBox(-1F, -8.2F, 5F, 2, 3, 1);
      Crest3.setRotationPoint(0F, 0F, 0F);
      Crest3.setTextureSize(128, 32);
      Crest3.mirror = true;
      setRotation(Crest3, 0.5235988F, 0F, 0F);
      Crest4 = new ModelRenderer(this, 44, 12);
      Crest4.addBox(-1F, -8.2F, 5F, 2, 3, 1);
      Crest4.setRotationPoint(0F, 0F, -1F);
      Crest4.setTextureSize(128, 32);
      Crest4.mirror = true;
      setRotation(Crest4, 0.5235988F, 0F, 0F);
      Crest5 = new ModelRenderer(this, 32, 11);
      Crest5.addBox(-1F, -11F, 1F, 2, 4, 1);
      Crest5.setRotationPoint(0F, 0F, 1F);
      Crest5.setTextureSize(128, 32);
      Crest5.mirror = true;
      setRotation(Crest5, 0.3513317F, 0F, 0F);
      Crest6 = new ModelRenderer(this, 32, 11);
      Crest6.addBox(-1F, -12F, -1F, 2, 4, 1);
      Crest6.setRotationPoint(0F, 0F, 1F);
      Crest6.setTextureSize(128, 32);
      Crest6.mirror = true;
      setRotation(Crest6, 0.3513317F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(128, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(128, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Tunic.render(f5);
    Belt.render(f5);
    leftleg.render(f5);
    rightleg.render(f5);
    LeftFeet.render(f5);
    RightFeet.render(f5);
    Collar.render(f5);
    body.render(f5);
    head.render(f5);
    Crest.render(f5);
    Crest2.render(f5);
    Crest3.render(f5);
    Crest4.render(f5);
    Crest5.render(f5);
    Crest6.render(f5);
    leftarm.render(f5);
    rightarm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
