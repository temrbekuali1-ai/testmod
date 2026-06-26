package net.callidual.testmod.rendering.screens;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.network.chat.Component;
import org.lwjgl.glfw.GLFW;

public class CustomScreen extends Screen {

    private CustomWidget heartWidget;
    private double heartOffsetX = 0;
    private double heartOffsetY = 0;
    private boolean isLargeBox = false;

    // --- JUMP MODE LOGIC ---
    private boolean isJumpMode = false;
    private double jumpTimer = 0;
    private static final double MAX_JUMP_TIME = 2.0;

    private enum JumpState { IDLE, ASCENDING, DESCENDING }
    private JumpState currentState = JumpState.IDLE;

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
                Component.literal("Toggle Jump Mode"),
                btn -> {
                    this.isJumpMode = !this.isJumpMode;
                    this.currentState = JumpState.IDLE; // Reset to ground
                    this.heartOffsetY = 0; // Snap to ground
                    this.jumpTimer = 0;
                }
        ).bounds(this.width / 2 - 105, this.height - 65, 210, 20).build());

        this.addRenderableWidget(Button.builder(
                Component.literal("Toggle Size"),
                btn -> {
                    this.isLargeBox = !this.isLargeBox;
                    this.heartOffsetX = 0;
                    this.heartOffsetY = 0;
                    this.currentState = JumpState.IDLE;
                    this.init(this.width, this.height);
                }
        ).bounds(this.width / 2 - 105, this.height - 40, 100, 20).build());

        this.addRenderableWidget(Button.builder(
                Component.literal("Done"),
                btn -> this.minecraft.setScreen(null)
        ).bounds(this.width / 2 + 5, this.height - 40, 100, 20).build());
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

        double speed = 2;
        double frameModifier = delta * 2.5;

        if (isJumpMode) {
            double dt = delta / 20.0;

            // --- JUMP STATE MACHINE ---
            switch (currentState) {
                case IDLE:
                    if (upPressed) {
                        currentState = JumpState.ASCENDING;
                        jumpTimer = 0;
                    }
                    break;
                case ASCENDING:
                    heartOffsetY -= (speed * 2) * frameModifier;
                    jumpTimer += dt;
                    if (!upPressed || jumpTimer >= MAX_JUMP_TIME) {
                        currentState = JumpState.DESCENDING;
                    }
                    break;
                case DESCENDING:
                    heartOffsetY += speed * frameModifier;
                    // Landing check (assuming 69 is ground in regular box and 59 in large box)
                    while (heartOffsetY >= 59 && isLargeBox) {
                        heartOffsetY = heartOffsetY - 3;
                        if (heartOffsetY == 69) {
                            currentState = JumpState.IDLE;
                            break;
                        }}
                    while (heartOffsetY >= 69 && !isLargeBox) {
                            heartOffsetY = heartOffsetY - 3;
                        if (heartOffsetY == 69) {
                            currentState = JumpState.IDLE;
                            break;
                        }}}

            if (leftPressed) heartOffsetX -= speed * frameModifier;
            if (rightPressed) heartOffsetX += speed * frameModifier;

        } else {
            if (upPressed) heartOffsetY -= speed * frameModifier;
            if (downPressed) heartOffsetY += speed * frameModifier;
            if (leftPressed) heartOffsetX -= speed * frameModifier;
            if (rightPressed) heartOffsetX += speed * frameModifier;
        }

        int minX, maxX, minY, maxY;
        if (isLargeBox) { minX = -114; maxX = 114; minY = -59; maxY = 59; }
        else { minX = -69; maxX = 69; minY = -69; maxY = 69; }

        heartOffsetX = Math.max(minX, Math.min(heartOffsetX, maxX));
        heartOffsetY = Math.max(minY, Math.min(heartOffsetY, maxY));

        heartWidget.setMode(isJumpMode);
        heartWidget.setHeartOffset((int) heartOffsetX, (int) heartOffsetY);
    }
}