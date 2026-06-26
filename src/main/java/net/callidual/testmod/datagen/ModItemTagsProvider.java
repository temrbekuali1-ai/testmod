package net.callidual.testmod.datagen;

import net.callidual.testmod.items.ModItems;
import net.callidual.testmod.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
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
                .add(ModItems.BANDAGE);
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
    }
}