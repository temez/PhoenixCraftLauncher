package me.temez.phoenixcraft.launcher;

import me.temez.phoenixcraft.Settings;
import me.temez.phoenixcraft.login.LoginFrame;
import me.temez.phoenixcraft.utils.BaseUtils;

public class Launcher {
    public static void beforeStart() {
        BaseUtils.getGameDirectory(Settings.game_dir);
    }

    public static LoginFrame start() {
        return new LoginFrame();
    }
}
