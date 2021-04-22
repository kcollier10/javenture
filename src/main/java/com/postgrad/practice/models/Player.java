package com.postgrad.practice.models;

public class Player {

    private final int playerId;
    private final String name;
    private final int health;
    private final String voiceline;
    private final String item;

    public Player(int playerId, String name, int health, String voiceline, String item) {
        this.playerId = playerId;
        this.name = name;
        this.health = health;
        this.voiceline = voiceline;
        this.item = item;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getVoiceline() {
        return voiceline;
    }

    public String getItem() {
        return item;
    }
}