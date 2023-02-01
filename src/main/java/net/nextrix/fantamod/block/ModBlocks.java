package net.nextrix.fantamod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nextrix.fantamod.FantaMod;
import net.nextrix.fantamod.item.ModItemGroup;

public class ModBlocks {

    //public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
    //        new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.FANTA_GROUP);


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
