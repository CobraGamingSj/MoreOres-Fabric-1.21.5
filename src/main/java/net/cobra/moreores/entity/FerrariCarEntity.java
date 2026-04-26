//package net.cobra.moreores.entity;
//
//import net.cobra.moreores.MoreOresModInitializer;
//import net.cobra.moreores.item.ModItems;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.vehicle.VehicleEntity;
//import net.minecraft.item.Item;
//import net.minecraft.util.Identifier;
//import net.minecraft.world.World;
//import org.cobra.api.cars.entity.CarEntity;
//import org.cobra.api.cars.storage.CarFuelStorage;
//import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
//import software.bernie.geckolib.animatable.manager.AnimatableManager;
//import software.bernie.geckolib.util.GeckoLibUtil;
//
//public class FerrariCarEntity extends CarEntity{
//    public static final Identifier CAR_ID = MoreOresModInitializer.getId("ferrari");
//    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
//
//    public FerrariCarEntity(EntityType<? extends CarEntity> entityType, World world) {
//        super(entityType, world, 2);
//        this.carType = CarType.SUPER;
//    }
//
//    @Override
//    public String getModel() {
//        return "ferrari_la_ferrari";
//    }
//
//    @Override
//    public Identifier getCarId() {
//        return CAR_ID;
//    }
//
//    @Override
//    public CarType getCarType() {
//        return this.carType;
//    }
//
//    @Override
//    public EngineType getEngineType() {
//        return EngineType.V12;
//    }
//
//    @Override
//    protected float getFuelCapacity() {
//        return getFuelStorage().getCapacity();
//    }
//
//    @Override
//    public CarFuelStorage createFuelStorage() {
//        return new CarFuelStorage(11f, 0);
//    }
//
//    @Override
//    protected Item asItem() {
//        return ModItems.BLUE_GARNET;
//    }
//
//    @Override
//    public float getFuelEfficiency() {
//        return 10f;
//    }
//
//    @Override
//    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
//
//    }
//
//    @Override
//    public AnimatableInstanceCache getAnimatableInstanceCache() {
//        return cache;
//    }
//}
