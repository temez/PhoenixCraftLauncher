package me.temez.phoenixcraft.components;

import fr.theshark34.swinger.Swinger;
import me.temez.phoenixcraft.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PassField extends JPasswordField {

    public static BufferedImage texture = Swinger.getResource("login_assets/forms.png");
    public int width = 0;
    public int height = 0;
    public int x = 0;
    public int y = 0;

    public Color staticColor;
    public Color disableColor;

    public PassField(int x, int y, int width, int height, Color disableColor, Color staticColor) {
        setOpaque(false);
        setBorder(null);
        setCaretColor(staticColor);
        if (this.isFocusOwner()) setForeground(staticColor);
        else setForeground(disableColor);
        setSelectionColor(new Color(51, 153, 255));
        setSelectedTextColor(Color.WHITE);
        setHorizontalAlignment(LEFT);
        setText(Settings.DPasswordText);
//       setFont(StyleUtils.getFont(14, 1));
        setBounds(x, y, width, height);

        this.width = width - 26;
        this.height = height;
        this.x = x;
        this.y = y;

        this.disableColor = disableColor;
        this.staticColor = staticColor;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawImage(texture, 0, 0, null);
        g2d.dispose();
        super.paintComponent(g);
    }
}
