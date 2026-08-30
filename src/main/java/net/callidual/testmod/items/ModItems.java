package net.callidual.testmod.items;

import com.geckolib.renderer.GeoArmorRenderer;
import net.callidual.testmod.TestMod;
import net.callidual.testmod.food.ModFoods;
import net.callidual.testmod.items.custom.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModItems {
    public static final Item CHISEL = registerItem("tobytool", properties -> new ChiselItem(properties.stacksTo(1).rarity(Rarity.RARE))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.tobytool.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item SNOWPIS = registerItem("snowman_piece", properties -> new Item(properties.food(ModFoods.SNOWPIS, ModFoods.SNOWPIS_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.snowpis.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item PIE = registerItem("butterscotch_pie", properties -> new Item(properties.food(ModFoods.PIE, ModFoods.PIE_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.pie.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});


    public static final Item QUICHE = registerItem("abandoned_quiche", properties -> new Item(properties.food(ModFoods.QUICHE, ModFoods.QUICHE_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.quiche.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item ASTROFOOD = registerItem("astronaut_food", properties -> new Item(properties.food(ModFoods.ASTROFOOD, ModFoods.ASTROFOOD_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.astrofood.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item BADMEM = registerItem("bad_memory", properties -> new Item(properties.food(ModFoods.BAD_MEMORY, ModFoods.BAD_MEMORY_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.badmem.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item BISICLE = registerItem("bisicle", properties -> new Item(properties.food(ModFoods.BISICLE, ModFoods.BISICLE_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.bisicle.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item CINNAMON = registerItem("cinnamon_bunny", properties -> new Item(properties.food(ModFoods.CINNAMON, ModFoods.CINNAMON_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.cinnamon.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item CRABAP = registerItem("crab_apple", properties -> new Item(properties.food(ModFoods.CRABAP, ModFoods.CRABAP_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.crabap.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item DSALAD = registerItem("dog_salad", properties -> new Item(properties.food(ModFoods.DSALAD, ModFoods.DSALAD_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.dsalad.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item GLAMB = registerItem("glamburger", properties -> new Item(properties.food(ModFoods.GLAMB, ModFoods.GLAMB_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.glamb.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item HOT_CAT = registerItem("hot_cat", properties -> new Item(properties.food(ModFoods.HOT_CAT, ModFoods.HOT_CAT_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.hot_cat.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item HOT_DOG = registerItem("hot_dog", properties -> new Item(properties.food(ModFoods.HOT_DOG, ModFoods.HOT_DOG_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.hot_dog.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item HUSH_PUPPY = registerItem("hush_puppy", properties -> new Item(properties.food(ModFoods.HUSH_PUPPY, ModFoods.HUSH_PUPPY_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.hush_puppy.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item INOODLES = registerItem("instant_noodles", properties -> new Item(properties.food(ModFoods.INOODLES, ModFoods.INOODLES_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.inoodles.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item JUNK_FOOD = registerItem("junk_food", properties -> new Item(properties.food(ModFoods.JUNK_FOOD, ModFoods.JUNK_FOOD_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.junk_food.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item LAST_DREAM = registerItem("last_dream", properties -> new Item(properties.food(ModFoods.LAST_DREAM, ModFoods.LAST_DREAM_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.last_dream.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item LEGHERO = registerItem("legendary_hero", properties -> new Item(properties.food(ModFoods.LEGHERO, ModFoods.LEGHERO_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.leghero.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item MCANDY = registerItem("monster_candy", properties -> new Item(properties.food(ModFoods.MCANDY, ModFoods.MCANDY_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.mcandy.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item NICE_CREAM = registerItem("nice_cream", properties -> new Item(properties.food(ModFoods.NICE_CREAM, ModFoods.NICE_CREAM_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.nice_cream.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item PCHISPS = registerItem("popato_chisps", properties -> new Item(properties.food(ModFoods.PCHISPS, ModFoods.PCHISPS_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.pchisps.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item SEA_TEA = registerItem("sea_tea", properties -> new Item(properties.food(ModFoods.SEA_TEA, ModFoods.SEA_TEA_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.sea_tea.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item SPIDER_CIDER = registerItem("spider_cider", properties -> new Item(properties.food(ModFoods.SPIDER_CIDER, ModFoods.SPIDER_CIDER_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.spider_cider.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item SPIDER_DONUT = registerItem("spider_donut", properties -> new Item(properties.food(ModFoods.SPIDER_DONUT, ModFoods.SPIDER_DONUT_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.spider_donut.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item STARFAIT = registerItem("starfait", properties -> new Item(properties.food(ModFoods.STARFAIT, ModFoods.STARFAIT_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.starfait.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item STEAK = registerItem("steak_in_the_shape_of_mettatons_face", properties -> new Item(properties.food(ModFoods.STEAK, ModFoods.STEAK_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.steak.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item TEMFLAKES = registerItem("temmie_flakes", properties -> new Item(properties.food(ModFoods.TEMFLAKES, ModFoods.TEMFLAKES_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item UNISICLE = registerItem("unisicle", properties -> new Item(properties.food(ModFoods.UNISICLE, ModFoods.UNISICLE_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.unisicle.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});


    public static final Item STICK = registerItem("stick", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.WOOD, -0.9F, -2))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.stick.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }

        @Override
        public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
            // Check if the entity is a wolf and we are running on the logical server side
            if (target instanceof Wolf wolf && !player.level().isClientSide()) {
                if (!wolf.isTame()) {

                    wolf.tame(player);

                    wolf.level().broadcastEntityEvent(wolf, (byte) 7);

                    stack.consume(1, player);
                    return InteractionResult.SUCCESS;
                }
            }
            return super.interactLivingEntity(stack, player, target, hand);
        }}
    );

    public static final Item TOY_KNIFE = registerItem("toy_knife", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.GOLD, -1, -2))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.toy_knife.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item TGLOVE = registerItem("tough_glove", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.STONE, 0, -2))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.tglove.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item BSHOES = registerItem("ballet_shoes", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.IRON, 1, -2.3f))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.bshoes.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item TORN_NOTE = registerItem("torn_notebook", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.COPPER, -1, -2.2f)
            .attributes(ItemAttributeModifiers.builder()
                    .add(Attributes.ATTACK_DAMAGE,
                            new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, 1, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ATTACK_SPEED,
                            new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, -2.2, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.KNOCKBACK_RESISTANCE,
                            new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "held_armor_toughness"), 0.05f, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND).build()))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.torn_note.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item BURNT_PAN = registerItem("burnt_pan", properties -> new Item(properties
            .rarity(Rarity.EPIC)
            .sword(ToolMaterial.DIAMOND, 6, -2.4f)
    ) {
        @Override
        public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
            if (!attacker.level().isClientSide()) {
                attacker.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 0));
            }

            super.hurtEnemy(stack, target, attacker);
        }

        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.burnt_pan.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });

    public static final Item EMPTY_GUN = registerItem("empty_gun", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.DIAMOND, 8, -2.4f)
            .attributes(ItemAttributeModifiers.builder()
                    .add(Attributes.ATTACK_DAMAGE,
                            new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, 11, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ATTACK_SPEED,
                            new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, -2.4, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ENTITY_INTERACTION_RANGE,
                            new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "held_range"), 2, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND).build()))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.empty_gun.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item WORND = registerItem("worn_dagger", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.DIAMOND, 11, -3))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.wornd.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item REALKNIFE = registerItem("real_knife", properties -> new Item(properties.sword(ToolMaterial.NETHERITE, 94, -3.1f))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.realknife.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});


    public static final Item BANDAGE = registerItem("bandage", properties -> new ModArmorItem(
            ModArmorMaterials.BANDAGE_MATERIAL, ArmorType.HELMET,
            properties
                    .food(ModFoods.MCANDY, ModFoods.MCANDY_CONSUMABLE)
                    .stacksTo(1))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.bandage.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item FADED_RIBBON = registerItem("faded_ribbon", properties -> new ModArmorItem(
            ModArmorMaterials.RIBBON_MATERIAL, ArmorType.HELMET,
            properties
                    .attributes(ItemAttributeModifiers.builder()
                              .add(Attributes.ARMOR_TOUGHNESS,
                              new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "faded_ribbon"),
                                      5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                            .build())
                    .stacksTo(1))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.ribbon.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item MANLY_BANDANNA = registerItem("manly_bandanna", properties -> new ModArmorItem(
            ModArmorMaterials.BANDANNA_MATERIAL, ArmorType.HELMET,
            properties
                    .stacksTo(1))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.bandanna.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item OLD_TUTU = registerItem("old_tutu", properties -> new ModArmorItem(
            ModArmorMaterials.TUTU_MATERIAL, ArmorType.LEGGINGS,
            properties
                    .stacksTo(1))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.old_tutu.info", builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    }

    );

    public static final Item CLOUDY_GLASSES = registerItem("cloudy_glasses", properties -> new ModArmorItem(
            ModArmorMaterials.GLASSES_MATERIAL, ArmorType.HELMET,
            properties
                    .attributes(ModArmorMaterials.GLASSES_MATERIAL.createAttributes(ArmorType.HELMET)
                            .withModifierAdded(Attributes.KNOCKBACK_RESISTANCE,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "cloudy_res"),
                                            2.0, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.HEAD))
                    .stacksTo(1))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.glasses.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item TEM_ARMOR = registerItem("temmie_armor", properties -> new ModArmorItem(
            ModArmorMaterials.TEMMIE_MATERIAL, ArmorType.CHESTPLATE,
            properties
                    .stacksTo(1)
                    .rarity(Rarity.RARE))
    {
        @Override
        public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
            if (entity instanceof Player player && slot == EquipmentSlot.CHEST) {
                player.addEffect(new MobEffectInstance(
                        MobEffects.STRENGTH,
                        40,
                        2,
                        false,
                        false,
                        false
                ));
            }

            super.inventoryTick(stack, level, entity, slot);
        }
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.tem_armor.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item STAINED_APRON = registerItem("stained_apron", properties -> new ModArmorItem(
            ModArmorMaterials.APRON_MATERIAL, ArmorType.CHESTPLATE,
            properties
                    .stacksTo(1))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.apron.info",builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item COWBOY_HAT = registerItem("cowboy_hat", properties -> new ModArmorItem(
            ModArmorMaterials.COWBOY_MATERIAL, ArmorType.HELMET,
            properties
                    .stacksTo(1)

            ) {
                @Override
                public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
                    if (entity instanceof Player player && slot == EquipmentSlot.HEAD) {
                        player.addEffect(new MobEffectInstance(
                                MobEffects.STRENGTH,
                                40,
                                0,
                                false,
                                false,
                                false
                        ));
                    }

                    super.inventoryTick(stack, level, entity, slot);
                }

                @Override
                public void appendHoverText(
                        ItemStack itemStack,
                        TooltipContext context,
                        TooltipDisplay display,
                        Consumer<Component> builder,
                        TooltipFlag tooltipFlag
                ) {
                    ModItems.addMultilineTooltip("tooltip.testmod.cowboy_hat.info", builder);
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            }
    );

    public static final Item HEART_LOCKET = registerItem("heart_locket", properties -> new ModArmorItem(
            ModArmorMaterials.HEART_MATERIAL, ArmorType.CHESTPLATE,
            properties
                    .stacksTo(1)
                    .rarity(Rarity.RARE))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.heart_locket.info", builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});

    public static final Item THE_LOCKET = registerItem("the_locket", properties -> new ModArmorItem(
            ModArmorMaterials.LOCKET_MATERIAL, ArmorType.CHESTPLATE,
            properties
                    .stacksTo(1))
    {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            ModItems.addMultilineTooltip("tooltip.testmod.the_locket.info", builder);
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }});


    public static final Item MAXI = registerItem("___", properties -> new Item(properties.food(ModFoods.MAXI, ModFoods.MAXI_CONSUMABLE).stacksTo(1).rarity(Rarity.RARE)));

    // Helper method at the bottom of ModItems.java
    public static void addMultilineTooltip(String key, Consumer<Component> builder) {
        String translation = Component.translatable(key).getString();
        for (String line : translation.split("\n")) {
            builder.accept(Component.literal(line));
        }
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name)))));
    }
    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
    }
}