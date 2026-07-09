package net.callidual.testmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StartBlock extends Block {
    // 48x16x48 pixel boundary box (3x1x3 blocks large)
    public static final VoxelShape SHAPE = Block.box(-16, 0, -16, 48, 16, 48);

    public StartBlock(Properties properties) {
        super(properties);
    }

    // Line 18: Changed method name to getShape to match Mojang Mappings
    @Override
    @Deprecated
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}

