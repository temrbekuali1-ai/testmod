package net.callidual.testmod.datagen;

import net.callidual.testmod.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.SmokingRecipe;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                //List<ItemLike> UNDERTALE = (List.of(Items.MANGROVE_PROPAGULE,ModItems.HOT_DOG));
                shapeless(RecipeCategory.MISC, ModItems.BISICLE)
                        .requires(ModItems.UNISICLE)
                        .requires(ModItems.UNISICLE)
                        .unlockedBy(getHasName(ModItems.UNISICLE), has(ModItems.UNISICLE))
                        .group("xsicle")
                        .save(output, "bisicle_from_unisicle");

                shapeless(RecipeCategory.MISC, ModItems.UNISICLE)
                        .requires(ModItems.BISICLE)
                        .unlockedBy(getHasName(ModItems.UNISICLE), has(ModItems.UNISICLE))
                        .group("xsicle")
                        .save(output, "unisicle_from_bisicle");

                simpleCookingRecipe(null, SmokingRecipe::new, 200, Items.MANGROVE_PROPAGULE, ModItems.HOT_DOG, 2.2f);
                simpleCookingRecipe(null, SmokingRecipe::new, 200, ModItems.HOT_DOG, ModItems.HOT_CAT, 2.2f);

                shaped(RecipeCategory.COMBAT, ModItems.BANDAGE)
                        .pattern("APA")
                        .define('P', Items.PAPER)
                        .define('A', Items.APPLE)
                        .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                        .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FADED_RIBBON)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("SHS")
                        .define('R', Items.RED_WOOL)
                        .define('S', Items.STRING)
                        .define('H', Items.RABBIT_HIDE)
                        .unlockedBy(getHasName(Items.RABBIT_HIDE), has(Items.RABBIT_HIDE))
                        .unlockedBy(getHasName(Items.RED_WOOL), has(Items.RED_WOOL))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.MANLY_BANDANNA)
                        .pattern("SOS")
                        .pattern("ODO")
                        .pattern("HOH")
                        .define('O', Items.ORANGE_WOOL)
                        .define('S', Items.STRING)
                        .define('D', Items.SHIELD)
                        .define('H', Items.RABBIT_HIDE)
                        .unlockedBy(getHasName(Items.SHIELD), has(Items.SHIELD))
                        .unlockedBy(getHasName(Items.ORANGE_WOOL), has(Items.ORANGE_WOOL))
                        .unlockedBy(getHasName(Items.RABBIT_HIDE), has(Items.RABBIT_HIDE))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.OLD_TUTU)
                        .pattern("S S")
                        .pattern("PNP")
                        .pattern("WPW")
                        .define('P', Items.PINK_WOOL)
                        .define('W', Items.WHITE_WOOL)
                        .define('S', Items.STRING)
                        .define('N', Items.NETHERITE_INGOT)
                        .unlockedBy(getHasName(Items.PINK_WOOL), has(Items.PINK_WOOL))
                        .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.CLOUDY_GLASSES)
                        .pattern("C C")
                        .pattern("WNW")
                        .define('W', Items.WHITE_STAINED_GLASS)
                        .define('N', Items.NETHERITE_INGOT)
                        .define('C', Items.NETHERITE_SCRAP)
                        .unlockedBy(getHasName(Items.WHITE_STAINED_GLASS), has(Items.WHITE_STAINED_GLASS))
                        .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.COWBOY_HAT)
                        .pattern("LLL")
                        .pattern("N N")
                        .define('N', Items.NETHERITE_INGOT)
                        .define('L', Items.LEATHER)
                        .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.STAINED_APRON)
                        .pattern("SCS")
                        .pattern("HTH")
                        .pattern("HHH")
                        .define('T', Items.TURTLE_SCUTE)
                        .define('S', Items.STRING)
                        .define('C', Items.NETHERITE_SCRAP)
                        .define('H', Items.RABBIT_HIDE)
                        .unlockedBy(getHasName(Items.NETHERITE_SCRAP), has(Items.NETHERITE_SCRAP))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.HEART_LOCKET)
                        .pattern("S S")
                        .pattern("GEG")
                        .pattern(" G ")
                        .define('S', Items.STRING)
                        .define('G', Items.GOLD_BLOCK)
                        .define('E', Items.ENCHANTED_GOLDEN_APPLE)
                        .unlockedBy(getHasName(Items.ENCHANTED_GOLDEN_APPLE), has(Items.ENCHANTED_GOLDEN_APPLE))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.THE_LOCKET)
                        .pattern("C C")
                        .pattern("GSG")
                        .pattern(" G ")
                        .define('C', Items.NETHERITE_SCRAP)
                        .define('G', Items.GOLD_BLOCK)
                        .define('S', Items.NETHER_STAR)
                        .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TEM_ARMOR)
                        .pattern("D D")
                        .pattern("GNG")
                        .pattern("CTC")
                        .define('C', Items.NETHERITE_SCRAP)
                        .define('G', Items.GOLD_INGOT)
                        .define('D', Items.DIAMOND)
                        .define('T', ModItems.TEMFLAKES)
                        .define('N', Items.NETHERITE_CHESTPLATE)
                        .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
                        .unlockedBy(getHasName(ModItems.TEMFLAKES), has(ModItems.TEMFLAKES))
                        .unlockedBy(getHasName(Items.NETHERITE_CHESTPLATE), has(Items.NETHERITE_CHESTPLATE))
                        .group("utarmor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TOY_KNIFE)
                        .pattern(" C ")
                        .pattern(" C ")
                        .pattern(" F ")
                        .define('C', Items.CLAY_BALL)
                        .define('F', Items.FLINT)
                        .unlockedBy(getHasName(Items.CLAY_BALL), has(Items.CLAY_BALL))
                        .group("utweapons")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TGLOVE)
                        .pattern("LLL")
                        .pattern("LIL")
                        .pattern("SFS")
                        .define('F', Items.FLINT)
                        .define('L', Items.LEATHER)
                        .define('S', Items.STRING)
                        .define('I', Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .group("utweapons")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BSHOES)
                        .pattern("i i")
                        .pattern("I I")
                        .pattern("WSW")
                        .define('S', Items.STRING)
                        .define('I', Items.IRON_INGOT)
                        .define('i', Items.IRON_NUGGET)
                        .define('W', Items.WHITE_WOOL)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .group("utweapons")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TORN_NOTE)
                        .pattern("LPD")
                        .pattern("LNL")
                        .pattern("DPL")
                        .define('D', Items.PURPLE_DYE)
                        .define('N', Items.NAUTILUS_SHELL)
                        .define('P', Items.PAPER)
                        .define('L', Items.LEATHER)
                        .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                        .group("utweapons")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.EMPTY_GUN)
                        .pattern("C  ")
                        .pattern("IIN")
                        .pattern("L  ")
                        .define('C', Items.NETHERITE_SCRAP)
                        .define('I', Items.IRON_INGOT)
                        .define('N', Items.NETHERITE_INGOT)
                        .define('L', Items.LEATHER)
                        .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                        .unlockedBy(getHasName(Items.NETHERITE_SCRAP), has(Items.NETHERITE_SCRAP))
                        .group("utweapons")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BURNT_PAN)
                        .pattern("II ")
                        .pattern("IN ")
                        .pattern("  N")
                        .define('I', Items.IRON_INGOT)
                        .define('N', Items.NETHERITE_INGOT)
                        .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                        .group("utweapons")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WORND)
                        .pattern("GIG")
                        .pattern("FTI")
                        .pattern("NFG")
                        .define('F', Items.FLINT)
                        .define('N', Items.NETHERITE_INGOT)
                        .define('G', Items.GUNPOWDER)
                        .define('I', Items.IRON_INGOT)
                        .define('T', ModItems.TOY_KNIFE)
                        .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                        .unlockedBy(getHasName(ModItems.TOY_KNIFE), has(ModItems.TOY_KNIFE))
                        .group("utweapons")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.REALKNIFE)
                        .pattern("nNN")
                        .pattern("rWN")
                        .pattern("Rrn")
                        .define('N', Items.NETHERITE_INGOT)
                        .define('W', ModItems.WORND)
                        .define('n', Items.NETHER_WART)
                        .define('r', Items.REDSTONE)
                        .define('R', Items.REDSTONE_BLOCK)
                        .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                        .group("utweapons")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.BISICLE)
                        .pattern("BB")
                        .pattern("II")
                        .pattern("SS")
                        .define('S', Items.STICK)
                        .define('I', Items.ICE)
                        .define('B', Items.SWEET_BERRIES)
                        .unlockedBy(getHasName(Items.ICE), has(Items.ICE))
                        .group("utfood")
                        .save(output, "bisicle_from_crafting");

                shaped(RecipeCategory.FOOD, ModItems.UNISICLE)
                        .pattern("B")
                        .pattern("I")
                        .pattern("S")
                        .define('S', Items.STICK)
                        .define('I', Items.ICE)
                        .define('B', Items.SWEET_BERRIES)
                        .unlockedBy(getHasName(Items.ICE), has(Items.ICE))
                        .group("utfood")
                        .save(output, "unisicle_from_crafting");

                shaped(RecipeCategory.FOOD, ModItems.SNOWPIS)
                        .pattern("121")
                        .pattern("343")
                        .pattern("121")
                        .define('1', Items.SNOW_BLOCK)
                        .define('2', Items.ICE)
                        .define('3', Items.SNOWBALL)
                        .define('4', Items.ENCHANTED_GOLDEN_APPLE)
                        .unlockedBy(getHasName(Items.ENCHANTED_GOLDEN_APPLE), has(Items.ENCHANTED_GOLDEN_APPLE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.QUICHE)
                        .pattern(" 1 ")
                        .pattern("234")
                        .pattern(" 1 ")
                        .define('1', Items.GOLDEN_CARROT)
                        .define('2', Items.DRIED_KELP)
                        .define('3', Items.PUMPKIN_PIE)
                        .define('4', Items.BLUE_EGG)
                        .unlockedBy(getHasName(Items.GOLDEN_CARROT), has(Items.GOLDEN_CARROT))
                        .unlockedBy(getHasName(Items.PUMPKIN_PIE), has(Items.PUMPKIN_PIE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.MCANDY)
                        .pattern(" 1 ")
                        .pattern("121")
                        .pattern(" 1 ")
                        .define('1', Items.SUGAR)
                        .define('2', Items.SWEET_BERRIES)
                        .unlockedBy(getHasName(Items.SWEET_BERRIES), has(Items.SWEET_BERRIES))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.CINNAMON)
                        .pattern("12 ")
                        .pattern("343")
                        .pattern(" 21")
                        .define('1', Items.SNOWBALL)
                        .define('2', Items.BREAD)
                        .define('3', Items.WHEAT)
                        .define('4', Items.SUGAR)
                        .unlockedBy(getHasName(Items.BREAD), has(Items.BREAD))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.HUSH_PUPPY)
                        .pattern("121")
                        .define('1', Items.GOLDEN_CARROT)
                        .define('2', ModItems.HOT_DOG)
                        .unlockedBy(getHasName(Items.GOLDEN_CARROT), has(Items.GOLDEN_CARROT))
                        .unlockedBy(getHasName(ModItems.HOT_DOG), has(ModItems.HOT_DOG))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.NICE_CREAM)
                        .pattern(" 1 ")
                        .pattern("121")
                        .pattern(" 3 ")
                        .define('1', Items.ICE)
                        .define('2', Items.MILK_BUCKET)
                        .define('3', Items.GOLDEN_CARROT)
                        .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET))
                        .unlockedBy(getHasName(Items.ICE), has(Items.ICE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.DSALAD)
                        .pattern("123")
                        .pattern(" 4 ")
                        .define('1', Items.COOKED_MUTTON)
                        .define('2', Items.BONE)
                        .define('3', Items.ROTTEN_FLESH)
                        .define('4', Items.BOWL)
                        .unlockedBy(getHasName(Items.COOKED_MUTTON), has(Items.COOKED_MUTTON))
                        .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.SEA_TEA)
                        .pattern("1")
                        .pattern("2")
                        .pattern("3")
                        .define('1', Items.SUGAR)
                        .define('2', Items.SEAGRASS)
                        .define('3', Items.GLASS_BOTTLE)
                        .unlockedBy(getHasName(Items.SEAGRASS), has(Items.SEAGRASS))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.CRABAP)
                        .pattern("121")
                        .define('1', Items.PRISMARINE_SHARD)
                        .define('2', Items.APPLE)
                        .unlockedBy(getHasName(Items.PRISMARINE_SHARD), has(Items.PRISMARINE_SHARD))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.SPIDER_DONUT)
                        .pattern("123")
                        .define('1', Items.SPIDER_EYE)
                        .define('2', Items.SUGAR)
                        .define('3', Items.FERMENTED_SPIDER_EYE)
                        .unlockedBy(getHasName(Items.FERMENTED_SPIDER_EYE), has(Items.FERMENTED_SPIDER_EYE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.SPIDER_CIDER)
                        .pattern("123")
                        .pattern(" 4 ")
                        .define('1', Items.FERMENTED_SPIDER_EYE)
                        .define('2', Items.COBWEB)
                        .define('3', Items.SPIDER_EYE)
                        .define('4', Items.POTION)
                        .unlockedBy(getHasName(Items.FERMENTED_SPIDER_EYE), has(Items.FERMENTED_SPIDER_EYE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.GLAMB)
                        .pattern("123")
                        .pattern("454")
                        .pattern("321")
                        .define('1', Items.MAGENTA_DYE)
                        .define('2', Items.BREAD)
                        .define('3', Items.PINK_DYE)
                        .define('4', Items.GLOWSTONE)
                        .define('5', Items.COOKED_BEEF)
                        .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                        .unlockedBy(getHasName(Items.COOKED_BEEF), has(Items.COOKED_BEEF))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.STARFAIT)
                        .pattern("1")
                        .pattern("2")
                        .pattern("3")
                        .define('1', Items.GLISTERING_MELON_SLICE)
                        .define('2', Items.SUGAR)
                        .define('3', Items.MILK_BUCKET)
                        .unlockedBy(getHasName(Items.GLISTERING_MELON_SLICE), has(Items.GLISTERING_MELON_SLICE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.LEGHERO)
                        .pattern("121")
                        .pattern("343")
                        .pattern("121")
                        .define('1', Items.BREAD)
                        .define('2', Items.WOODEN_SWORD)
                        .define('3', Items.KELP)
                        .define('4', Items.COOKED_BEEF)
                        .unlockedBy(getHasName(Items.COOKED_BEEF), has(Items.COOKED_BEEF))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.STEAK)
                        .pattern("121")
                        .pattern("232")
                        .pattern("121")
                        .define('1', Items.IRON_INGOT)
                        .define('2', Items.COOKED_BEEF)
                        .define('3', Items.ENCHANTED_GOLDEN_APPLE)
                        .unlockedBy(getHasName(Items.ENCHANTED_GOLDEN_APPLE), has(Items.ENCHANTED_GOLDEN_APPLE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.JUNK_FOOD)
                        .pattern(" 1 ")
                        .pattern("121")
                        .pattern(" 1 ")
                        .define('1', Items.ROTTEN_FLESH)
                        .define('2', Items.APPLE)
                        .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.INOODLES)
                        .pattern("121")
                        .pattern("343")
                        .pattern("333")
                        .define('1', Items.GOLDEN_CARROT)
                        .define('2', Items.WHEAT)
                        .define('3', Items.PAPER)
                        .define('4', Items.POTION)
                        .unlockedBy(getHasName(Items.GOLDEN_CARROT), has(Items.GOLDEN_CARROT))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.PCHISPS)
                        .pattern("111")
                        .pattern("232")
                        .pattern("111")
                        .define('1', Items.PAPER)
                        .define('2', Items.BAKED_POTATO)
                        .define('3', Items.POISONOUS_POTATO)
                        .unlockedBy(getHasName(Items.POISONOUS_POTATO), has(Items.POISONOUS_POTATO))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.ASTROFOOD)
                        .pattern("121")
                        .pattern("121")
                        .pattern("121")
                        .define('1', Items.SNOW_BLOCK)
                        .define('2', Items.COOKIE)
                        .unlockedBy(getHasName(Items.COOKIE), has(Items.COOKIE))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.TEMFLAKES)
                        .pattern(" 1 ")
                        .pattern("234")
                        .pattern("555")
                        .define('1', Items.YELLOW_DYE)
                        .define('2', Items.RED_DYE)
                        .define('3', Items.SUGAR)
                        .define('4', Items.BLUE_DYE)
                        .define('5', Items.PAPER)
                        .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.BADMEM)
                        .pattern("12 ")
                        .pattern("345")
                        .pattern(" 67")
                        .define('1', Items.CLOSED_EYEBLOSSOM)
                        .define('2', Items.REDSTONE)
                        .define('3', Items.COBWEB)
                        .define('4', Items.MUSIC_DISC_11)
                        .define('5', Items.BONE)
                        .define('6', Items.SPIDER_EYE)
                        .define('7', Items.ROTTEN_FLESH)
                        .unlockedBy(getHasName(Items.MUSIC_DISC_11), has(Items.MUSIC_DISC_11))
                        .group("utfood")
                        .save(output);

                shaped(RecipeCategory.FOOD, ModItems.LAST_DREAM)
                        .pattern(" 12")
                        .pattern("345")
                        .pattern("67 ")
                        .define('1', Items.BLUE_ORCHID)
                        .define('2', Items.PINK_PETALS)
                        .define('3', Items.DANDELION)
                        .define('4', ModItems.BADMEM)
                        .define('5', Items.LILY_OF_THE_VALLEY)
                        .define('6', Items.POPPY)
                        .define('7', Items.CORNFLOWER)
                        .unlockedBy(getHasName(ModItems.BADMEM), has(ModItems.BADMEM))
                        .group("utfood")
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "TestMod Recipes";
    }
}
