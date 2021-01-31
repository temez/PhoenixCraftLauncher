package me.temez.phoenixcraft.utils;

import fr.theshark34.swinger.Swinger;
import me.temez.phoenixcraft.Settings;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BaseUtils {
    public static Font font;


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

    public static Font getFont(float size, int type){
        try {
            switch (type) {
                case 1:
                    font = Font.createFont(0, BaseUtils.class.getResourceAsStream("/me/temez/phoenixcraft/resources/fonts/Font1.ttf")).deriveFont(size);
                    break;
                case 2:
                    font = Font.createFont(0, BaseUtils.class.getResourceAsStream(Swinger.getResourcePath() + "fonts/Font2.ttf")).deriveFont(size); // 28691096
                    break;
                case 3:
                    font = Font.createFont(0, BaseUtils.class.getResourceAsStream(Swinger.getResourcePath() + "fonts/Font3.ttf")).deriveFont(size);
                    break;
                default:
                    font = new Font("Arial", 0, (int) (size));
            }
        } catch (FontFormatException | IOException e) {
            font = new Font("Arial", 0, (int) (size));
        }
        return font;
    }

}
