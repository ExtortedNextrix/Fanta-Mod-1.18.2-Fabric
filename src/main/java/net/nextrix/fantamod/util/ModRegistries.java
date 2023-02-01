package net.nextrix.fantamod.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.nextrix.fantamod.FantaMod;
import net.nextrix.fantamod.block.ModBlocks;
import net.nextrix.fantamod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
    //    registerEvents();
    //    registerFlammableBlock();
    }

    private static void registerFuels() {
        FantaMod.LOGGER.info("Registering Fuels for " + FantaMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBlocks.FANTA_LOG, 200);
        registry.add(ModBlocks.FANTA_PLANKS, 200);
    }

    //private static void registerEvents() {
    //    ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    //}

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.FANTA_LOG, 5, 5);
        instance.add(ModBlocks.FANTA_PLANKS, 5, 20);
    }
}
