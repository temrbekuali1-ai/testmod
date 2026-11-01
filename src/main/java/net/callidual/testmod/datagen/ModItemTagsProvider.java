package net.callidual.testmod.datagen;

import net.callidual.testmod.items.ModItems;
import net.callidual.testmod.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

import static net.callidual.testmod.tags.ModTags.Items.*;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(ModTags.Items.WEAPONS)
                .add(ModItems.STICK)
                .add(ModItems.TOY_KNIFE)
                .add(ModItems.TGLOVE)
                .add(ModItems.BSHOES)
                .add(ModItems.TORN_NOTE)
                .add(ModItems.EMPTY_GUN)
                .add(ModItems.BURNT_PAN)
                .add(ModItems.WORND)
                .add(ModItems.REALKNIFE);
        valueLookupBuilder(ModTags.Items.ARMORS)
                .add(ModItems.BANDAGE)
                .add(ModItems.FADED_RIBBON)
                .add(ModItems.MANLY_BANDANNA)
                .add(ModItems.OLD_TUTU)
                .add(ModItems.CLOUDY_GLASSES)
                .add(ModItems.TEM_ARMOR)
                .add(ModItems.COWBOY_HAT)
                .add(ModItems.HEART_LOCKET)
                .add(ModItems.THE_LOCKET);

        valueLookupBuilder(REPAIR_STICK)
                .add(Items.STICK);

        valueLookupBuilder(REPAIR_TOY)
                .add(Items.CLAY_BALL);

        valueLookupBuilder(REPAIR_GLOVE)
                .add(Items.LEATHER);

        valueLookupBuilder(REPAIR_SHOES)
                .add(Items.IRON_NUGGET);

        valueLookupBuilder(REPAIR_NOTE)
                .add(Items.BOOK);

        valueLookupBuilder(REPAIR_GUN)
                .add(Items.IRON_INGOT);

        valueLookupBuilder(REPAIR_PAN)
                .add(Items.IRON_INGOT);

        valueLookupBuilder(REPAIR_WORN)
                .add(Items.IRON_SWORD);
    }
}