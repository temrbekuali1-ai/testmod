package net.callidual.testmod.datagen;

import net.callidual.testmod.block.ModBlocks;
import net.callidual.testmod.items.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.RUIN_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CRACKED_RUIN_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.RUIN_FLOOR);
        blockModelGenerators.createTrivialCube(ModBlocks.RUIN_SEMIFLOOR);
        blockModelGenerators.createTrivialCube(ModBlocks.RUIN_CEILING);
        blockModelGenerators.createTrivialCube(ModBlocks.RUIN_BRICKS2);
        blockModelGenerators.createTrivialCube(ModBlocks.RUIN_BRICKS3);
        blockModelGenerators.createTrivialCube(ModBlocks.RUIN_BRICKS4);
        blockModelGenerators.createTrivialCube(ModBlocks.CRACKED_RUIN_BRICKS2);
        blockModelGenerators.createTrivialCube(ModBlocks.CRACKED_RUIN_BRICKS3);
        blockModelGenerators.createTrivialCube(ModBlocks.CRACKED_RUIN_BRICKS3_5);
        blockModelGenerators.createTrivialCube(ModBlocks.CRACKED_RUIN_BRICKS4);
        blockModelGenerators.createTrivialCube(ModBlocks.CRACKED_RUIN_BRICKS4_5);
        blockModelGenerators.createTrivialCube(ModBlocks.CRACKED_RUIN_BRICKS5);
        blockModelGenerators.createTrivialCube(ModBlocks.CRACKED_RUIN_BRICKS5_5);

        blockModelGenerators.createTrivialCube(ModBlocks.START_BLACK);
        blockModelGenerators.createTrivialCube(ModBlocks.START_GRAY);

        blockModelGenerators.createNonTemplateModelBlock(ModBlocks.START_BLOCK1);
        blockModelGenerators.createNonTemplateModelBlock(ModBlocks.START_BLOCK2);
        blockModelGenerators.createNonTemplateModelBlock(ModBlocks.START_BLOCK3);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.SNOWPIS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PIE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHISEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUICHE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BAD_MEMORY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BISICLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.UNISICLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CINNAMON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CRABAP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DSALAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GLAMB, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HOT_CAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HOT_DOG, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HUSH_PUPPY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.INOODLES, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.JUNK_FOOD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LAST_DREAM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LEGHERO, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MCANDY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NICE_CREAM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PCHISPS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SEA_TEA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SPIDER_CIDER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SPIDER_DONUT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STARFAIT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STEAK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TEMFLAKES, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ASTROFOOD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.REALKNIFE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WORND, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BURNT_PAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMPTY_GUN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TORN_NOTE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BSHOES, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TGLOVE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOY_KNIFE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STICK, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.BANDAGE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FADED_RIBBON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MANLY_BANDANNA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.OLD_TUTU, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CLOUDY_GLASSES, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TEM_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STAINED_APRON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.COWBOY_HAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HEART_LOCKET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.THE_LOCKET, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.MAXI, ModelTemplates.FLAT_ITEM);
    }
}
