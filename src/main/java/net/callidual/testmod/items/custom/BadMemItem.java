package net.callidual.testmod.items.custom;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class BadMemItem extends Item {

    public BadMemItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        // 1. Run all standard consumable logic (instant damage, blindness, cave sound)
        ItemStack result = super.finishUsingItem(stack, level, user);

        // 2. Only execute item-giving logic on the server side for players
        if (!level.isClientSide() && user instanceof Player player) {
            BuiltInRegistries.ITEM.getRandom(level.getRandom()).ifPresent(holder -> {
                Item randomItem = holder.value();

                // Skip if the registry picked Air
                if (randomItem == Items.AIR) {
                    return;
                }

                ItemStack randomStack = new ItemStack(randomItem);

                // Add to player inventory; drop at player feet if inventory is full
                if (!player.getInventory().add(randomStack)) {
                    player.drop(randomStack, false);
                }
            });
        }

        return result;
    }
}