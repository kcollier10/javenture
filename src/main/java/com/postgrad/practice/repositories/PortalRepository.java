package com.postgrad.practice.repositories;

import com.postgrad.practice.models.Location;
import com.postgrad.practice.models.Portal;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PortalRepository extends JpaRepository<Portal, Long> {
    public Portal findByLocation(Location location);
}
