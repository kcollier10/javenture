package com.postgrad.practice.repositories;

import com.postgrad.practice.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
