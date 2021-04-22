package com.postgrad.practice.models;

public class Armor {

    private final int armorId;
    private final String name;
    private final String description;
    private final int damageBlock;

    public Armor(int armorId, String name, String description, int damageBlock) {
        this.armorId = armorId;
        this.name = name;
        this.description = description;
        this.damageBlock = damageBlock;
    }

    public int getArmorId() {
        return armorId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDamageBlock() {
        return damageBlock;
    }
}