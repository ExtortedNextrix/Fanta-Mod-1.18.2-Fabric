package net.nextrix.fantamod;

import net.fabricmc.api.ModInitializer;
import net.nextrix.fantamod.block.ModBlocks;
import net.nextrix.fantamod.item.ModFoodComponents;
import net.nextrix.fantamod.item.ModItemGroup;
import net.nextrix.fantamod.item.ModItems;
import net.nextrix.fantamod.util.ModRegistries;
import net.nextrix.fantamod.world.feature.ModConfiguredFeatures;
import net.nextrix.fantamod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantaMod implements ModInitializer {
	public static final String MOD_ID = "fantamod";
	public static final Logger LOGGER = LoggerFactory.getLogger("fantamod");


	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateWorldGen();
	}
}
