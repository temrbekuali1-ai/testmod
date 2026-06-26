package net.callidual.testmod.items.custom;

import net.callidual.testmod.block.ModBlocks;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class ChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    ModBlocks.RUIN_BRICKS, ModBlocks.RUIN_BRICKS2,
                    ModBlocks.RUIN_BRICKS2, ModBlocks.RUIN_BRICKS3,
                    ModBlocks.RUIN_BRICKS3, ModBlocks.RUIN_BRICKS4,
                    ModBlocks.RUIN_BRICKS4, ModBlocks.RUIN_BRICKS,
                    ModBlocks.CRACKED_RUIN_BRICKS, ModBlocks.CRACKED_RUIN_BRICKS2,
                    ModBlocks.CRACKED_RUIN_BRICKS2, ModBlocks.CRACKED_RUIN_BRICKS3,
                    ModBlocks.CRACKED_RUIN_BRICKS3, ModBlocks.CRACKED_RUIN_BRICKS3_5,
                    ModBlocks.CRACKED_RUIN_BRICKS3_5, ModBlocks.CRACKED_RUIN_BRICKS4_5,
                    ModBlocks.CRACKED_RUIN_BRICKS4_5, ModBlocks.CRACKED_RUIN_BRICKS5,
                    ModBlocks.CRACKED_RUIN_BRICKS5, ModBlocks.CRACKED_RUIN_BRICKS5_5
            );

    public ChiselItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        //Right Click Block
        //Change Block from A to B...

        Level level = context.getLevel();
        Block clickedblock = level.getBlockState(context.getClickedPos()).getBlock();

        if(CHISEL_MAP.containsKey(clickedblock) && !level.isClientSide()) {
            //We are on the Server!
            level.setBlockAndUpdate(context.getClickedPos(), CHISEL_MAP.get(clickedblock).defaultBlockState());
        }


        return InteractionResult.SUCCESS;
    }
}
