package com.postgrad.practice.models;

import javax.persistence.*;

@Entity
@Table(name = "portals")
public class Portal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String portalLocation;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Portal() {}

    public Portal(long id, String portalLocation, Location location) {
        this.id = id;
        this.portalLocation = portalLocation;
        this.location = location;
    }

    public Portal(Portal copy) {
        this.id = copy.id;
        this.portalLocation = copy.portalLocation;
        this.location = copy.location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPortalLocation() {
        return portalLocation;
    }

    public void setPortalLocation(String portalLocation) {
        this.portalLocation = portalLocation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
