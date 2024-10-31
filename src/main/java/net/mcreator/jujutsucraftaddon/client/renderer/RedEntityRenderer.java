package net.mcreator.jujutsucraftaddon.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jujutsucraftaddon.entity.model.RedEntityModel;
import net.mcreator.jujutsucraftaddon.entity.RedEntityEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RedEntityRenderer extends GeoEntityRenderer<RedEntityEntity> {
    public RedEntityRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RedEntityModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public RenderType getRenderType(RedEntityEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, RedEntityEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 8f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
