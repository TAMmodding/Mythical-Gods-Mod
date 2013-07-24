
package com.TamModding.mgm.entitys.models;

import org.lwjgl.opengl.GL11;

import com.TamModding.mgm.entitys.tileEntitys.TileEntityAltar;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAltar extends ModelBase
{
  //fields
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
    ModelRenderer Shape15;
    ModelRenderer Shape16;
  
  public ModelAltar()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(-3F, 8F, 0F, 6, 16, 7);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(32, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, -3.141593F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(-3F, 8F, 0F, 6, 16, 7);
      Shape2.setRotationPoint(0F, 0F, 0F);
      Shape2.setTextureSize(32, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(-3F, 8F, 0F, 6, 16, 7);
      Shape3.setRotationPoint(0F, 0F, 0F);
      Shape3.setTextureSize(32, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, -1.570796F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(-3F, 8F, 0F, 6, 16, 7);
      Shape4.setRotationPoint(0F, 0F, 0F);
      Shape4.setTextureSize(32, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 1.570796F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(-3F, 7.999F, 0F, 6, 16, 7);
      Shape5.setRotationPoint(0F, 0F, 0F);
      Shape5.setTextureSize(32, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 2.356194F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(-3F, 7.998F, 0F, 6, 16, 7);
      Shape6.setRotationPoint(0F, 0F, 0F);
      Shape6.setTextureSize(32, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0.7853982F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(-3F, 7.999F, 0F, 6, 16, 7);
      Shape7.setRotationPoint(0F, 0F, 0F);
      Shape7.setTextureSize(32, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, -0.7853982F, 0F);
      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(-3F, 7.998F, 0F, 6, 16, 7);
      Shape8.setRotationPoint(0F, 0F, 0F);
      Shape8.setTextureSize(32, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, -2.356194F, 0F);
      Shape9 = new ModelRenderer(this, 26, 0);
      Shape9.addBox(4.6F, 8F, 4.6F, 1, 16, 1);
      Shape9.setRotationPoint(0F, 0F, 0F);
      Shape9.setTextureSize(32, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0.3926991F, 0F);
      Shape10 = new ModelRenderer(this, 26, 0);
      Shape10.addBox(4.6F, 8F, 4.6F, 1, 16, 1);
      Shape10.setRotationPoint(0F, 0F, 0F);
      Shape10.setTextureSize(32, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 1.178097F, 0F);
      Shape11 = new ModelRenderer(this, 26, 0);
      Shape11.addBox(4.6F, 8F, -5.6F, 1, 16, 1);
      Shape11.setRotationPoint(0F, 0F, 0F);
      Shape11.setTextureSize(32, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0.3926991F, 0F);
      Shape12 = new ModelRenderer(this, 26, 0);
      Shape12.addBox(4.6F, 8F, -5.6F, 1, 16, 1);
      Shape12.setRotationPoint(0F, 0F, 0F);
      Shape12.setTextureSize(32, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 1.178097F, 0F);
      Shape13 = new ModelRenderer(this, 26, 0);
      Shape13.addBox(-5.6F, 8F, -5.6F, 1, 16, 1);
      Shape13.setRotationPoint(0F, 0F, 0F);
      Shape13.setTextureSize(32, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0.3926991F, 0F);
      Shape14 = new ModelRenderer(this, 26, 0);
      Shape14.addBox(-5.6F, 8F, -5.6F, 1, 16, 1);
      Shape14.setRotationPoint(0F, 0F, 0F);
      Shape14.setTextureSize(32, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 1.178097F, 0F);
      Shape15 = new ModelRenderer(this, 26, 0);
      Shape15.addBox(-5.6F, 8F, 4.6F, 1, 16, 1);
      Shape15.setRotationPoint(0F, 0F, 0F);
      Shape15.setTextureSize(32, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0.3926991F, 0F);
      Shape16 = new ModelRenderer(this, 26, 0);
      Shape16.addBox(-5.6F, 8F, 4.6F, 1, 16, 1);
      Shape16.setRotationPoint(0F, 0F, 0F);
      Shape16.setTextureSize(32, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 1.178097F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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
    Shape15.render(f5);
    Shape16.render(f5);
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
  
  public void render(float f5)
  {
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
      Shape15.render(f5);
      Shape16.render(f5);

  }
  
  public void render(TileEntityAltar calcinator, double x, double y, double z, float f5)
  {
      GL11.glPushMatrix();
      GL11.glDisable(GL11.GL_LIGHTING);
      GL11.glTranslated(x, y, z);
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
      Shape15.render(f5);
      Shape16.render(f5);
      GL11.glEnable(GL11.GL_LIGHTING);
      GL11.glPopMatrix();
  }

}
