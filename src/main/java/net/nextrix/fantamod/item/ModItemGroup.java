package net.nextrix.fantamod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nextrix.fantamod.FantaMod;

public class ModItemGroup {
    public static final ItemGroup FANTA_GROUP = FabricItemGroupBuilder.build(new Identifier(FantaMod.MOD_ID, "fanta"),
            () -> new ItemStack(ModItems.FANTA));
    public static final ItemGroup METAL_GROUP = FabricItemGroupBuilder.build(new Identifier(FantaMod.MOD_ID, "metal"),
            () -> new ItemStack(ModItems.RAW_ALUMINUM));
}
