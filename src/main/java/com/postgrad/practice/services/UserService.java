package com.postgrad.practice.services;

import com.postgrad.practice.models.Player;
import com.postgrad.practice.repositories.PlayerRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    private final PlayerRepository playerDao;

    public UserService(PlayerRepository playerDao) {
        this.playerDao = playerDao;
    }

    // returns user in our database
    public Player getLoggedInUser() {
        Player user = (Player) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long userId = user.getPlayerId();
        return playerDao.findById(userId).get();
    }
}

