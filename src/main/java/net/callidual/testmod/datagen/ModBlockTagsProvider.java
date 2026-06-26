package net.callidual.testmod.datagen;

import net.callidual.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUIN_BRICKS)
                .add(ModBlocks.CRACKED_RUIN_BRICKS)
                .add(ModBlocks.RUIN_FLOOR)
                .add(ModBlocks.RUIN_SEMIFLOOR)
                .add(ModBlocks.RUIN_CEILING)
                .add(ModBlocks.RUIN_BRICKS2)
                .add(ModBlocks.RUIN_BRICKS3)
                .add(ModBlocks.RUIN_BRICKS4)
                .add(ModBlocks.CRACKED_RUIN_BRICKS2)
                .add(ModBlocks.CRACKED_RUIN_BRICKS3)
                .add(ModBlocks.CRACKED_RUIN_BRICKS3_5)
                .add(ModBlocks.CRACKED_RUIN_BRICKS4)
                .add(ModBlocks.CRACKED_RUIN_BRICKS4_5)
                .add(ModBlocks.CRACKED_RUIN_BRICKS5)
                .add(ModBlocks.CRACKED_RUIN_BRICKS5_5);


        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL);
    }
}
