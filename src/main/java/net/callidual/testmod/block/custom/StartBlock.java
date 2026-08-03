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

public class StartBlock extends HorizontalDirectionalBlock {

    // OUTLINE (Рамка выделения) для размера 2х2х1 (в пикселях: 32х32х16):
    private static final VoxelShape SHAPE_NORTH_SOUTH = Block.box(-16, 0, -16, 32, 16, 32);
    private static final VoxelShape SHAPE_EAST_WEST = Block.box(-16, 0, -16, 32, 16, 32);

    public StartBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state, boolean includeData) {
        return ItemStack.EMPTY;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        // Поворачиваем лицом к игроку
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        // Симметричный хитбокс 3х1х3 (48x16x48 пикселей) вокруг центрального блока
        return Block.box(-16, 0, -16, 32, 16, 32);}

    // Спавн структуры при установке блока
    @Override
    public void setPlacedBy (Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack){
        super.setPlacedBy(level, pos, state, placer, stack);
        if (!level.isClientSide()) {
            for (int x = -1; x <= 1; x++) {
                for (int z = -1; z <= 1; z++) {
                    if (x == 0 && z == 0) continue;

                    BlockPos targetPos = pos.offset(x, 0, z);
                    if (level.getBlockState(targetPos).canBeReplaced()) {
                        level.setBlockAndUpdate(targetPos, Blocks.BARRIER.defaultBlockState());
                    }
                }
            }
        }
    }
    @Override
    public BlockState playerWillDestroy (Level level, BlockPos pos, BlockState state, Player player){
        if (!level.isClientSide()) {
            // Очищаем область 3х1х3 вокруг центрального блока
            for (int x = -1; x <= 1; x++) {
                for (int z = -1; z <= 1; z++) {
                    if (x == 0 && z == 0) continue;

                    BlockPos targetPos = pos.offset(x, 0, z);
                    if (level.getBlockState(targetPos).is(Blocks.BARRIER)) {
                        level.removeBlock(targetPos, false);
                    }
                }
            }
        }
        return super.playerWillDestroy(level, pos, state, player);
    }
}
