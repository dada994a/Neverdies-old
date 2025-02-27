package org.nrnr.neverdies.impl.gui.click.impl.config.setting;

import net.minecraft.client.gui.DrawContext;
import org.nrnr.neverdies.api.config.Config;
import org.nrnr.neverdies.api.render.RenderManager;
import org.nrnr.neverdies.impl.gui.click.impl.config.CategoryFrame;
import org.nrnr.neverdies.impl.gui.click.impl.config.ModuleButton;
import org.nrnr.neverdies.init.Modules;

/**
 * @author chronos
 * @since 1.0
 */
public class TextButton extends ConfigButton<String> {

    private StringBuilder text;
    private boolean typing;

    /**
     * @param frame
     * @param config
     */
    public TextButton(CategoryFrame frame, ModuleButton moduleButton, Config<String> config, float x, float y) {
        super(frame, moduleButton, config, x, y);
        text = new StringBuilder(config.getValue());
    }

    /**
     * @param context
     * @param ix
     * @param iy
     * @param mouseX
     * @param mouseY
     * @param delta
     */
    @Override
    public void render(DrawContext context, float ix, float iy, float mouseX, float mouseY, float delta) {
        RenderManager.renderText(context, config.getValue(), ix + 3.0f, iy + 3.0f, -1);
        //context.drawBorder((int) x, (int) y, (int) width, (int) height, Modules.COLORS.getRGB());

    }

    /**
     * @param mouseX
     * @param mouseY
     * @param button
     */
    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (isWithin(mouseX, mouseY) && button == 0) {
            typing = !typing;
        }
    }

    /**
     * @param mouseX
     * @param mouseY
     * @param button
     */
    @Override
    public void mouseReleased(double mouseX, double mouseY, int button) {

    }

    /**
     * @param keyCode
     * @param scanCode
     * @param modifiers
     */
    @Override
    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (typing) {

        }
    }
}
