package me.temez.phoenixcraft.menu;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.util.WindowMover;

import javax.swing.*;

public class MainFrame extends JFrame {

    public static MainFrame mainFrame;
    private final MainPanel mainPanel;

    public MainFrame() {
        super("PhoenixCraft");
        mainFrame = this;
        this.setUndecorated(true);
        this.setSize(450, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Swinger.TRANSPARENT);
        this.setIconImage(Swinger.getResource("ico.png"));
        this.setContentPane(mainPanel = new MainPanel());
        WindowMover mover = new WindowMover(this);
        addMouseListener(mover);
        addMouseMotionListener(mover);
        this.setVisible(true);
    }

    public static MainFrame getInstance() {
        return mainFrame;
    }

    public MainPanel getLauncherPanel() {
        return mainPanel;
    }
}
