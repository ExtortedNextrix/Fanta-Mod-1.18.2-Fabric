package net.nextrix.fantamod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.nextrix.fantamod.world.feature.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
               GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FANTA_PLACED.getKey().get());

    }

}
