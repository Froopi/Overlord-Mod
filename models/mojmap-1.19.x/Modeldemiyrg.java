// Made with Blockbench 4.6.0-beta.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldemiyrg<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "demiyrg"), "main");
	private final ModelPart Hed;
	private final ModelPart body;
	private final ModelPart LeftHand;
	private final ModelPart RightHand;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public Modeldemiyrg(ModelPart root) {
		this.Hed = root.getChild("Hed");
		this.body = root.getChild("body");
		this.LeftHand = root.getChild("LeftHand");
		this.RightHand = root.getChild("RightHand");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Hed = partdefinition.addOrReplaceChild("Hed",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.6599F, -6.2F, -5.2909F, 10.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, -12.8F, 2.3F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r1 = Hed.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(36, 2)
						.addBox(-6.4F, -39.25F, 3.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-6.4F, -38.0F, 1.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-6.4F, -39.75F, 7.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 7)
						.addBox(-6.4F, -39.0F, 1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 11)
						.addBox(-6.4F, -38.25F, -0.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3401F, 36.8F, -2.2909F, 0.0077F, -0.1665F, -0.0013F));

		PartDefinition cube_r2 = Hed.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(3.3F, -39.65F, 7.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 20)
						.addBox(3.3F, -39.15F, 3.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(3.3F, -38.9F, 1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.3F, -37.9F, 1.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(3.3F, -38.15F, -0.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3401F, 36.8F, -2.2909F, 0.0077F, 0.1651F, 0.0012F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 20)
				.addBox(-5.0F, -11.2F, -1.0F, 10.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 2.2F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(56, 33)
						.addBox(4.75F, -18.25F, 19.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(4.75F, -17.25F, 11.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 21.8F, 0.0F, -0.5299F, -0.7119F, 0.3655F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(50, 11).addBox(0.0F, -17.25F, 5.25F, 4.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 21.8F, 0.0F, -0.4215F, -0.3614F, 0.1572F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(56, 22).addBox(-2.5F, -17.5F, -1.75F, 4.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 21.8F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LeftHand = partdefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(0, 44)
				.addBox(-3.0F, -2.9F, -4.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, -6.0F, 3.0F));

		PartDefinition RightHand = partdefinition.addOrReplaceChild("RightHand", CubeListBuilder.create()
				.texOffs(32, 20).addBox(-2.75F, -2.4F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.25F, -6.5F, 2.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(24, 44)
				.addBox(-1.0F, -15.0F, -1.0F, 5.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(46, 44)
				.addBox(-2.0F, -1.0F, -1.0F, 5.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 10.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Hed.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftHand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightHand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Hed.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Hed.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftHand.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightHand.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}