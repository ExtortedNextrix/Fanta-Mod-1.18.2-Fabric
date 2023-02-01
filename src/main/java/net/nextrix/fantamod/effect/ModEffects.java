package net.nextrix.fantamod.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nextrix.fantamod.FantaMod;

public class ModEffects {
    public static StatusEffect FANTA_DRINK;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(FantaMod.MOD_ID, name),
                new SpeedEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerEffect() {
        FANTA_DRINK = registerStatusEffect("fanta_drink");
    }
}
