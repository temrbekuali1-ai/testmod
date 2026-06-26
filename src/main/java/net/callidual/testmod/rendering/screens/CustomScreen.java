package net.callidual.testmod.rendering.screens;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.lwjgl.glfw.GLFW;

public class CustomScreen extends Screen {

    private static final Identifier HEART_PICTURE = Identifier.fromNamespaceAndPath("testmod", "textures/gui/heart.png");

    private CustomWidget heartWidget;
    // Changed to double for ultra-smooth sub-pixel math accumulation across frames
    private double heartOffsetX = 0;
    private double heartOffsetY = 0;
    private boolean isLargeBox = false;

    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean leftPressed = false;
    private boolean rightPressed = false;

    public CustomScreen() {
        super(Component.literal("♥ Heart Widget"));
    }

    @Override
    protected void init() {
        int w = isLargeBox ? 240 : 150;
        int h = isLargeBox ? 130 : 150;

        heartWidget = new CustomWidget(
                (this.width - w) / 2,
                (this.height - h) / 2 - 20,
                w, h
        );
        heartWidget.setHeartOffset((int) heartOffsetX, (int) heartOffsetY);

        if (this.isLargeBox) {
            heartWidget.toggleSize();
        }

        this.addRenderableWidget(heartWidget);

        this.addRenderableWidget(Button.builder(
                Component.literal("Toggle Size"),
                btn -> {
                    this.isLargeBox = !this.isLargeBox;
                    this.heartOffsetX = 0;
                    this.heartOffsetY = 0;
                    this.init(this.width, this.height);
                }
        ).bounds(this.width / 2 - 105, this.height - 40, 100, 20).build());

        this.addRenderableWidget(Button.builder(
                Component.literal("Done"),
                btn -> this.minecraft.setScreen(null)
        ).bounds(this.width / 2 + 5, this.height - 40, 100, 20).build());
    }

    @Override
    public void tick() {
        super.tick();
        // Removed movement logic from here completely so it doesn't stutter at 20Hz
    }

    @Override
    public boolean keyPressed(KeyEvent event) {
        int keyCode = InputConstants.getKey(event).getValue();
        if (keyCode == GLFW.GLFW_KEY_W) upPressed = true;
        if (keyCode == GLFW.GLFW_KEY_S) downPressed = true;
        if (keyCode == GLFW.GLFW_KEY_A) leftPressed = true;
        if (keyCode == GLFW.GLFW_KEY_D) rightPressed = true;
        return super.keyPressed(event);
    }

    @Override
    public boolean keyReleased(KeyEvent event) {
        int keyCode = InputConstants.getKey(event).getValue();
        if (keyCode == GLFW.GLFW_KEY_W) upPressed = false;
        if (keyCode == GLFW.GLFW_KEY_S) downPressed = false;
        if (keyCode == GLFW.GLFW_KEY_A) leftPressed = false;
        if (keyCode == GLFW.GLFW_KEY_D) rightPressed = false;
        return super.keyReleased(event);
    }

    @Override
    public void extractRenderState(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta) {
        super.extractRenderState(graphics, mouseX, mouseY, delta);

        // --- REAL-TIME FRAME RENDERING MOVEMENT SYSTEM ---
        // 'speed = 2' stays exactly as you specified!
        double speed = 2;

        // Minecraft's 'delta' represents the fraction of time passed since the last frame.
        // Multiplying by delta * 2.5 forces the execution velocity scale to reach exactly 100 units/sec.
        double frameModifier = delta * 2.5;

        if (upPressed) heartOffsetY -= speed * frameModifier;
        if (downPressed) heartOffsetY += speed * frameModifier;
        if (leftPressed) heartOffsetX -= speed * frameModifier;
        if (rightPressed) heartOffsetX += speed * frameModifier;

        // BORDERS!!!                                                                <<<<----
        int minX, maxX, minY, maxY;
        if (isLargeBox) { minX = -112; maxX = 112; minY = -58; maxY = 56; }
        else { minX = -67; maxX = 67; minY = -68; maxY = 66; }

        heartOffsetX = Math.max(minX, Math.min(heartOffsetX, maxX));
        heartOffsetY = Math.max(minY, Math.min(heartOffsetY, maxY));

        // Pass cast integers over to your pixel grid render engine
        heartWidget.setHeartOffset((int) heartOffsetX, (int) heartOffsetY);
    }
}