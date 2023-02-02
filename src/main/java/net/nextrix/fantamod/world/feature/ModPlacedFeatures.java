package net.nextrix.fantamod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> FANTA_PLACED = PlacedFeatures.register("fanta_placed",
            ModConfiguredFeatures.FANTA_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1,0.1f,2)));

    //ore
    public static final RegistryEntry<PlacedFeature> ALUMINUM_ORE_PLACED = PlacedFeatures.register("aluminum_ore_placed",
            ModConfiguredFeatures.ALUMINUM_ORE, ModOreFeatures.modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
}
