package net.nextrix.fantamod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;


public class ModFoodComponents {


    public static final FoodComponent FANTA;

    static {
        FANTA = new FoodComponent.Builder().hunger(100).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000, 100), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,1000, 100), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,1000, 30), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000, 300), 1.0F).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1000, 500), 1.0F).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1000, 3000), 1.0F).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1000, 300), 1.0F).alwaysEdible().build();
    }
}
