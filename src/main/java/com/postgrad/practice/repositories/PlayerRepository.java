package com.postgrad.practice.repositories;

import com.postgrad.practice.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
