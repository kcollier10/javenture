package com.postgrad.practice.controllers;

import com.postgrad.practice.models.Item;
import com.postgrad.practice.repositories.ItemRepository;

public class ItemController {

    private final ItemRepository itemDao;

    public ItemController(ItemRepository itemDao) {
        this.itemDao = itemDao;
    }

}
