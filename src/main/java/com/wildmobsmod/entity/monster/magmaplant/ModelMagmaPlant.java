// Date: 1.7.2017 14.28.43
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.wildmobsmod.entity.monster.magmaplant;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMagmaPlant extends ModelBase
{
	// fields
	// Stage 3
	ModelRenderer base;
	ModelRenderer mouth;
	ModelRenderer crest;
	ModelRenderer bladder1;
	ModelRenderer bladder2;
	ModelRenderer bladder3;
	ModelRenderer bladder4;
	ModelRenderer bladder5;
	ModelRenderer bladder6;
	ModelRenderer petal1;
	ModelRenderer petal2;
	ModelRenderer petal3;
	ModelRenderer petal4;

	// Stage 2
	ModelRenderer base1;
	ModelRenderer mouth1;
	ModelRenderer crest1;
	ModelRenderer petal11;
	ModelRenderer petal21;
	ModelRenderer petal31;
	ModelRenderer petal41;

	// Stage 1
	ModelRenderer base2;
	ModelRenderer mouth2;
	ModelRenderer crest2;

	// Stage 0
	ModelRenderer base3;
	ModelRenderer mouth3;

	public ModelMagmaPlant()
	{
		textureWidth = 128;
		textureHeight = 64;

		// Stage 3
		base = new ModelRenderer(this, 0, 16);
		base.addBox(-6F, 0F, -6F, 12, 7, 12);
		base.setRotationPoint(0F, 17F, 0F);
		base.setTextureSize(128, 64);
		setRotation(base, 0F, 0F, 0F);
		mouth = new ModelRenderer(this, 0, 0);
		mouth.addBox(-4.5F, 0F, -4.5F, 9, 7, 9);
		mouth.setRotationPoint(0F, 9F, 0F);
		mouth.setTextureSize(128, 64);
		setRotation(mouth, 0F, 0F, 0F);
		crest = new ModelRenderer(this, 0, 35);
		crest.addBox(-7.5F, 0F, -7.5F, 15, 2, 15);
		crest.setRotationPoint(0F, 16F, 0F);
		crest.setTextureSize(128, 64);
		setRotation(crest, 0F, 0F, 0F);
		bladder1 = new ModelRenderer(this, 48, 0);
		bladder1.addBox(0F, 0F, 0F, 11, 6, 6);
		bladder1.setRotationPoint(-11F, 18F, 3.5F);
		bladder1.setTextureSize(128, 64);
		setRotation(bladder1, -0.0698132F, 1.570796F, 0F);
		bladder2 = new ModelRenderer(this, 48, 12);
		bladder2.addBox(0F, 0F, 0F, 9, 4, 4);
		bladder2.setRotationPoint(-6F, 20F, -10F);
		bladder2.setTextureSize(128, 64);
		setRotation(bladder2, 0.1047198F, 0F, 0F);
		bladder3 = new ModelRenderer(this, 74, 12);
		bladder3.addBox(0F, 0F, 0F, 5, 3, 2);
		bladder3.setRotationPoint(1F, 17F, -7.4F);
		bladder3.setTextureSize(128, 64);
		setRotation(bladder3, -0.0174533F, -0.0698132F, 0.122173F);
		bladder4 = new ModelRenderer(this, 48, 20);
		bladder4.addBox(0F, 0F, 0F, 9, 5, 4);
		bladder4.setRotationPoint(6F, 18.9F, 4F);
		bladder4.setTextureSize(128, 64);
		setRotation(bladder4, 0F, 1.658063F, 0F);
		bladder5 = new ModelRenderer(this, 48, 29);
		bladder5.addBox(0F, 0F, 0F, 12, 6, 4);
		bladder5.setRotationPoint(-6F, 20F, 3.5F);
		bladder5.setTextureSize(128, 64);
		setRotation(bladder5, 0.5235988F, -0.1396263F, 0F);
		bladder6 = new ModelRenderer(this, 74, 17);
		bladder6.addBox(0F, 0F, 0F, 4, 6, 3);
		bladder6.setRotationPoint(5F, 18.1F, 6F);
		bladder6.setTextureSize(128, 64);
		setRotation(bladder6, 0F, 0.9599311F, 0F);
		petal1 = new ModelRenderer(this, 20, 53);
		petal1.addBox(-5F, -10F, 0F, 10, 10, 0);
		petal1.setRotationPoint(0F, 16F, 5F);
		petal1.setTextureSize(128, 64);
		setRotation(petal1, -0.9250245F, 0F, 0F);
		petal2 = new ModelRenderer(this, 20, 53);
		petal2.addBox(-5F, -10F, 0F, 10, 10, 0);
		petal2.setRotationPoint(5F, 16F, 0F);
		petal2.setTextureSize(128, 64);
		setRotation(petal2, -0.9250245F, 1.570796F, 0F);
		petal3 = new ModelRenderer(this, 20, 53);
		petal3.addBox(-5F, -10F, 0F, 10, 10, 0);
		petal3.setRotationPoint(0F, 16F, -5F);
		petal3.setTextureSize(128, 64);
		setRotation(petal3, -0.9250245F, 3.141593F, 0F);
		petal4 = new ModelRenderer(this, 20, 53);
		petal4.addBox(-5F, -10F, 0F, 10, 10, 0);
		petal4.setRotationPoint(-5F, 16F, 0F);
		petal4.setTextureSize(128, 64);
		setRotation(petal4, -0.9250245F, -1.570796F, 0F);

		// Stage 2
		base1 = new ModelRenderer(this, 0, 13);
		base1.addBox(-4.5F, 0F, -4.5F, 9, 6, 9);
		base1.setRotationPoint(0F, 18F, 0F);
		base1.setTextureSize(128, 64);
		base1.mirror = true;
		setRotation(base1, 0F, 0F, 0F);
		mouth1 = new ModelRenderer(this, 0, 0);
		mouth1.addBox(-3.5F, 0F, -3.5F, 7, 6, 7);
		mouth1.setRotationPoint(0F, 11F, 0F);
		mouth1.setTextureSize(128, 64);
		mouth1.mirror = true;
		setRotation(mouth1, 0F, 0F, 0F);
		crest1 = new ModelRenderer(this, 0, 29);
		crest1.addBox(-6F, 0F, -6F, 12, 2, 12);
		crest1.setRotationPoint(0F, 17F, 0F);
		crest1.setTextureSize(128, 64);
		crest1.mirror = true;
		setRotation(crest1, 0F, 0F, 0F);
		petal11 = new ModelRenderer(this, 0, 43);
		petal11.addBox(-4F, -8F, 0F, 8, 8, 0);
		petal11.setRotationPoint(0F, 17F, 4F);
		petal11.setTextureSize(128, 64);
		petal11.mirror = true;
		setRotation(petal11, -0.1745329F, 0F, 0F);
		petal21 = new ModelRenderer(this, 0, 43);
		petal21.addBox(-4F, -8F, 0F, 8, 8, 0);
		petal21.setRotationPoint(4F, 17F, 0F);
		petal21.setTextureSize(128, 64);
		petal21.mirror = true;
		setRotation(petal21, -0.1745329F, 1.570796F, 0F);
		petal31 = new ModelRenderer(this, 0, 43);
		petal31.addBox(-4F, -8F, 0F, 8, 8, 0);
		petal31.setRotationPoint(0F, 17F, -4F);
		petal31.setTextureSize(128, 64);
		petal31.mirror = true;
		setRotation(petal31, -0.1745329F, 3.141593F, 0F);
		petal41 = new ModelRenderer(this, 0, 43);
		petal41.addBox(-4F, -8F, 0F, 8, 8, 0);
		petal41.setRotationPoint(-4F, 17F, 0F);
		petal41.setTextureSize(128, 64);
		petal41.mirror = true;
		setRotation(petal41, -0.1745329F, -1.570796F, 0F);

		// Stage 1
		base2 = new ModelRenderer(this, 0, 13);
		base2.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
		base2.setRotationPoint(0F, 19F, 0F);
		base2.setTextureSize(128, 64);
		base2.mirror = true;
		setRotation(base2, 0F, 0F, 0F);
		mouth2 = new ModelRenderer(this, 0, 0);
		mouth2.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
		mouth2.setRotationPoint(0F, 13F, 0F);
		mouth2.setTextureSize(128, 64);
		mouth2.mirror = true;
		setRotation(mouth2, 0F, 0F, 0F);
		crest2 = new ModelRenderer(this, 0, 29);
		crest2.addBox(-4.5F, 0F, -4.5F, 9, 1, 9);
		crest2.setRotationPoint(0F, 18F, 0F);
		crest2.setTextureSize(128, 64);
		crest2.mirror = true;
		setRotation(crest2, 0F, 0F, 0F);

		// Stage 0
		base3 = new ModelRenderer(this, 0, 13);
		base3.addBox(-1.5F, 0F, -1.5F, 3, 4, 3);
		base3.setRotationPoint(0F, 20F, 0F);
		base3.setTextureSize(128, 64);
		base3.mirror = true;
		setRotation(base3, 0F, 0F, 0F);
		mouth3 = new ModelRenderer(this, 0, 0);
		mouth3.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
		mouth3.setRotationPoint(0F, 15F, 0F);
		mouth3.setTextureSize(128, 64);
		mouth3.mirror = true;
		setRotation(mouth3, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		EntityMagmaPlant entitymagmaplant = (EntityMagmaPlant) entity;
		if(entitymagmaplant.getStage() == 2)
		{
			base1.render(f5);
			mouth1.render(f5);
			crest1.render(f5);
			petal11.render(f5);
			petal21.render(f5);
			petal31.render(f5);
			petal41.render(f5);
		}
		else if(entitymagmaplant.getStage() == 1)
		{
			base2.render(f5);
			mouth2.render(f5);
			crest2.render(f5);
		}
		else if(entitymagmaplant.getStage() == 0)
		{
			base3.render(f5);
			mouth3.render(f5);
		}
		else
		{
			base.render(f5);
			mouth.render(f5);
			crest.render(f5);
			bladder1.render(f5);
			bladder2.render(f5);
			bladder3.render(f5);
			bladder4.render(f5);
			bladder5.render(f5);
			bladder6.render(f5);
			petal1.render(f5);
			petal2.render(f5);
			petal3.render(f5);
			petal4.render(f5);
		}
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
