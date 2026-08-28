package net.callidual.testmod.items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


public class TheLocketItem extends Item {

    public TheLocketItem(Properties properties) {
        super(properties);
    }

    @Override
    public Component getName(ItemStack stack) {
        // Orange color
        return Component.literal("The Locket.")
                .withStyle(Style.EMPTY.withBold(true)).withColor(0xC7C7C7);
    }

    /*@Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display,
                                Consumer<Component> builder, TooltipFlag tooltipFlag) {
        if (Minecraft.getInstance().hasAltDown()) {
            builder.accept(Component.translatable("tooltip.testmod.thelocket.info")
                    .withStyle(ChatFormatting.GRAY));
        } else {
            builder.accept(Component.translatable("tooltip.testmod.no_alt.info")
                    .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        }
        super.appendHoverText(stack, context, display, builder, tooltipFlag);
    }*/
}