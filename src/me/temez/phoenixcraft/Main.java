package me.temez.phoenixcraft;

import fr.theshark34.swinger.Swinger;
import me.temez.phoenixcraft.launcher.Launcher;
import me.temez.phoenixcraft.login.LoginFrame;

public class Main {

    public static void main(String[] args) {
        Swinger.setSystemLookNFeel();
        Swinger.setResourcePath("/me/temez/phoenixcraft/resources");
        Launcher.beforeStart();
        LoginFrame instance = Launcher.start();
        instance.setVisible(true);
    }

}
