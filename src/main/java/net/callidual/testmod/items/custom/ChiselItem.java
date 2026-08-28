package net.callidual.testmod.items.custom;

import net.callidual.testmod.block.ModBlocks;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Map;
import java.util.function.Consumer;

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

    /*@Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display,
                                Consumer<Component> builder, TooltipFlag tooltipFlag) {
        if (Minecraft.getInstance().hasAltDown()) {
            builder.accept(Component.translatable("tooltip.testmod.tobytool.info")
                    .withStyle(ChatFormatting.GRAY));
        } else {
            builder.accept(Component.translatable("tooltip.testmod.no_alt.info")
                    .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        }
        super.appendHoverText(stack, context, display, builder, tooltipFlag);
    }*/
}
