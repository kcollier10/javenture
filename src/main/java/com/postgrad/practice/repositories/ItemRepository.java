package com.postgrad.practice.repositories;

import com.postgrad.practice.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
}
