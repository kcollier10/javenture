package com.postgrad.practice.models;

import javax.persistence.*;

@Entity
@Table(name = "armors")
public class Armor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long armorId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int damageBlock;

    public Armor () {}

    public Armor(long armorId, String name, String description, int damageBlock) {
        this.armorId = armorId;
        this.name = name;
        this.description = description;
        this.damageBlock = damageBlock;
    }

    public Armor(Armor copy) {
        this.armorId = copy.armorId;
        this.name = copy.name;
        this.description = copy.description;
        this.damageBlock = copy.damageBlock;
    }

    public long getArmorId() {
        return armorId;
    }

    public void setArmorId(long armorId) {
        this.armorId = armorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDamageBlock() {
        return damageBlock;
    }

    public void setDamageBlock(int damageBlock) {
        this.damageBlock = damageBlock;
    }
}