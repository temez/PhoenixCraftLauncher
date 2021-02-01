package me.temez.phoenixcraft.components;

import me.temez.phoenixcraft.utils.BaseUtils;

import java.awt.*;

public class Display {

    public static void drawString(String s, int x, int y, Color color, Graphics2D g2d) {
        FontMetrics fm = g2d.getFontMetrics();
        g2d.setFont(BaseUtils.getFont(25, 1));
        g2d.drawString(s, x, y);
    }
}
