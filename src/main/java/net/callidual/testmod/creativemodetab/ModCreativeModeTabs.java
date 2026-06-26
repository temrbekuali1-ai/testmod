package net.callidual.testmod.creativemodetab;

import net.callidual.testmod.TestMod;
import net.callidual.testmod.block.ModBlocks;
import net.callidual.testmod.items.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.minecraft.resources.Identifier.*;

public class ModCreativeModeTabs {


    public static final CreativeModeTab UNDERTALE_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "undertale_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PIE))
                    .title(Component.translatable("creativemodetab.testmod.undertale_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.CHISEL);
                        output.accept(ModItems.PIE);
                        output.accept(ModItems.SNOWPIS);
                        output.accept(ModItems.QUICHE);
                        output.accept(ModItems.MCANDY);
                        output.accept(ModItems.BISICLE);
                        output.accept(ModItems.UNISICLE);
                        output.accept(ModItems.CINNAMON);
                        output.accept(ModItems.HOT_DOG);
                        output.accept(ModItems.HOT_CAT);
                        output.accept(ModItems.HUSH_PUPPY);
                        output.accept(ModItems.NICE_CREAM);
                        output.accept(ModItems.DSALAD);
                        output.accept(ModItems.SEA_TEA);
                        output.accept(ModItems.CRABAP);
                        output.accept(ModItems.SPIDER_DONUT);
                        output.accept(ModItems.SPIDER_CIDER);
                        output.accept(ModItems.GLAMB);
                        output.accept(ModItems.STARFAIT);
                        output.accept(ModItems.LEGHERO);
                        output.accept(ModItems.STEAK);
                        output.accept(ModItems.JUNK_FOOD);
                        output.accept(ModItems.INOODLES);
                        output.accept(ModItems.PCHISPS);
                        output.accept(ModItems.TEMFLAKES);
                        output.accept(ModItems.ASTROFOOD);
                        output.accept(ModItems.BAD_MEMORY);
                        output.accept(ModItems.LAST_DREAM);
                        output.accept(ModItems.STICK);
                        output.accept(ModItems.BANDAGE);
                        output.accept(ModItems.TOY_KNIFE);
                        output.accept(ModItems.FADED_RIBBON);
                        output.accept(ModItems.TGLOVE);
                        output.accept(ModItems.MANLY_BANDANNA);
                        output.accept(ModItems.BSHOES);
                        output.accept(ModItems.OLD_TUTU);
                        output.accept(ModItems.TORN_NOTE);
                        output.accept(ModItems.CLOUDY_GLASSES);
                        output.accept(ModItems.EMPTY_GUN);
                        output.accept(ModItems.COWBOY_HAT);
                        output.accept(ModItems.BURNT_PAN);
                        output.accept(ModItems.STAINED_APRON);
                        output.accept(ModItems.WORND);
                        output.accept(ModItems.HEART_LOCKET);
                        output.accept(ModItems.REALKNIFE);
                        output.accept(ModItems.THE_LOCKET);
                        output.accept(ModItems.TEM_ARMOR);


                    }).build());


    public static final CreativeModeTab UNDERTALE_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "undertale_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RUIN_BRICKS))
                    .title(Component.translatable("creativemodetab.testmod.undertale_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.RUIN_BRICKS);
                        output.accept(ModBlocks.CRACKED_RUIN_BRICKS);
                        output.accept(ModBlocks.RUIN_SEMIFLOOR);
                        output.accept(ModBlocks.RUIN_FLOOR);
                        output.accept(ModBlocks.RUIN_CEILING);


                    }).build());

    public static void registerModCreativeModeTabs() {
        TestMod.LOGGER.info("Registering Creative Mode Tabs for " + TestMod.MOD_ID);
    }


}
