package com.postgrad.practice.repositories;

import com.postgrad.practice.models.Item;
import com.postgrad.practice.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LocationRepository extends JpaRepository<Location, Long> {
    @Query(value = "SELECT * FROM locations ORDER BY RAND() LIMIT 1", nativeQuery = true)
    public Location findRandomLocation();
}
