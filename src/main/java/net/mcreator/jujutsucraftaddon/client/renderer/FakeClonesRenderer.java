package net.mcreator.jujutsucraftaddon.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.jujutsucraftaddon.entity.CloneEntity;
import net.mcreator.jujutsucraftaddon.entity.FakeClonesEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class FakeClonesRenderer extends HumanoidMobRenderer<FakeClonesEntity, HumanoidModel<FakeClonesEntity>> {
    public FakeClonesRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
        this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
        this.addLayer(new RenderLayer<FakeClonesEntity, HumanoidModel<FakeClonesEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = new ResourceLocation("jujutsucraftaddon:textures/entities/pmcskin3d-steve.png");



            @Override
            public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FakeClonesEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
                ResourceLocation textureLocation;
                // Get the owner entity
                LivingEntity livingEntity = entity.getOwner();
                if (livingEntity != null) {
                    EntityRenderDispatcher entityRenderDispatcher = Minecraft.getInstance().getEntityRenderDispatcher();
                    EntityRenderer<? super LivingEntity> livingRenderer = entityRenderDispatcher.getRenderer(livingEntity);
                    textureLocation = livingRenderer.getTextureLocation(livingEntity);
                } else {
                    textureLocation = LAYER_TEXTURE;
                }
                VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(textureLocation));
                this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
            }
        });
    }

    @Override
    public ResourceLocation getTextureLocation(FakeClonesEntity entity) {
        LivingEntity livingEntity = entity.getOwner();
        if (livingEntity == null) {
            return new ResourceLocation("jujutsucraftaddon:textures/entities/6qwlpvo.png");
        }
        EntityRenderDispatcher entityRenderDispatcher = Minecraft.getInstance().getEntityRenderDispatcher();
        EntityRenderer<? super LivingEntity> livingRenderer = entityRenderDispatcher.getRenderer(livingEntity);
        ResourceLocation resourceLocation = livingRenderer.getTextureLocation(livingEntity);
        return resourceLocation;
    }
}
