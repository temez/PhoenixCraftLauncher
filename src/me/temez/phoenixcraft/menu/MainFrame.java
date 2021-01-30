package me.temez.phoenixcraft.menu;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.animation.Animator;
import fr.theshark34.swinger.util.WindowMover;

import javax.swing.*;

public class MainFrame extends JFrame {

    private static MainFrame instance;
    public LauncherPanel launcherPanel;

    public MainFrame() {
        super("PhoenixCraft");
        this.setUndecorated(true);
        this.setSize(940, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Swinger.TRANSPARENT);
        this.setIconImage(Swinger.getResource("ico.png"));
        this.setContentPane(launcherPanel = new LauncherPanel());
        WindowMover mover = new WindowMover(this);
        addMouseListener(mover);
        addMouseMotionListener(mover);
        Animator.fadeInFrame(this, 10);
        this.setVisible(true);
    }

    public static MainFrame getInstance() {
        return instance;
    }

    public LauncherPanel getLauncherPanel() {
        return launcherPanel;
    }
}
