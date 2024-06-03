package net.valeria.modmc.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent CUPCAKE = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.25f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5*20), 1.0f)
            .build();
}
