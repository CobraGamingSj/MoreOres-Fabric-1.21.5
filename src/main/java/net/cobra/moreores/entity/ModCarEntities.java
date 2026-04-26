//package net.cobra.moreores.entity;
//
//import net.cobra.moreores.MoreOresModInitializer;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.SpawnGroup;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.Registry;
//import net.minecraft.registry.RegistryKey;
//import net.minecraft.registry.RegistryKeys;
//import net.minecraft.util.Identifier;
//
//public class ModCarEntities {
//
//    private static final RegistryKey<EntityType<?>> FERRARI_REGISTRY_KEY =
//            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(MoreOresModInitializer.MOD_ID, "ferrari"));
//
//    public static final EntityType<FerrariCarEntity> FERRARI =
//            Registry.register(Registries.ENTITY_TYPE, Identifier.of(MoreOresModInitializer.MOD_ID, "ferrari"),
//                    EntityType.Builder.create(FerrariCarEntity::new, SpawnGroup.MISC).dimensions(5F, 5F).build(FERRARI_REGISTRY_KEY));
//
//    public static void register() {
//
//    }
//}
