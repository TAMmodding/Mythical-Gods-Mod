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

public class ModelVulcan extends ModelBase
{
  //fields
    ModelRenderer loincloth1;
    ModelRenderer loincloth2;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Feet;
    ModelRenderer Leg;
    ModelRenderer Body;
    ModelRenderer head;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer ArmPart2;
    ModelRenderer Accesory1;
    ModelRenderer Accesory2;
    ModelRenderer Cannon1;
    ModelRenderer Cannon12;
    ModelRenderer Cannon2;
    ModelRenderer Cannon22;
  
  public ModelVulcan()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      loincloth1 = new ModelRenderer(this, 16, 33);
      loincloth1.addBox(-3F, 10F, -2.05F, 5, 8, 0);
      loincloth1.setRotationPoint(0F, 0F, 0F);
      loincloth1.setTextureSize(64, 64);
      loincloth1.mirror = true;
      setRotation(loincloth1, 0F, 0F, 0F);
      loincloth2 = new ModelRenderer(this, 16, 33);
      loincloth2.addBox(-3F, 9F, 2F, 5, 8, 0);
      loincloth2.setRotationPoint(0F, 0F, 0F);
      loincloth2.setTextureSize(64, 64);
      loincloth2.mirror = true;
      setRotation(loincloth2, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 56);
      Shape1.addBox(2F, 23F, -4F, 3, 1, 2);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 59);
      Shape2.addBox(1.5F, 23F, -2F, 4, 1, 4);
      Shape2.setRotationPoint(0F, 0F, 0F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 10, 56);
      Shape3.addBox(2F, 13.5F, -18.8F, 3, 1, 2);
      Shape3.setRotationPoint(0F, 0F, 0F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0.8726646F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 28, 58);
      Shape4.addBox(1.5F, 20F, -1F, 4, 3, 3);
      Shape4.setRotationPoint(0F, 0F, 0F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 16, 59);
      Shape5.addBox(2.5F, 9.5F, -21F, 2, 1, 4);
      Shape5.setRotationPoint(0F, 0F, 0F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 1.22173F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 54);
      Shape6.addBox(2F, 23F, 2F, 3, 1, 1);
      Shape6.setRotationPoint(0F, 0F, 0F);
      Shape6.setTextureSize(64, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 42, 60);
      Shape7.addBox(1F, 19F, -0.5F, 5, 2, 2);
      Shape7.setRotationPoint(0F, 0F, 0F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 20, 53);
      Shape8.addBox(2.5F, 15F, -4F, 2, 4, 2);
      Shape8.setRotationPoint(0F, 0F, 0F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0.1745329F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 49);
      Shape9.addBox(2F, 14F, -1.966667F, 3, 2, 3);
      Shape9.setRotationPoint(0F, 0F, 0F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 42, 56);
      Shape10.addBox(1.5F, 13F, -1.466667F, 4, 2, 2);
      Shape10.setRotationPoint(0F, 0F, 0F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 28, 49);
      Shape11.addBox(2F, 9F, -5.466667F, 3, 4, 1);
      Shape11.setRotationPoint(0F, 0F, 0F);
      Shape11.setTextureSize(64, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 0.2617994F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 20, 49);
      Shape12.addBox(2F, 8F, 9.6F, 3, 2, 1);
      Shape12.setRotationPoint(0F, 0F, 0F);
      Shape12.setTextureSize(64, 64);
      Shape12.mirror = true;
      setRotation(Shape12, -0.7853982F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 28, 54);
      Shape13.addBox(1.5F, 10F, 1.133333F, 4, 3, 1);
      Shape13.setRotationPoint(0F, 0F, 0F);
      Shape13.setTextureSize(64, 64);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 38, 52);
      Shape14.addBox(-1F, 10F, -3.3F, 7, 2, 2);
      Shape14.setRotationPoint(0F, 0F, 0F);
      Shape14.setTextureSize(64, 64);
      Shape14.mirror = true;
      setRotation(Shape14, 0.1745329F, 0F, 0F);
      Feet = new ModelRenderer(this, 16, 41);
      Feet.addBox(-5F, 22F, -4F, 4, 2, 6);
      Feet.setRotationPoint(0F, 0F, 0F);
      Feet.setTextureSize(64, 64);
      Feet.mirror = true;
      setRotation(Feet, 0F, 0F, 0F);
      Leg = new ModelRenderer(this, 0, 33);
      Leg.addBox(-5F, 10F, -2F, 4, 12, 4);
      Leg.setRotationPoint(0F, 0F, 0F);
      Leg.setTextureSize(64, 64);
      Leg.mirror = true;
      setRotation(Leg, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 17);
      Body.addBox(-5F, -2F, -2F, 10, 12, 4);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -3.5F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 28, 17);
      Arm1.addBox(5F, -2F, -2F, 4, 12, 4);
      Arm1.setRotationPoint(0F, 0F, 0F);
      Arm1.setTextureSize(64, 64);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 48, 12);
      Arm2.addBox(-9F, -2F, -2F, 4, 6, 4);
      Arm2.setRotationPoint(0F, 0F, 0F);
      Arm2.setTextureSize(64, 64);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0F);
      ArmPart2 = new ModelRenderer(this, 44, 22);
      ArmPart2.addBox(-9.5F, 4F, -2.5F, 5, 6, 5);
      ArmPart2.setRotationPoint(0F, 0F, 0F);
      ArmPart2.setTextureSize(64, 64);
      ArmPart2.mirror = true;
      setRotation(ArmPart2, 0F, 0F, 0F);
      Accesory1 = new ModelRenderer(this, 52, 4);
      Accesory1.addBox(-11F, 3F, -2F, 2, 4, 4);
      Accesory1.setRotationPoint(0F, 0F, 0F);
      Accesory1.setTextureSize(64, 64);
      Accesory1.mirror = true;
      setRotation(Accesory1, 0F, 0F, 0F);
      Accesory2 = new ModelRenderer(this, 52, 0);
      Accesory2.addBox(-13F, 3.01F, -1F, 4, 2, 2);
      Accesory2.setRotationPoint(0F, 0F, 0F);
      Accesory2.setTextureSize(64, 64);
      Accesory2.mirror = true;
      setRotation(Accesory2, 0F, 0F, 0F);
      Cannon1 = new ModelRenderer(this, 36, 41);
      Cannon1.addBox(2F, -8F, 2F, 4, 6, 4);
      Cannon1.setRotationPoint(0F, 0F, 0F);
      Cannon1.setTextureSize(64, 64);
      Cannon1.mirror = true;
      setRotation(Cannon1, 0F, 0F, 0.4363323F);
      Cannon12 = new ModelRenderer(this, 36, 33);
      Cannon12.addBox(-6.5F, -9.5F, 1.5F, 5, 3, 5);
      Cannon12.setRotationPoint(0F, 0F, 0F);
      Cannon12.setTextureSize(64, 64);
      Cannon12.mirror = true;
      setRotation(Cannon12, 0F, 0F, -0.4363323F);
      Cannon2 = new ModelRenderer(this, 36, 41);
      Cannon2.addBox(-6F, -8F, 2F, 4, 6, 4);
      Cannon2.setRotationPoint(0F, 0F, 0F);
      Cannon2.setTextureSize(64, 64);
      Cannon2.mirror = true;
      setRotation(Cannon2, 0F, 0F, -0.4363323F);
      Cannon22 = new ModelRenderer(this, 36, 33);
      Cannon22.addBox(1.5F, -9.5F, 1.5F, 5, 3, 5);
      Cannon22.setRotationPoint(0F, 0F, 0F);
      Cannon22.setTextureSize(64, 64);
      Cannon22.mirror = true;
      setRotation(Cannon22, 0F, 0F, 0.4363323F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    loincloth1.render(f5);
    loincloth2.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Feet.render(f5);
    Leg.render(f5);
    Body.render(f5);
    head.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
    ArmPart2.render(f5);
    Accesory1.render(f5);
    Accesory2.render(f5);
    Cannon1.render(f5);
    Cannon12.render(f5);
    Cannon2.render(f5);
    Cannon22.render(f5);
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
