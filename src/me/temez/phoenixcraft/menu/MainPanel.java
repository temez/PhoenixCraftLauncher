package me.temez.phoenixcraft.menu;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel implements SwingerEventListener {

    private final STexturedButton close = new STexturedButton(Swinger.getResource("login_assets/close.png"), Swinger.getResource("login_assets/close.png"));
    private final STexturedButton minimize = new STexturedButton(Swinger.getResource("login_assets/minimize.png"), Swinger.getResource("login_assets/minimize.png"));

    public MainPanel() {
        setLayout(null);
        setBackground(Swinger.TRANSPARENT);

        minimize.addEventListener(this);
        minimize.setBounds(377, 9, 29, 29);
        minimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        close.addEventListener(this);
        close.setBounds(412, 9, 29, 29);
        close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(close);
        add(minimize);
    }

    @Override
    public void onEvent(SwingerEvent event) {
        if (event.getSource() == minimize) {
            MainFrame.getInstance().setState(Frame.ICONIFIED);
        } else if (event.getSource() == close) {
            MainFrame.getInstance().dispose();
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Swinger.drawFullsizedImage(g, this, Swinger.getResource("main_assets/back.png"));
    }
}
