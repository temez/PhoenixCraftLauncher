package me.temez.phoenixcraft.login;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.util.WindowMover;
import me.temez.phoenixcraft.menu.MainFrame;

import javax.swing.*;

public class LoginFrame extends JFrame {

    private static LoginFrame LoginFrame;
    private final LoginPanel LoginPanel;

    public LoginFrame() {

        super("PhoenixCraft");
        LoginFrame = this;
        this.setUndecorated(true);
        this.setSize(450, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Swinger.TRANSPARENT);
        this.setIconImage(Swinger.getResource("ico.png"));
        this.setContentPane(LoginPanel = new LoginPanel());
        WindowMover mover = new WindowMover(this);
        addMouseListener(mover);
        addMouseMotionListener(mover);
        this.setVisible(true);
    }

    public static LoginFrame getInstance() {
        return LoginFrame;
    }
}
