package me.temez.phoenixcraft.login;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;
import me.temez.phoenixcraft.components.LoginField;
import me.temez.phoenixcraft.components.PassField;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel implements SwingerEventListener {
    Image back = Swinger.getResource("login_assets/logo.png");

    private STexturedButton close = new STexturedButton(Swinger.getResource("login_assets/close.png"), Swinger.getResource("login_assets/close.png"));
    private STexturedButton minimize = new STexturedButton(Swinger.getResource("login_assets/minimize.png"), Swinger.getResource("login_assets/minimize.png"));
    private STexturedButton login = new STexturedButton(Swinger.getResource("login_assets/login.png"), Swinger.getResource("login_assets/login_over.png"));
    private LoginField loginField = new LoginField(89, 259, 281, 66, null, null);
    private PassField passField = new PassField(89, 335, 281, 66, null, null);

    public LoginPanel() {
        setLayout(null);
        setBackground(Swinger.TRANSPARENT);

        login.addEventListener(this);
        login.setBounds(89, 467);
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        minimize.addEventListener(this);
        minimize.setBounds(348, 8);
        minimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        close.addEventListener(this);
        close.setBounds(400, 8);
        close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(login);
        add(loginField);
        add(passField);
        add(minimize);
        add(close);
    }

    @Override
    public void onEvent(SwingerEvent event) {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Swinger.drawFullsizedImage(g, this, back);
    }
}
