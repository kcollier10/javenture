package com.postgrad.practice.models;

import javax.persistence.*;

@Entity
@Table(name = "bosses")
public class Boss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bossId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int health;

    public Boss() {}

    public Boss(long bossId, String name, String description, int health) {
        this.bossId = bossId;
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public Boss(Boss copy) {
        this.bossId = copy.bossId;
        this.name = copy.name;
        this.description = copy.description;
        this.health = copy.health;
    }

    public long getBossId() {
        return bossId;
    }

    public void setBossId(long bossId) {
        this.bossId = bossId;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}