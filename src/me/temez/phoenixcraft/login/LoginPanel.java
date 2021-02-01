package me.temez.phoenixcraft.login;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;
import me.temez.phoenixcraft.components.CheckBox;
import me.temez.phoenixcraft.components.LoginField;
import me.temez.phoenixcraft.components.PassField;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel implements SwingerEventListener {
    private LoginFrame loginFrame = LoginFrame.getInstance();

    Image back = Swinger.getResource("login_assets/back.png");

    private STexturedButton close = new STexturedButton(Swinger.getResource("login_assets/close.png"), Swinger.getResource("login_assets/close.png"));
    private STexturedButton minimize = new STexturedButton(Swinger.getResource("login_assets/minimize.png"), Swinger.getResource("login_assets/minimize.png"));
    private STexturedButton login = new STexturedButton(Swinger.getResource("login_assets/login.png"), Swinger.getResource("login_assets/login_overlay.png"));

    public static LoginField loginField = new LoginField(89, 259, 281, 66, null, null);
    public static PassField passField = new PassField(89, 335, 281, 66, null, null);

    private CheckBox logged = new CheckBox(90, 550, 28, 28, "", true);

    public LoginPanel() {
        setLayout(null);
        setBackground(Swinger.TRANSPARENT);

        login.addEventListener(this);
        login.setBounds(89, 467);
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        minimize.addEventListener(this);
        minimize.setBounds(377, 9 ,29, 29);
        minimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        close.addEventListener(this);
        close.setBounds(412, 9, 29, 29);
        close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        loginField.setHorizontalAlignment(JTextField.CENTER);
        passField.setHorizontalAlignment(JTextField.CENTER);


        add(login);
        add(loginField);
        add(passField);
        add(minimize);
        add(close);
        add(logged);
    }

    @Override
    public void onEvent(SwingerEvent event) {
        if (event.getSource() == minimize) {
            loginFrame.setState(Frame.ICONIFIED);
        } else if (event.getSource() == close) {
            loginFrame.dispose();
        } else if (event.getSource() == login) {
            Login.TryLogin(loginField.getText(), passField.getText());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Swinger.drawFullsizedImage(g, this, back);
    }
}
