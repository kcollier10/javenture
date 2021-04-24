package com.postgrad.practice.repositories;

import com.postgrad.practice.models.Boss;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BossRepository extends JpaRepository<Boss, Long> {

}
