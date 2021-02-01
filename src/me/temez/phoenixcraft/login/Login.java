package me.temez.phoenixcraft.login;

import me.temez.phoenixcraft.menu.MainFrame;

import java.util.HashMap;

public class Login {
    static HashMap<String, String> players = new HashMap<>();

    public static void TryLogin(String login, String pass) {
        //TODO database
        players.put("temez", "2119921155Temez`");
        if (players.containsKey(login)) {
            if (players.get(login).equals(pass)) {
                System.out.println("1");
                Login(login);
            } else {
                LoginPanel.passField.setText("");
                //TODO frame alert
            }
        } else {
            //TODO frame alert
        }
    }

    private static void Login(String player) {
        LoginFrame.getInstance().dispose();
        MainFrame.mainFrame = new MainFrame();
    }
}
