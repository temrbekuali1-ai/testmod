package net.callidual.testmod;

import net.callidual.testmod.rendering.screens.CustomScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class TestModClient implements ClientModInitializer {

	private static final KeyMapping OPEN_HEART_SCREEN = new KeyMapping(
			"Open Testing Menu",     // translation key
			GLFW.GLFW_KEY_PAGE_UP,                      // default key = PgUp
			KeyMapping.Category.MISC              // category
	);

	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (OPEN_HEART_SCREEN.consumeClick()) {
				Minecraft.getInstance().setScreen(new CustomScreen());
			}
		});
	}
}