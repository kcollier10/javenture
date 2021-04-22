package com.postgrad.practice.models;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private final int itemId;
    private final String name;
    private final String description;
    private final int luckyPoints;
    private final Map<String, Integer> allItems;


    public Item(int itemId, String name, String description, int luckyPoints, Map<String, Integer> allItems) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.luckyPoints = luckyPoints;
        if (allItems != null) {
            this.allItems = new HashMap<>(allItems);
        } else {
            this.allItems = new HashMap<>();

        }
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLuckyPoints() {
        return luckyPoints;
    }

    public Map<String, Integer> getAllItems() {
        return allItems;
    }
}
