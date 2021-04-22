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


}
