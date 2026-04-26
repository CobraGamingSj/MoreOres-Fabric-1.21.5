//package net.cobra.moreores.client.entity.model;
//
//import net.cobra.moreores.MoreOresModInitializer;
//import net.cobra.moreores.entity.FerrariCarEntity;
//import net.minecraft.util.Identifier;
//import org.cobra.api.cars.CarsAPI;
//import software.bernie.geckolib.model.GeoModel;
//import software.bernie.geckolib.renderer.base.GeoRenderState;
//
//public class FerrariCarEntityModel extends GeoModel<FerrariCarEntity> {
//    @Override
//    public Identifier getModelResource(GeoRenderState renderState) {
//        return Identifier.of(MoreOresModInitializer.MOD_ID, "geckolib/models/entity/ferrari.geo.json");
//    }
//
//    @Override
//    public Identifier getTextureResource(GeoRenderState state) {
//        return Identifier.of(CarsAPI.MOD_ID, "textures/entity/cars/bmw_m5.png");
//    }
//
//    @Override
//    public Identifier getAnimationResource(FerrariCarEntity entity) {
//        return Identifier.of(CarsAPI.MOD_ID, "animations/bmw_m5.animation.json");
//    }
//}
