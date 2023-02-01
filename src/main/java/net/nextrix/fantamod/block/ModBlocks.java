package net.nextrix.fantamod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nextrix.fantamod.FantaMod;
import net.nextrix.fantamod.item.ModItemGroup;
import net.nextrix.fantamod.world.feature.tree.FantaSaplingGenerator;

public class ModBlocks {

    public static final Block FANTA_LOG = registerBlock("fanta_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).requiresTool().strength(4.0f)), ModItemGroup.FANTA_GROUP);
    public static final Block FANTA_PLANKS = registerBlock("fanta_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool().strength(4.0f)), ModItemGroup.FANTA_GROUP);
    public static final Block FANTA_LEAVES = registerBlock("fanta_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.FANTA_GROUP);
    public static final Block FANTA_SAPLING = registerBlock("fanta_sapling",
            new ModSaplingBlock(new FantaSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.FANTA_GROUP);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FantaMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FantaMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        FantaMod.LOGGER.info("Registering ModBlocks for " + FantaMod.MOD_ID);
    }
}