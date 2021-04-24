package com.postgrad.practice;


import com.postgrad.practice.models.Player;
import com.postgrad.practice.models.PlayerWithRoles;
import com.postgrad.practice.repositories.PlayerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsLoader implements UserDetailsService {

    private final PlayerRepository playerDao;

    public UserDetailsLoader(PlayerRepository playerDao) {
        this.playerDao = playerDao;
    }

    @Override
    public UserDetails loadPlayerByUsername(String username) throws UsernameNotFoundException {
        Player player = playerDao.findPlayerByUsername(username);

        if (player == null) {
            throw new UsernameNotFoundException("No user found for " + username);
        }

        return new PlayerWithRoles(player);
    }
}