package com.postgrad.practice.repositories;

import com.postgrad.practice.models.Boss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BossRepository extends JpaRepository<Boss, Long> {
    @Query(value = "SELECT * FROM bosses ORDER BY RAND() LIMIT 1", nativeQuery = true)
    public Boss findRandomBoss();
}
