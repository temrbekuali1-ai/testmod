package net.callidual.testmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class StartBlock extends Block {

    public StartBlock(Properties properties) {
        super(properties);
    }

    // Спавн структуры при установке блока
    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
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

    // ИСПОЛЬЗУЕМ СТАБИЛЬНЫЙ МЕТОД РАЗРУШЕНИЯ ИГРОКОМ
    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide()) {
            // Очищаем область 3х1х3 вокруг центрального блока
            for (int x = -1; x <= 1; x++) {
                for (int z = -1; z <= 1; z++) {
                    if (x == 0 && z == 0) continue;

                    BlockPos targetPos = pos.offset(x, 0, z);
                    // Если там стоит барьер, убираем его
                    if (level.getBlockState(targetPos).is(Blocks.BARRIER)) {
                        level.removeBlock(targetPos, false);
                    }
                }
            }
        }
        return super.playerWillDestroy(level, pos, state, player);
    }
}