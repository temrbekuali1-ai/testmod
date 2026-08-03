package net.callidual.testmod.block.custom;

import com.mojang.serialization.MapCodec;
import net.callidual.testmod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class EntryBlockZ extends HorizontalDirectionalBlock {

    // OUTLINE (Рамка выделения) для X=1, Y=2, Z=2 (в пикселях: X, Y, Z):
    // Север / Юг: X = 16 (1 блок), Y = 32 (2 блока), Z = 32 (2 блока)
    private static final VoxelShape SHAPE_NORTH_SOUTH = Block.box(0, 0, 0, 16, 32, 32);

    // Восток / Запад: X = 32 (2 блока), Y = 32 (2 блока), Z = 16 (1 блок)
    private static final VoxelShape SHAPE_EAST_WEST = Block.box(0, 0, 0, 32, 32, 16);

    public EntryBlockZ(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

// ИДЕАЛЬНЫЙ VOXELSHAPE С УЧЕТОМ НАПРАВЛЕНИЯ
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction dir = state.getValue(FACING);

        switch (dir) {
            case NORTH:
                // Вытягиваемся по Z в отрицательную/положительную сторону в зависимости от того, куда повернут блок
                return Block.box(0, 0, 0, 32, 32, 16);
            case SOUTH:
                return Block.box(-16, 0, 0, 16, 32, 16);
            case WEST:
                return Block.box(0, 0, 0, 16, 32, 32);
            case EAST:
            default:
                return Block.box(0, 0, -16, 16, 32, 16);
        }
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state, boolean includeData) {
        return ItemStack.EMPTY;
    }
    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);

        if (!level.isClientSide()) {
            Direction facing = state.getValue(FACING);
            // Получаем смещение по глубине (вдоль оси направления взгляда)
            BlockPos leftPos = pos.relative(facing.getCounterClockWise());

            // 3 позиции барьеров для объема 1x2x2:
            // 1. Блок впереди по направлению
            // 2. Блок сверху над основным
            // 3. Блок сверху над передним
            BlockPos[] barrierPositions = new BlockPos[]{
                    leftPos,
                    pos.above(),
                    leftPos.above()
            };

// В методе setPlacedBy заменяем Blocks.BARRIER на наш блок-заглушку:
            for (BlockPos targetPos : barrierPositions) {
                if (level.getBlockState(targetPos).canBeReplaced()) {
                    level.setBlockAndUpdate(targetPos, Blocks.BARRIER.defaultBlockState());
                }
            }
        }
    }
    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide()) {
            Direction facing = state.getValue(FACING);
            // Направление ВЛЕВО относительно взгляда игрока
            Direction left = facing.getCounterClockWise();

            BlockPos[] barrierPositions = new BlockPos[]{
                    pos.relative(left),             // Слева
                    pos.above(),                    // Сверху
                    pos.relative(left).above()      // Слева-сверху
            };

            for (BlockPos targetPos : barrierPositions) {
                if (level.getBlockState(targetPos).is(Blocks.BARRIER)) {
                    level.removeBlock(targetPos, false);
                }
            }
        }

        return super.playerWillDestroy(level, pos, state, player);
    }
}