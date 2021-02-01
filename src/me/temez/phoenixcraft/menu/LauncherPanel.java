package me.temez.phoenixcraft.menu;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;
import me.temez.phoenixcraft.login.LoginFrame;

import javax.swing.*;
import java.awt.*;

public class LauncherPanel extends JPanel implements SwingerEventListener {

    private STexturedButton play = new STexturedButton(Swinger.getResource("main_assets/play.png"), Swinger.getResource("main_assets/play_overlay.png"));
    private STexturedButton close = new STexturedButton(Swinger.getResource("login_assets/close.png"), Swinger.getResource("login_assets/close.png"));
    private STexturedButton minimize = new STexturedButton(Swinger.getResource("login_assets/minimize.png"), Swinger.getResource("login_assets/minimize.png"));


    public LauncherPanel() {
        setLayout(null);
        setBackground(Swinger.TRANSPARENT);
        play.addEventListener(this);
        play.setBounds(661, 528, 246,57);
        play.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        minimize.addEventListener(this);
        minimize.setBounds(868, 7 ,29, 29);
        minimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        close.addEventListener(this);
        close.setBounds(904, 7, 29, 29);
        close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(play);
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
