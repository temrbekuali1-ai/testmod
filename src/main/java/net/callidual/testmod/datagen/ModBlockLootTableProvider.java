package net.callidual.testmod.datagen;

import net.callidual.testmod.block.ModBlocks;
import net.callidual.testmod.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.CRACKED_RUIN_BRICKS);
        dropSelf(ModBlocks.RUIN_BRICKS);
        dropSelf(ModBlocks.RUIN_FLOOR);
        dropSelf(ModBlocks.RUIN_SEMIFLOOR);
        dropSelf(ModBlocks.RUIN_CEILING);
        dropOther(ModBlocks.RUIN_BRICKS2, ModBlocks.RUIN_BRICKS);
        dropOther(ModBlocks.RUIN_BRICKS3, ModBlocks.RUIN_BRICKS);
        dropOther(ModBlocks.RUIN_BRICKS4, ModBlocks.RUIN_BRICKS);
        dropOther(ModBlocks.CRACKED_RUIN_BRICKS2, ModBlocks.CRACKED_RUIN_BRICKS);
        dropOther(ModBlocks.CRACKED_RUIN_BRICKS3, ModBlocks.CRACKED_RUIN_BRICKS);
        dropOther(ModBlocks.CRACKED_RUIN_BRICKS3_5, ModBlocks.CRACKED_RUIN_BRICKS);
        dropOther(ModBlocks.CRACKED_RUIN_BRICKS4, ModBlocks.CRACKED_RUIN_BRICKS);
        dropOther(ModBlocks.CRACKED_RUIN_BRICKS4_5, ModBlocks.CRACKED_RUIN_BRICKS);
        dropOther(ModBlocks.CRACKED_RUIN_BRICKS5, ModBlocks.CRACKED_RUIN_BRICKS);
        dropOther(ModBlocks.CRACKED_RUIN_BRICKS5_5, ModBlocks.CRACKED_RUIN_BRICKS);

        dropSelf(ModBlocks.START_GRAY);
        dropSelf(ModBlocks.START_BLACK);


    }

    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(block,this.applyExplosionDecay(
                        block,LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}
