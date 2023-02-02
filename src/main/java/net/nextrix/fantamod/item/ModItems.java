package net.nextrix.fantamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nextrix.fantamod.FantaMod;

public class ModItems {

    public static final Item FANTA = registerItem("fanta",
            new Item(new FabricItemSettings().group(ModItemGroup.FANTA_GROUP).maxCount(16).food(ModFoodComponents.FANTA)));
    public static final Item FANTA_POWDER = registerItem("fanta_powder",
            new Item(new FabricItemSettings().group(ModItemGroup.FANTA_GROUP)));
    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum",
            new Item(new FabricItemSettings().group(ModItemGroup.METAL_GROUP)));
    public static final Item ALUMINUM = registerItem("aluminum",
            new Item(new FabricItemSettings().group(ModItemGroup.METAL_GROUP)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FantaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FantaMod.LOGGER.info("Registering Mod Items for " + FantaMod.MOD_ID);
    }
}
