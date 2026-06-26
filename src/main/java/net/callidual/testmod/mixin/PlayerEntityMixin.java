package net.callidual.testmod.mixin;

import net.callidual.testmod.items.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public class PlayerEntityMixin {

    @Inject(method = "tick", at = @At("TAIL"))
    private void testmod$blockLocketSlots(CallbackInfo ci) {
        Player player = (Player) (Object) this;

        // Only run on the logical server to keep inventory packets synchronized cleanly
        if (player.level().isClientSide()) return;

        // 1. Check if the player is wearing 'the_locket' in the chestplate slot
        ItemStack chestItem = player.getItemBySlot(EquipmentSlot.CHEST);
        if (chestItem.is(ModItems.THE_LOCKET)) {

            // 2. Clear out the head, legs, and feet slots automatically
            testmod$rejectSlot(player, EquipmentSlot.HEAD);
            testmod$rejectSlot(player, EquipmentSlot.LEGS);
            testmod$rejectSlot(player, EquipmentSlot.FEET);
        }
    }

    private void testmod$rejectSlot(Player player, EquipmentSlot slot) {
        ItemStack offendingItem = player.getItemBySlot(slot);

        if (!offendingItem.isEmpty()) {
            // Safely push the armor piece back into their normal inventory pockets
            if (!player.getInventory().add(offendingItem)) {
                // If they have absolutely no room left, drop it on the ground
                player.drop(offendingItem, false);
            }
            // Wipe the slot clean back to empty air
            player.setItemSlot(slot, ItemStack.EMPTY);
        }
    }
}