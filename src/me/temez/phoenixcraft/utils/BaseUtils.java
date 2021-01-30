package me.temez.phoenixcraft.utils;

import me.temez.phoenixcraft.Settings;

import java.io.File;

public class BaseUtils {

    public static int getPlatform() {
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win"))
            return 2;
        if (osName.contains("mac"))
            return 3;
        if (osName.contains("solaris"))
            return 1;
        if (osName.contains("sunos"))
            return 1;
        if (osName.contains("linux"))
            return 0;
        if (osName.contains("unix"))
            return 0;

        return 4;
    }

    public static File getGameDirectory(String gameDirectory) {
        String home = System.getProperty("user.home", ".");
        File fiDir;
        String appData = System.getenv(Settings.par_directory);
        fiDir = new File(appData, gameDirectory + File.separator);
        if (!fiDir.exists()) {
            fiDir.mkdir();
        }
        return fiDir;
    }

}
