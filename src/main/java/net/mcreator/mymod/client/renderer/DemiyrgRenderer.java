
package net.mcreator.mymod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mymod.entity.DemiyrgEntity;
import net.mcreator.mymod.client.model.Modeldemiyrg;

public class DemiyrgRenderer extends MobRenderer<DemiyrgEntity, Modeldemiyrg<DemiyrgEntity>> {
	public DemiyrgRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldemiyrg(context.bakeLayer(Modeldemiyrg.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(DemiyrgEntity entity) {
		return new ResourceLocation("mymod:textures/entities/demiyrg_tex.png");
	}
}
