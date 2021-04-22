package com.postgrad.practice.models;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String item;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private long damage;

    public Item() {}

    public Item(long id, String item, String description, long damage) {
        this.id = id;
        this.item = item;
        this.description = description;
        this.damage = damage;
    }

    public Item(Item copy) {
        this.id = copy.id;
        this.item = copy.item;
        this.description = copy.description;
        this.damage = copy.damage;
    }

    public long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public String getDescription() {
        return description;
    }

    public long getDamage() {
        return damage;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }
}
