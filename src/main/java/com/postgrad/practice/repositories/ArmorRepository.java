package com.postgrad.practice.repositories;

import com.postgrad.practice.models.Armor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArmorRepository extends JpaRepository<Armor, Long> {
    @Query(value = "SELECT * FROM armors ORDER BY RAND() LIMIT 1", nativeQuery = true)
    public Armor findRandomArmor();
}
