package net.callidual.testmod.items.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RealKnifeItem extends Item {

    public RealKnifeItem(Properties properties) {
        super(properties);
    }


    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable("item.testmod.realknife")
                .withStyle(ChatFormatting.RED, ChatFormatting.BOLD);
    }

    /*@Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display,
                                Consumer<Component> builder, TooltipFlag tooltipFlag) {
        if (Minecraft.getInstance().hasAltDown()) {
            builder.accept(Component.translatable("tooltip.testmod.realknife.info")
                    .withStyle(ChatFormatting.GRAY));
        } else {
            builder.accept(Component.translatable("tooltip.testmod.no_alt.info")
                    .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        }
        super.appendHoverText(stack, context, display, builder, tooltipFlag);
    }*/
}