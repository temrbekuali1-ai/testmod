package net.callidual.testmod.items.custom;

import com.geckolib.renderer.GeoArmorRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public final class ModArmorRenderer<R extends HumanoidRenderState & GeoRenderState>
        extends GeoArmorRenderer<ModArmorItem, R> {

    public ModArmorRenderer(ModArmorItem item) {
        super(item);
    }

    @Override
    public List<ArmorSegment> getSegmentsForSlot(R renderState, EquipmentSlot slot) {
        if (slot == EquipmentSlot.LEGS) {
            return List.of(ArmorSegment.CHEST);
        }

        return super.getSegmentsForSlot(renderState, slot);
    }
}