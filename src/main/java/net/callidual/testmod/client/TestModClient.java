package net.callidual.testmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudElementRegistry.removeElement(VanillaHudElements.HEALTH_BAR);

        HudElementRegistry.attachElementBefore(
                VanillaHudElements.CHAT,
                Identifier.fromNamespaceAndPath("testmod", "health_display"),
                (graphics, deltaTracker) -> {
            Minecraft client = Minecraft.getInstance();
            Player player = client.player;

            if (player == null || client.options.hideGui) {
                return;
            }

            float health = player.getHealth();
            float maxHealth = player.getMaxHealth();
            String healthText = String.format("§c♥ §e%.1f/%.1f", health, maxHealth);

            int screenWidth = client.getWindow().getGuiScaledWidth();
            int screenHeight = client.getWindow().getGuiScaledHeight();

            int x = screenWidth / 2 - 91;
            int y = screenHeight - 39;

            graphics.text(client.font, healthText, x, y, 0xFFFFFFFF, true);
        });
    }
}