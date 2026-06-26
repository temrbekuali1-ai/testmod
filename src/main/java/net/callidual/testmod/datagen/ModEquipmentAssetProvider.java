package net.callidual.testmod.datagen;

import net.callidual.testmod.TestMod;
import net.callidual.testmod.items.custom.ModArmorMaterials;
import net.minecraft.client.gui.screens.AccessibilityOnboardingScreen;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEquipmentAssetProvider implements DataProvider {
    private final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {

        consumer.accept(ModArmorMaterials.BANDAGE_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "bandage"))
                        .build());
        consumer.accept(ModArmorMaterials.RIBBON_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "faded_ribbon"))
                        .build());
        consumer.accept(ModArmorMaterials.BANDANNA_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "manly_bandanna"))
                        .build());
        consumer.accept(ModArmorMaterials.TUTU_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "old_tutu"))
                        .build());
        consumer.accept(ModArmorMaterials.GLASSES_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "cloudy_glasses"))
                        .build());
        consumer.accept(ModArmorMaterials.TEMMIE_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "temmie_armor"))
                        .build());
        consumer.accept(ModArmorMaterials.APRON_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "stained_apron"))
                        .build());
        consumer.accept(ModArmorMaterials.COWBOY_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "cowboy_hat"))
                        .build());
        consumer.accept(ModArmorMaterials.HEART_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "heart_locket"))
                        .build());
        consumer.accept(ModArmorMaterials.LOCKET_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "the_locket"))
                        .build());
    }
    @Override
    public CompletableFuture<?> run(final CachedOutput cache) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap<>();
        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
            }
        });
        return DataProvider.saveAll(cache, EquipmentClientInfo.CODEC, this.pathProvider::json, equipmentAssets);
    }

    @Override
    public String getName() {
        return "Test Mod Equipment Asset Definition ";
    }
}
