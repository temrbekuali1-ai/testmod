package net.callidual.testmod.items.custom;

import net.callidual.testmod.TestMod;
import net.callidual.testmod.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>>
            REGISTRY_KEY = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> BANDAGE_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "bandage"));
    public static final ResourceKey<EquipmentAsset> RIBBON_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "faded_ribbon"));
    public static final ResourceKey<EquipmentAsset> BANDANNA_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "manly_bandanna"));
    public static final ResourceKey<EquipmentAsset> TUTU_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "old_tutu"));
    public static final ResourceKey<EquipmentAsset> GLASSES_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "cloudy_glasses"));
    public static final ResourceKey<EquipmentAsset> TEMMIE_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "temmie_armor"));
    public static final ResourceKey<EquipmentAsset> APRON_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "stained_apron"));
    public static final ResourceKey<EquipmentAsset> COWBOY_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "cowboy_hat"));
    public static final ResourceKey<EquipmentAsset> HEART_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "heart_locket"));
    public static final ResourceKey<EquipmentAsset> LOCKET_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "the_locket"));



    public static final ArmorMaterial BANDAGE_MATERIAL = new ArmorMaterial(7, ArmorMaterials.makeDefense(0,0,0,0,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0.07f, ModTags.Items.REPAIR, BANDAGE_KEY);

    public static final ArmorMaterial RIBBON_MATERIAL = new ArmorMaterial(9, ArmorMaterials.makeDefense(0,0,0,3,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0.5f, ModTags.Items.REPAIR, RIBBON_KEY);

    public static final ArmorMaterial BANDANNA_MATERIAL = new ArmorMaterial(9, ArmorMaterials.makeDefense(0,0,0,7,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, ModTags.Items.REPAIR, BANDANNA_KEY);

    public static final ArmorMaterial TUTU_MATERIAL = new ArmorMaterial(9, ArmorMaterials.makeDefense(0,10,0,0,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, ModTags.Items.REPAIR, TUTU_KEY);

    public static final ArmorMaterial GLASSES_MATERIAL = new ArmorMaterial(11, ArmorMaterials.makeDefense(0,0,0,5,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0.1f, ModTags.Items.REPAIR, GLASSES_KEY);

    public static final ArmorMaterial TEMMIE_MATERIAL = new ArmorMaterial(16, ArmorMaterials.makeDefense(0,0,20,0,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 1, 0.05f, ModTags.Items.REPAIR, TEMMIE_KEY);

    public static final ArmorMaterial APRON_MATERIAL = new ArmorMaterial(9, ArmorMaterials.makeDefense(0,0,11,0,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 1, 0, ModTags.Items.REPAIR, APRON_KEY);

    public static final ArmorMaterial COWBOY_MATERIAL = new ArmorMaterial(9, ArmorMaterials.makeDefense(0,0,0,12,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, ModTags.Items.REPAIR, COWBOY_KEY);

    public static final ArmorMaterial HEART_MATERIAL = new ArmorMaterial(14, ArmorMaterials.makeDefense(0,0,15,0,0),
            7, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, ModTags.Items.REPAIR, HEART_KEY);

    public static final ArmorMaterial LOCKET_MATERIAL = new ArmorMaterial(66, ArmorMaterials.makeDefense(0,0,99,0,0),
            999, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, ModTags.Items.REPAIR, LOCKET_KEY);
}