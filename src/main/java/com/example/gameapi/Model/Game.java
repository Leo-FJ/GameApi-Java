package com.example.gameapi.Model;

import java.util.concurrent.atomic.AtomicInteger;

public class Game {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    int id;
    String name;
    Category category;

    public Game() {
        this.id = idGenerator.getAndIncrement();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    enum Category {
        FPS, MOBA, OpenWorld, RTS, RPG, MMORPG, Rouge, TurnBased, Strategy, Simulation, Sport, Platform, Racing, BattleRoyal, Sandbox, Survival, IdleGames,
    }
}
