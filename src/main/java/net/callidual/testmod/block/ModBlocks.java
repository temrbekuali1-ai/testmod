package net.callidual.testmod.block;

import net.callidual.testmod.TestMod;
import net.callidual.testmod.block.custom.EntryBlockX;
import net.callidual.testmod.block.custom.EntryBlockZ;
import net.callidual.testmod.block.custom.StartBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block RUIN_BRICKS = registerBlock("ruin_bricks",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRACKED_RUIN_BRICKS = registerBlock("cracked_ruin_bricks",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block RUIN_FLOOR = registerBlock("ruin_floor",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block RUIN_SEMIFLOOR = registerBlock("ruin_semifloor",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block RUIN_BRICKS2 = registerBlock("ruin_bricks2",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block RUIN_BRICKS3 = registerBlock("ruin_bricks3",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block RUIN_BRICKS4 = registerBlock("ruin_bricks4",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRACKED_RUIN_BRICKS2 = registerBlock("cracked_ruin_bricks2",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRACKED_RUIN_BRICKS3 = registerBlock("cracked_ruin_bricks3",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRACKED_RUIN_BRICKS3_5 = registerBlock("cracked_ruin_bricks3_5",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRACKED_RUIN_BRICKS4 = registerBlock("cracked_ruin_bricks4",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRACKED_RUIN_BRICKS4_5 = registerBlock("cracked_ruin_bricks4_5",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRACKED_RUIN_BRICKS5 = registerBlock("cracked_ruin_bricks5",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRACKED_RUIN_BRICKS5_5 = registerBlock("cracked_ruin_bricks5_5",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block RUIN_CEILING = registerBlock("ruin_ceiling",
            properties -> new Block(properties.strength(2f,7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block START_GRAY = registerBlock("start_gray",
            properties -> new Block(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_BLACK = registerBlock("start_black",
            properties -> new Block(properties.strength(-1)
                    .sound(SoundType.EMPTY)));

    public static final Block START_BLOCK1 = registerBlock("start_block1",
            properties -> new StartBlock(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_BLOCK2 = registerBlock("start_block2",
            properties -> new StartBlock(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_BLOCK3 = registerBlock("start_block3",
            properties -> new StartBlock(properties.strength(-1)
                    .sound(SoundType.EMPTY)));

    public static final Block START_ENTRANCE_BLOCK1 = registerBlock("start_entrance_block01",
            properties -> new EntryBlockX(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_ENTRANCE_BLOCK2 = registerBlock("start_entrance_block02",
            properties -> new EntryBlockX(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_ENTRANCE_BLOCK3 = registerBlock("start_entrance_block03",
            properties -> new EntryBlockX(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_ENTRANCE_BLOCK4NC = registerBlock("start_entrance_block04nc",
            properties -> new EntryBlockZ(properties.strength(-1).noCollision()
                    .sound(SoundType.EMPTY)));
    public static final Block START_ENTRANCE_BLOCK5NC = registerBlock("start_entrance_block05nc",
            properties -> new EntryBlockZ(properties.strength(-1).noCollision()
                    .sound(SoundType.EMPTY)));
    public static final Block START_ENTRANCE_BLOCK6 = registerBlock("start_entrance_block06",
            properties -> new EntryBlockZ(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_ENTRANCE_BLOCK7 = registerBlock("start_entrance_block07",
            properties -> new EntryBlockZ(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_ENTRANCE_BLOCK8 = registerBlock("start_entrance_block08",
            properties -> new EntryBlockZ(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block START_ENTRANCE_BLOCK9 = registerBlock("start_entrance_block09",
            properties -> new EntryBlockZ(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK1 = registerBlock("entrance_block1",
            properties -> new EntryBlockX(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK2 = registerBlock("entrance_block2",
            properties -> new EntryBlockX(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK3 = registerBlock("entrance_block3",
            properties -> new EntryBlockX(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK4NC = registerBlock("entrance_block4nc",
            properties -> new EntryBlockZ(properties.strength(-1).noCollision()
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK5NC = registerBlock("entrance_block5nc",
            properties -> new EntryBlockZ(properties.strength(-1).noCollision()
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK6 = registerBlock("entrance_block6",
            properties -> new EntryBlockZ(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK7 = registerBlock("entrance_block7",
            properties -> new EntryBlockZ(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK8 = registerBlock("entrance_block8",
            properties -> new EntryBlockZ(properties.strength(-1)
                    .sound(SoundType.EMPTY)));
    public static final Block ENTRANCE_BLOCK9 = registerBlock("entrance_block9",
            properties -> new EntryBlockZ(properties.strength(-1)
                    .sound(SoundType.EMPTY)));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name)))));
    }



    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering Mod Blocks for " + TestMod.MOD_ID);
    }
}