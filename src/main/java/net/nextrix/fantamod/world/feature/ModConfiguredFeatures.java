package net.nextrix.fantamod.world.feature;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.nextrix.fantamod.FantaMod;
import net.nextrix.fantamod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> FANTA_TREE =
            ConfiguredFeatures.register("fanta_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.FANTA_LOG),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.of(ModBlocks.FANTA_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final RegistryEntry<PlacedFeature> FANTA_CHECKED =
            PlacedFeatures.register("fanta_checked", FANTA_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.FANTA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> FANTA_SPAWN =
            ConfiguredFeatures.register("fanta_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(FANTA_CHECKED, 0.5f)),
                        FANTA_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + FantaMod.MOD_ID);
    }

}
