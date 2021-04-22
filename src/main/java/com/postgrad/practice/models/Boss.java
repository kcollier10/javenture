package com.postgrad.practice.models;

public class Boss {

    private final int bossId;
    private final String name;
    private final String description;
    private final int health;
    private final String voiceline;

    public Boss(int bossId, String name, String description, int health, String voiceline) {
        this.bossId = bossId;
        this.name = name;
        this.description = description;
        this.health = health;
        this.voiceline = voiceline;
    }

    public int getBossId() {
        return bossId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public String getVoiceline() {
        return voiceline;
    }
}