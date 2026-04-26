//package net.cobra.moreores.data.datagen;
//
//import net.cobra.moreores.entity.ModCarEntities;
//import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//import net.minecraft.registry.RegistryWrapper;
//import net.minecraft.util.Identifier;
//import org.cobra.api.cars.data.CarDefinition;
//import org.cobra.api.cars.data.CarDefinitionDataGenerator;
//import org.cobra.api.cars.storage.CarFuelStorage;
//import org.cobra.api.cars.util.Car;
//
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.function.BiConsumer;
//
//public class ModCarDefinitionGenerator extends CarDefinitionDataGenerator.Provider {
//    public ModCarDefinitionGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
//        super(output, registriesFuture);
//    }
//
//    @Override
//    protected CarDefinitionDataGenerator generateCarDefinition(RegistryWrapper.WrapperLookup registries, BiConsumer<Identifier, CarDefinition> exporter) {
//        return new CarDefinitionDataGenerator(registries, exporter) {
//            @Override
//            public void generate() {
//                registerCarDefinition(ModCarEntities.FERRARI, CarDefinition.createDefinition(Car.CarType.SUPER, Car.EngineType.V12, "ferrari_la_ferrari", 2, List.of(CarFuelStorage.FuelTank.FuelType.PETROL, CarFuelStorage.FuelTank.FuelType.HYDROGEN), 11f), exporter);
//            }
//        };
//    }
//}
