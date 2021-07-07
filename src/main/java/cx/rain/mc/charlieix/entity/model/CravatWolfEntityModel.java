// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

package cx.rain.mc.charlieix.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.passive.WolfEntity;

public class CravatWolfEntityModel extends EntityModel<WolfEntity> {
	private final ModelRenderer group2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer group;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public CravatWolfEntityModel() {
		textureWidth = 32;
		textureHeight = 32;

		group2 = new ModelRenderer(this);
		group2.setRotationPoint(-5.6121F, 24.4228F, 8.0F);
		group2.setTextureOffset(0, 1).addBox(-0.3879F, -3.4228F, -0.501F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		group2.setTextureOffset(0, 2).addBox(-0.3879F, -0.4228F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		group2.setTextureOffset(0, 2).addBox(-0.9379F, -0.8978F, -0.502F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		group2.setTextureOffset(0, 2).addBox(-1.9379F, -0.8978F, -0.502F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.3598F, -0.7478F, 0.0091F);
		group2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
		cube_r1.setTextureOffset(0, 2).addBox(-2.5044F, -1.5208F, -0.5091F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 2).addBox(1.1911F, 0.0099F, -0.5091F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.3598F, -0.7478F, 0.0091F);
		group2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
		cube_r2.setTextureOffset(0, 1).addBox(1.0572F, -3.3333F, -0.5101F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 1).addBox(-2.6383F, -1.8026F, -0.5101F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		group = new ModelRenderer(this);
		group.setRotationPoint(-5.6121F, 24.4228F, 8.0F);
		group.setTextureOffset(1, 1).addBox(-8.3879F, -3.4228F, -0.501F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(1, 2).addBox(-8.3879F, -0.4228F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(1, 2).addBox(-8.7129F, -0.8978F, -0.502F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(1, 2).addBox(-4.7129F, -0.8978F, -0.502F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.1356F, -0.7478F, 0.0091F);
		group.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
		cube_r3.setTextureOffset(1, 2).addBox(0.5044F, -1.5208F, -0.5091F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(1, 2).addBox(-2.4411F, 0.0099F, -0.5091F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.1356F, -0.7478F, 0.0091F);
		group.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
		cube_r4.setTextureOffset(1, 1).addBox(-2.3072F, -3.3333F, -0.5101F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(1, 1).addBox(0.6383F, -1.8026F, -0.5101F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-8.0F, -0.5F, 8.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 16).addBox(-1.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 16).addBox(0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-8.0F, -0.5F, 8.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 16).addBox(-0.5F, -1.25F, -1.25F, 1.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(WolfEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		//previously the render function, render code was moved to a method below

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		group2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		group.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}