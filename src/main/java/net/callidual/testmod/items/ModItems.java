package net.callidual.testmod.items;

import net.callidual.testmod.TestMod;
import net.callidual.testmod.food.ModFoods;
import net.callidual.testmod.items.custom.ChiselItem;
import net.callidual.testmod.items.custom.ModArmorMaterials;
import net.callidual.testmod.items.custom.RealKnifeItem;
import net.callidual.testmod.items.custom.TheLocketItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {
    public static final Item CHISEL = registerItem("tobytool", properties -> new ChiselItem(properties.stacksTo(1).rarity(Rarity.RARE)));
    public static final Item SNOWPIS = registerItem("snowman_piece", properties -> new Item(properties.food(ModFoods.SNOWPIS, ModFoods.SNOWPIS_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item PIE = registerItem("butterscotch_pie", properties -> new Item(properties.food(ModFoods.PIE, ModFoods.PIE_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final Item QUICHE = registerItem("abandoned_quiche", properties -> new Item(properties.food(ModFoods.QUICHE, ModFoods.QUICHE_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item ASTROFOOD = registerItem("astronaut_food", properties -> new Item(properties.food(ModFoods.ASTROFOOD, ModFoods.ASTROFOOD_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item BAD_MEMORY = registerItem("bad_memory", properties -> new Item(properties.food(ModFoods.BAD_MEMORY, ModFoods.BAD_MEMORY_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item BISICLE = registerItem("bisicle", properties -> new Item(properties.food(ModFoods.BISICLE, ModFoods.BISICLE_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item CINNAMON = registerItem("cinnamon_bunny", properties -> new Item(properties.food(ModFoods.CINNAMON, ModFoods.CINNAMON_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item CRABAP = registerItem("crab_apple", properties -> new Item(properties.food(ModFoods.CRABAP, ModFoods.CRABAP_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item DSALAD = registerItem("dog_salad", properties -> new Item(properties.food(ModFoods.DSALAD, ModFoods.DSALAD_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item GLAMB = registerItem("glamburger", properties -> new Item(properties.food(ModFoods.GLAMB, ModFoods.GLAMB_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item HOT_CAT = registerItem("hot_cat", properties -> new Item(properties.food(ModFoods.HOT_CAT, ModFoods.HOT_CAT_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item HOT_DOG = registerItem("hot_dog", properties -> new Item(properties.food(ModFoods.HOT_DOG, ModFoods.HOT_DOG_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item HUSH_PUPPY = registerItem("hush_puppy", properties -> new Item(properties.food(ModFoods.HUSH_PUPPY, ModFoods.HUSH_PUPPY_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item INOODLES = registerItem("instant_noodles", properties -> new Item(properties.food(ModFoods.INOODLES, ModFoods.INOODLES_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item JUNK_FOOD = registerItem("junk_food", properties -> new Item(properties.food(ModFoods.JUNK_FOOD, ModFoods.JUNK_FOOD_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item LAST_DREAM = registerItem("last_dream", properties -> new Item(properties.food(ModFoods.LAST_DREAM, ModFoods.LAST_DREAM_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item LEGHERO = registerItem("legendary_hero", properties -> new Item(properties.food(ModFoods.LEGHERO, ModFoods.LEGHERO_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item MCANDY = registerItem("monster_candy", properties -> new Item(properties.food(ModFoods.MCANDY, ModFoods.MCANDY_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item NICE_CREAM = registerItem("nice_cream", properties -> new Item(properties.food(ModFoods.NICE_CREAM, ModFoods.NICE_CREAM_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item PCHISPS = registerItem("popato_chisps", properties -> new Item(properties.food(ModFoods.PCHISPS, ModFoods.PCHISPS_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item SEA_TEA = registerItem("sea_tea", properties -> new Item(properties.food(ModFoods.SEA_TEA, ModFoods.SEA_TEA_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item SPIDER_CIDER = registerItem("spider_cider", properties -> new Item(properties.food(ModFoods.SPIDER_CIDER, ModFoods.SPIDER_CIDER_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item SPIDER_DONUT = registerItem("spider_donut", properties -> new Item(properties.food(ModFoods.SPIDER_DONUT, ModFoods.SPIDER_DONUT_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item STARFAIT = registerItem("starfait", properties -> new Item(properties.food(ModFoods.STARFAIT, ModFoods.STARFAIT_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item STEAK = registerItem("steak_in_the_shape_of_mettatons_face", properties -> new Item(properties.food(ModFoods.STEAK, ModFoods.STEAK_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item TEMFLAKES = registerItem("temmie_flakes", properties -> new Item(properties.food(ModFoods.TEMFLAKES, ModFoods.TEMFLAKES_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));
    public static final Item UNISICLE = registerItem("unisicle", properties -> new Item(properties.food(ModFoods.UNISICLE, ModFoods.UNISICLE_CONSUMABLE).stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final Item STICK = registerItem("stick", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.WOOD, -0.9F, -2)));
    public static final Item TOY_KNIFE = registerItem("toy_knife", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.GOLD, 2, -2)));
    public static final Item TGLOVE = registerItem("tough_glove", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.STONE, 0, -2)
            .attributes(ItemAttributeModifiers.builder()
                    .add(Attributes.ATTACK_DAMAGE,
                            new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, 4, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ATTACK_SPEED,
                            new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, -2, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ARMOR_TOUGHNESS,
                            new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "held_armor"), 5, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND).build())));
    public static final Item BSHOES = registerItem("ballet_shoes", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.IRON, 4, -2.3f)));
    public static final Item TORN_NOTE = registerItem("torn_notebook", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.COPPER, -1, -2.2f)
            .attributes(ItemAttributeModifiers.builder()
                    .add(Attributes.ATTACK_DAMAGE,
                            new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, 1, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ATTACK_SPEED,
                            new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, -2.2, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.KNOCKBACK_RESISTANCE,
                            new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "held_prot"), 0.5, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND).build())));
    public static final Item BURNT_PAN = registerItem("burnt_pan", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.DIAMOND, 6, -2.4f)
            .attributes(ItemAttributeModifiers.builder()
                    .add(Attributes.ATTACK_DAMAGE,
                            new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, 9, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ATTACK_SPEED,
                            new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, -2.4, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ARMOR_TOUGHNESS,
                            new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "held_armor"), 2, AttributeModifier.Operation.ADD_VALUE),
                            EquipmentSlotGroup.MAINHAND).build())));
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
                            EquipmentSlotGroup.MAINHAND).build())));
    public static final Item WORND = registerItem("worn_dagger", properties -> new Item(properties.rarity(Rarity.EPIC).sword(ToolMaterial.DIAMOND, 11, -3)));
    public static final Item REALKNIFE = registerItem("real_knife", properties -> new RealKnifeItem(properties.sword(ToolMaterial.NETHERITE, 94, -3.1f)));

    public static final Item BANDAGE = registerItem("bandage", properties -> new Item(
            properties
                    .food(ModFoods.MCANDY, ModFoods.MCANDY_CONSUMABLE)
                    .stacksTo(1)
                    .humanoidArmor(ModArmorMaterials.BANDAGE_MATERIAL, ArmorType.HELMET)));

    public static final Item FADED_RIBBON = registerItem("faded_ribbon", properties -> new Item(
            properties
                    .attributes(ItemAttributeModifiers.builder()
                              .add(Attributes.ARMOR_TOUGHNESS,
                              new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "faded_ribbon"),
                                      5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                            .build())
                    .stacksTo(1)
                    .humanoidArmor(ModArmorMaterials.RIBBON_MATERIAL, ArmorType.HELMET)));

    public static final Item MANLY_BANDANNA = registerItem("manly_bandanna", properties -> new Item(
            properties
                    .attributes(ModArmorMaterials.BANDANNA_MATERIAL.createAttributes(ArmorType.HELMET)
                            .withModifierAdded(Attributes.ATTACK_SPEED,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "mandanna_speed"),
                                            2.0, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.HEAD))
                    .stacksTo(1)
                    .humanoidArmor(ModArmorMaterials.BANDANNA_MATERIAL, ArmorType.HELMET)));

    public static final Item OLD_TUTU = registerItem("old_tutu", properties -> new Item(
            properties
                    .attributes(ModArmorMaterials.TUTU_MATERIAL.createAttributes(ArmorType.LEGGINGS)
                            .withModifierAdded(Attributes.JUMP_STRENGTH,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "tutu_jump"),
                                            1.0, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.LEGS))
                    .stacksTo(1)
                    .humanoidArmor(ModArmorMaterials.TUTU_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item CLOUDY_GLASSES = registerItem("cloudy_glasses", properties -> new Item(
            properties
                    .attributes(ModArmorMaterials.GLASSES_MATERIAL.createAttributes(ArmorType.HELMET)
                            .withModifierAdded(Attributes.KNOCKBACK_RESISTANCE,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "cloudy_res"),
                                            2.0, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.HEAD))
                    .stacksTo(1)
                    .humanoidArmor(ModArmorMaterials.GLASSES_MATERIAL, ArmorType.HELMET)));

    public static final Item TEM_ARMOR = registerItem("temmie_armor", properties -> new Item(
            properties
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
                    .attributes(ItemAttributeModifiers.builder()
                            .add(Attributes.ATTACK_DAMAGE,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "temmie_attack"),
                                            10.0, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.CHEST)
                            .add(Attributes.ARMOR_TOUGHNESS,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "temmie_tuff"),
                                            1.0, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.CHEST)
                            .add(Attributes.KNOCKBACK_RESISTANCE,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "temmie_res"),
                                            0.05, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.CHEST)
                            .build())
                    .humanoidArmor(ModArmorMaterials.TEMMIE_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item STAINED_APRON = registerItem("stained_apron", properties -> new Item(
            properties
                    .attributes(ModArmorMaterials.APRON_MATERIAL.createAttributes(ArmorType.CHESTPLATE)
                            .withModifierAdded(Attributes.ARMOR_TOUGHNESS,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "apron_tuff"),
                                            2.0, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.CHEST))
                    .stacksTo(1)
                    .humanoidArmor(ModArmorMaterials.APRON_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item COWBOY_HAT = registerItem("cowboy_hat", properties -> new Item(
            properties
                    .stacksTo(1)
                    // Use the material's default attributes as the starting baseline
                    .attributes(ModArmorMaterials.COWBOY_MATERIAL.createAttributes(ArmorType.HELMET)
                            .withModifierAdded(Attributes.ATTACK_DAMAGE,
                                    new AttributeModifier(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "cowboy_attack"),
                                            5.0, AttributeModifier.Operation.ADD_VALUE),
                                    EquipmentSlotGroup.HEAD))
                    .humanoidArmor(ModArmorMaterials.COWBOY_MATERIAL, ArmorType.HELMET)));

    public static final Item HEART_LOCKET = registerItem("heart_locket", properties -> new Item(
            properties
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
                    .humanoidArmor(ModArmorMaterials.HEART_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item THE_LOCKET = registerItem("the_locket", properties -> new TheLocketItem(
            properties
                    .stacksTo(1)
                    .humanoidArmor(ModArmorMaterials.LOCKET_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item MAXI = registerItem("___", properties -> new Item(properties.food(ModFoods.MAXI, ModFoods.MAXI_CONSUMABLE).stacksTo(1).rarity(Rarity.RARE)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name)))));
    }
    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
    }
}