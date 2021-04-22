package com.postgrad.practice.models;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationId;
    private final String description;
    private final String climate;
    private final Map<String, Integer> portals;

    public Location(int locationId, String description, String climate, Map<String, Integer> portals) {
        this.locationId = locationId;
        this.description = description;
        this.climate = climate;
        if (portals != null) {
            this.portals = new HashMap<>(portals);
        } else {
            this.portals = new HashMap<>();
        }
        this.portals.put("Q", 0);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public String getClimate() {
        return climate;
    }

    public Map<String, Integer> getPortals() {
        return new HashMap<String, Integer>(portals);
        // creating a new HashMap
        // useful because nothing outside of class can change the ports
        // can help ensure immutability
    }
}
