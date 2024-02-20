package com.example.gameapi.Model;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Game> games = new ArrayList<>() {};

    public Data(){
        Game g1 = new Game();
        g1.setName("Minecraft");
        g1.setCategory(Game.Category.Sandbox);
        games.add(g1);

        Game g2 = new Game();
        g2.setName("League Of Legends");
        g2.setCategory(Game.Category.MOBA);
        games.add(g2);
    }
}
