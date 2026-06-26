package net.callidual.testmod.rendering.screens;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class CustomWidget extends AbstractWidget {

    private static final Identifier HEART_PICTURE = Identifier.fromNamespaceAndPath("testmod", "textures/gui/heart.png");
    private static final Identifier HEART_JUMP = Identifier.fromNamespaceAndPath("testmod", "textures/gui/heart_jump.png"); // NEW TEXTURE

    int heartOffsetX = 0;
    int heartOffsetY = 0;
    private int sizeMultiplier = 1;

    // --- MODE TRACKER ---
    private boolean isJumpMode = false;

    public CustomWidget(int x, int y, int width, int height) {
        super(x, y, width, height, Component.empty());
    }

    // --- ADDED SETTER FOR JUMP MODE ---
    public void setMode(boolean isJumpMode) {
        this.isJumpMode = isJumpMode;
    }

    public void setHeartOffset(int x, int y) {
        this.heartOffsetX = x;
        this.heartOffsetY = y;
    }

    public void toggleSize() {
    }

    @Override
    public void playDownSound(net.minecraft.client.sounds.SoundManager soundManager) {}

    // HELPER: Draws a single 3x5 pixel digit or minus sign using graphics.fill
    private void drawPixelDigit(GuiGraphicsExtractor graphics, char digit, int x, int y, int color) {
        switch (digit) {
            case '-':
                graphics.fill(x, y + 2, x + 3, y + 3, color);
                break;
            case '0':
                graphics.fill(x, y, x + 3, y + 5, color);
                graphics.fill(x + 1, y + 1, x + 2, y + 4, 0xFF000000); // Hollow center
                break;
            case '1':
                graphics.fill(x + 2, y, x + 3, y + 5, color);
                graphics.fill(x + 1, y, x + 2, y + 1, color);
                break;
            case '2':
                graphics.fill(x, y, x + 3, y + 1, color);
                graphics.fill(x + 2, y + 1, x + 3, y + 2, color);
                graphics.fill(x, y + 2, x + 3, y + 3, color);
                graphics.fill(x, y + 3, x + 1, y + 4, color);
                graphics.fill(x, y + 4, x + 3, y + 5, color);
                break;
            case '3':
                graphics.fill(x, y, x + 3, y + 1, color);
                graphics.fill(x + 2, y, x + 3, y + 5, color);
                graphics.fill(x, y + 2, x + 2, y + 3, color);
                graphics.fill(x, y + 4, x + 2, y + 5, color);
                break;
            case '4':
                graphics.fill(x, y, x + 1, y + 3, color);
                graphics.fill(x + 2, y, x + 3, y + 5, color);
                graphics.fill(x, y + 2, x + 2, y + 3, color);
                break;
            case '5':
                graphics.fill(x, y, x + 3, y + 1, color);
                graphics.fill(x, y + 1, x + 1, y + 3, color);
                graphics.fill(x, y + 2, x + 3, y + 3, color);
                graphics.fill(x + 2, y + 3, x + 3, y + 5, color);
                graphics.fill(x, y + 4, x + 2, y + 5, color);
                break;
            case '6':
                graphics.fill(x, y, x + 3, y + 5, color);
                graphics.fill(x + 1, y + 1, x + 2, y + 2, 0xFF000000);
                graphics.fill(x + 1, y + 3, x + 2, y + 4, 0xFF000000);
                graphics.fill(x + 2, y + 1, x + 3, y + 2, 0xFF000000);
                break;
            case '7':
                graphics.fill(x, y, x + 3, y + 1, color);
                graphics.fill(x + 2, y + 1, x + 3, y + 5, color);
                break;
            case '8':
                graphics.fill(x, y, x + 3, y + 5, color);
                graphics.fill(x + 1, y + 1, x + 2, y + 2, 0xFF000000);
                graphics.fill(x + 1, y + 3, x + 2, y + 4, 0xFF000000);
                break;
            case '9':
                graphics.fill(x, y, x + 3, y + 5, color);
                graphics.fill(x + 1, y + 1, x + 2, y + 2, 0xFF000000);
                graphics.fill(x + 1, y + 3, x + 2, y + 4, 0xFF000000);
                graphics.fill(x, y + 3, x + 1, y + 4, 0xFF000000);
                break;
        }
    }

    // HELPER: Converts a full number string into spacing offsets for rendering
    private void drawPixelNumberString(GuiGraphicsExtractor graphics, String numStr, int startX, int startY, int color) {
        int currentX = startX;
        for (int i = 0; i < numStr.length(); i++) {
            drawPixelDigit(graphics, numStr.charAt(i), currentX, startY, color);
            currentX += 4; // Move 4 pixels right for the next digit (3 pixels width + 1 pixel spacing)
        }
    }

    @Override
    protected void extractWidgetRenderState(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta) {
        int borderThickness = 3;

        // 1. Thick Outer White Border
        graphics.fill(getX() - borderThickness, getY() - borderThickness, getX() + width + borderThickness, getY() + height + borderThickness, 0xFFFFFFFF);

        // 2. Inner Black Container Box
        graphics.fill(getX(), getY(), getX() + width, getY() + height, 0xFF000000);

        // Center anchors for the heart shape
        int hx = getX() + (width / 2) + heartOffsetX;
        int hy = getY() + (height / 2) + heartOffsetY;
        int RED = 0xFFFF2222;
        int s = this.sizeMultiplier;

        // 3. PIXEL TEXT LABELS AND DYNAMIC VALUES
        int TEXT_COLOR = 0x88AAAAAA;
        int tx = getX() + 6;
        int ty = getY() + 6;

        // Static Letter 'X' and ':'
        graphics.fill(tx,     ty,     tx + 1, ty + 1, TEXT_COLOR);
        graphics.fill(tx + 2, ty,     tx + 3, ty + 1, TEXT_COLOR);
        graphics.fill(tx + 1, ty + 1, tx + 2, ty + 2, TEXT_COLOR);
        graphics.fill(tx,     ty + 2, tx + 1, ty + 3, TEXT_COLOR);
        graphics.fill(tx + 2, ty + 2, tx + 3, ty + 3, TEXT_COLOR);
        graphics.fill(tx + 4, ty,     tx + 5, ty + 1, TEXT_COLOR);
        graphics.fill(tx + 4, ty + 2, tx + 5, ty + 3, TEXT_COLOR);

        // Render live dynamic X number sequence right next to "X:" (at offset X + 7)
        drawPixelNumberString(graphics, String.valueOf(heartOffsetX), tx + 7, ty, TEXT_COLOR);

        // Static Letter 'Y' and ':'
        int ty2 = ty + 7; // Moved down slightly for neatness
        graphics.fill(tx,     ty2,     tx + 1, ty2 + 1, TEXT_COLOR);
        graphics.fill(tx + 2, ty2,     tx + 3, ty2 + 1, TEXT_COLOR);
        graphics.fill(tx + 1, ty2 + 1, tx + 2, ty2 + 2, TEXT_COLOR);
        graphics.fill(tx + 1, ty2 + 2, tx + 2, ty2 + 3, TEXT_COLOR);
        graphics.fill(tx + 4, ty2,     tx + 5, ty2 + 1, TEXT_COLOR);
        graphics.fill(tx + 4, ty2 + 2, tx + 5, ty2 + 3, TEXT_COLOR);

        // Render live dynamic Y number sequence right next to "Y:" (at offset X + 7)
        drawPixelNumberString(graphics, String.valueOf(heartOffsetY), tx + 7, ty2, TEXT_COLOR);

        // --- DYNAMIC TEXTURE SWAP INTEGRATION ---
        Identifier currentTexture = isJumpMode ? HEART_JUMP : HEART_PICTURE;
        graphics.blit(RenderPipelines.GUI_TEXTURED, currentTexture, hx-6, hy-6, 0.0f, 0.0f, 12, 12, 12, 12);
    }

    @Override
    protected void updateWidgetNarration(net.minecraft.client.gui.narration.NarrationElementOutput builder) {}
}