package me.temez.phoenixcraft.menu;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;

import javax.swing.*;
import java.awt.*;

public class LauncherPanel extends JPanel implements SwingerEventListener {
    Image back = Swinger.getResource("back.png");
    private STexturedButton play = new STexturedButton(Swinger.getResource("play.png"), Swinger.getResource("play_overlay.png"));
    private STexturedButton options = new STexturedButton(Swinger.getResource("settings.png"), Swinger.getResource("settings.png"));

    public LauncherPanel() {
        setLayout(null);
        setBackground(Swinger.TRANSPARENT);
        play.addEventListener(this);
        play.setBounds(661, 528);
        play.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        options.addEventListener(this);
        options.setBounds(763, 13);
        options.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(options);
        add(play);

    }

    @Override
    public void onEvent(SwingerEvent event) {
        if (event.getSource() == play) {

        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Swinger.drawFullsizedImage(g, this, back);
    }
}
