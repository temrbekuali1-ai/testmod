package net.callidual.testmod.items.custom;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.renderer.GeoArmorRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class ModArmorItem extends Item implements GeoItem {

    private final Supplier<GeoArmorRenderer<?, ?>> renderer;

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public ModArmorItem(ArmorMaterial material, ArmorType type, Properties properties) {
        super(properties.humanoidArmor(material, type));

        this.renderer = Suppliers.memoize(
                () -> new GeoArmorRenderer<>(this));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private final Supplier<GeoArmorRenderer<ModArmorItem, HumanoidRenderState>>
                    renderer = Suppliers.memoize(() -> new GeoArmorRenderer<>(ModArmorItem.this));

            @Override
            public @Nullable GeoArmorRenderer<?, ?> getGeoArmorRenderer(ItemStack itemStack, EquipmentSlot equipmentSlot) {
                return this.renderer.get();
            }
        });
    }

    @Override
    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
        if (entity instanceof Player player && isArmorSlot(slot)) {

            for (EquipmentSlot otherSlot : EquipmentSlot.values()) {
                if (isArmorSlot(otherSlot) && otherSlot != slot) {

                    ItemStack otherStack = player.getItemBySlot(otherSlot);

                    if (!otherStack.isEmpty() && isModArmor(otherStack)) {

                        ejectArmor(player, slot, stack);

                        level.playSound(
                                null,
                                player.getX(),
                                player.getY(),
                                player.getZ(),
                                SoundEvents.HORSE_ARMOR_UNEQUIP.value(),
                                SoundSource.PLAYERS,
                                1.0F,
                                0.5F
                        );

                        break;
                    }
                }
            }
        }

        super.inventoryTick(stack, level, entity, slot);
    }

    private boolean isArmorSlot(EquipmentSlot slot) {
        return slot == EquipmentSlot.HEAD
                || slot == EquipmentSlot.CHEST
                || slot == EquipmentSlot.LEGS
                || slot == EquipmentSlot.FEET;
    }

    private boolean isModArmor(ItemStack stack) {
        return stack.getItem() instanceof ModArmorItem;
    }

    private void ejectArmor(Player player, EquipmentSlot slot, ItemStack stack) {
        player.setItemSlot(slot, ItemStack.EMPTY);

        if (!player.getInventory().add(stack.copy())) {
            player.drop(stack.copy(), false);
        }
    }
}