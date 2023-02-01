package net.nextrix.fantamod.potion;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nextrix.fantamod.FantaMod;
import net.nextrix.fantamod.effect.ModEffects;

public class ModPotions extends Item {

    public static Potion FANTA_DRINK;

    public ModPotions(Settings settings) {
        super(settings);
    }

    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(FantaMod.MOD_ID, name),
                new Potion(new StatusEffectInstance(ModEffects.FANTA_DRINK, 200, 1)));
    }

    public static void registerPotions() {
        FANTA_DRINK = registerPotion("fanta_drink");
    }

}
