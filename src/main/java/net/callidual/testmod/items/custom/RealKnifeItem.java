package net.callidual.testmod.items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RealKnifeItem extends Item {

    public RealKnifeItem(Properties properties) {
        super(properties);
    }

    @Override
    public Component getName(ItemStack stack) {
        // Red color (you can change the hex code if you want a different shade)
        return Component.literal("REAL Knife")
                .withStyle(Style.EMPTY.withColor(0xFF5555).withBold(true));
    }
}