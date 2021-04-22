package com.postgrad.practice.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String climate;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Portal> portals;

    public Location () {}

    public Location(long id, String name, String description, String climate, List<Portal> portals) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.climate = climate;
        this.portals = portals;
    }

    public Location(Location copy) {
        this.id = copy.id;
        this.name = copy.name;
        this.description = copy.description;
        this.climate = copy.climate;
        this.portals = copy.portals;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public List<Portal> getPortals() {
        return portals;
    }

    public void setPortals(List<Portal> portals) {
        this.portals = portals;
    }
}





