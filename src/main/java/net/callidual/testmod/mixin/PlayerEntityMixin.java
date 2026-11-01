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

        if (player.level().isClientSide()) return;

        ItemStack chestItem = player.getItemBySlot(EquipmentSlot.CHEST);
        if (chestItem.is(ModItems.THE_LOCKET)) {

            testmod$rejectSlot(player, EquipmentSlot.HEAD);
            testmod$rejectSlot(player, EquipmentSlot.LEGS);
            testmod$rejectSlot(player, EquipmentSlot.FEET);
        }
    }

    private void testmod$rejectSlot(Player player, EquipmentSlot slot) {
        ItemStack offendingItem = player.getItemBySlot(slot);

        if (!offendingItem.isEmpty()) {
            if (!player.getInventory().add(offendingItem)) {
                player.drop(offendingItem, false);
            }
            player.setItemSlot(slot, ItemStack.EMPTY);
        }
    }
}