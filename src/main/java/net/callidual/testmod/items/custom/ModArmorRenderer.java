package net.callidual.testmod.items.custom;

import com.geckolib.renderer.GeoArmorRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.world.item.Item;

public final class ModArmorRenderer<R extends HumanoidRenderState & GeoRenderState> extends GeoArmorRenderer<ModArmorItem, R> {
    public ModArmorRenderer(ModArmorItem item) {
        super(item);
    }
}