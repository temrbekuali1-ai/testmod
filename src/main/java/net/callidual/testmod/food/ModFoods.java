package net.callidual.testmod.food;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.PlaySoundConsumeEffect;

import java.util.List;

import static net.minecraft.world.item.component.Consumables.HONEY_BOTTLE;
import static net.minecraft.world.item.component.Consumables.defaultFood;

public class ModFoods {
    public static final FoodProperties PIE = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable PIE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,6, false, false, false))).consumeSeconds(0.5f).build();

    public static final FoodProperties SNOWPIS = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable SNOWPIS_CONSUMABLE = Consumables.defaultFood()
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                            new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,4, false, false, false),
                            new MobEffectInstance(MobEffects.HASTE, 200, 1, false, false, false)))
            ).consumeSeconds(0.5f).build();

    public static final FoodProperties QUICHE = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable QUICHE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,4, false, false, false))).consumeSeconds(0.5f).build();
    public static final FoodProperties ASTROFOOD = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable ASTROFOOD_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.JUMP_BOOST, 100, 1, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties BAD_MEMORY = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable BAD_MEMORY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE,1,0, true, false, false))).sound(SoundEvents.AMBIENT_CAVE).consumeSeconds(0.5f).build();
    public static final FoodProperties BISICLE = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable BISICLE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.SPEED, 100, 0, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties UNISICLE = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable UNISICLE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,2, false, false, false),
                    new MobEffectInstance(MobEffects.SPEED, 100, 0, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties CINNAMON = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable CINNAMON_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 100, 1, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties CRABAP = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable CRABAP_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false))).consumeSeconds(0.5f).build();
    public static final FoodProperties DSALAD = new FoodProperties.Builder().nutrition(6).saturationModifier(1).build();
    public static final Consumable DSALAD_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,7, false, false, false),0.1F)).consumeSeconds(0.5f).build();
    public static final FoodProperties GLAMB = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable GLAMB_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,4, false, false, false),
                    new MobEffectInstance(MobEffects.WEAKNESS, 200, 1, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties HOT_CAT = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable HOT_CAT_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 200, 1, false, false, false)))).sound(SoundEvents.CAT_AMBIENT_BABY).consumeSeconds(0.5f).build();
    public static final FoodProperties HOT_DOG = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable HOT_DOG_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 200, 0, false, false, false)))).sound(SoundEvents.WOLF_AMBIENT_BABY).consumeSeconds(0.5f).build();
    public static final FoodProperties HUSH_PUPPY = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable HUSH_PUPPY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,5, false, false, false))).sound(SoundEvents.WOLF_WHINE_BABY).consumeSeconds(0.5f).build();
    public static final FoodProperties INOODLES = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable INOODLES_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,4, false, false, false),
                    new MobEffectInstance(MobEffects.SLOWNESS, 100, 0, false, false, false)))).consumeSeconds(1.5f).build();
    public static final FoodProperties JUNK_FOOD = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable JUNK_FOOD_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false))).consumeSeconds(0.5f).build();
    public static final FoodProperties LAST_DREAM = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable LAST_DREAM_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.GLOWING, 200, 0, true, false, false))))
            .sound(BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY))
            .soundAfterConsume(SoundEvents.NOTE_BLOCK_FLUTE)
            .onConsume(new PlaySoundConsumeEffect(BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.BEACON_ACTIVATE)))
            .consumeSeconds(0.5f).build();
    public static final FoodProperties LEGHERO = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable LEGHERO_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,4, false, false, false),
                    new MobEffectInstance(MobEffects.STRENGTH, 500, 2, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties MCANDY = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable MCANDY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,2, false, false, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 100, 0, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties NICE_CREAM = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable NICE_CREAM_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false))).consumeSeconds(0.5f).build();
    public static final FoodProperties PCHISPS = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable PCHISPS_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.WEAKNESS, 100, 5, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties SEA_TEA = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable SEA_TEA_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,2, false, false, false),
                    new MobEffectInstance(MobEffects.SPEED, 500, 2, false, false, false)))).sound(SoundEvents.GENERIC_DRINK).consumeSeconds(0.5f).build();
    public static final FoodProperties SPIDER_CIDER = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable SPIDER_CIDER_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,4, false, false, false),
                    new MobEffectInstance(MobEffects.SLOWNESS, 100, 1, false, false, false)))).sound(SoundEvents.HONEY_DRINK).consumeSeconds(0.5f).build();
    public static final FoodProperties SPIDER_DONUT = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable SPIDER_DONUT_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.SLOWNESS, 100, 0, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties STARFAIT = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable STARFAIT_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,3, false, false, false),
                    new MobEffectInstance(MobEffects.HUNGER, 200, 0, false, false, false)))).sound(SoundEvents.GENERIC_DRINK).consumeSeconds(0.5f).build();
    public static final FoodProperties STEAK = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable STEAK_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(java.util.List.of(
                    new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,5, false, false, false),
                    new MobEffectInstance(MobEffects.SLOWNESS, 40, 10, false, false, false)))).consumeSeconds(0.5f).build();
    public static final FoodProperties TEMFLAKES = new FoodProperties.Builder().nutrition(0).saturationModifier(0).alwaysEdible().build();
    public static final Consumable TEMFLAKES_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH,1,0, false, false, false))).consumeSeconds(0.5f).build();




    public static final FoodProperties MAXI = new FoodProperties.Builder().nutrition(9).saturationModifier(9).alwaysEdible().build();
    public static final Consumable MAXI_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.REGENERATION, 400, 1),
                            new MobEffectInstance(MobEffects.RESISTANCE, 6000, 0),
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),
                            new MobEffectInstance(MobEffects.ABSORPTION, 6000, 3),
                            new MobEffectInstance(MobEffects.SPEED, 6000, 3),
                            new MobEffectInstance(MobEffects.JUMP_BOOST, 6000, 3),
                            new MobEffectInstance(MobEffects.GLOWING, 6000, 3),
                            new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 3)
                            ))).animation(ItemUseAnimation.DRINK).sound(SoundEvents.HONEY_DRINK).consumeSeconds(3f).build();
}
