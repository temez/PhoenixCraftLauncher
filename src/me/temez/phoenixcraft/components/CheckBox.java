package me.temez.phoenixcraft.components;

import fr.theshark34.swinger.Swinger;
import me.temez.phoenixcraft.utils.BaseUtils;

import javax.swing.*;
import java.awt.*;


public class CheckBox extends JCheckBox {

    public int width = 0;
    public int height = 0;
    public int x = 0;
    public int y = 0;

    public CheckBox(int x, int y, int width, int height, String name, boolean selected) {
        super(name);
        setOpaque(false);
        setFocusable(false);
        setSelected(selected);
        setFont(BaseUtils.getFont(13, 1));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setBounds(x - 5, y, width + 5, height);
        this.width = width;
        this.height = height;
        setIcon(new ImageIcon(Swinger.getResource("login_assets/chbox.png")));
        setSelectedIcon(new ImageIcon(Swinger.getResource("login_assets/chbox-checked.png")));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
