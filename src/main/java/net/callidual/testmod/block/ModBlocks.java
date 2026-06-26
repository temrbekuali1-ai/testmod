package net.callidual.testmod.block;

import net.callidual.testmod.TestMod;
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