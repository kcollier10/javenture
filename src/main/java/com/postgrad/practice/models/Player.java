package com.postgrad.practice.models;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long playerId;

    @Size(min = 3, message = "Username must be more than 3 characters and less than 20 characters.")
    @NotBlank(message = "Required")
    @Column(nullable = false, unique = true, length = 20)
    private String name;

    @Size(min = 8, message = "Password must be at least 8 characters in length")
    @NotBlank(message = "*Required")
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private long health;

    public Player() {}

    public Player(long playerId, @Size(min = 3, message = "Username must be more than 3 characters and less than 20 characters.") @NotBlank(message = "Required") String name, @Size(min = 8, message = "Password must be at least 8 characters in length") @NotBlank(message = "*Required") String password, long health) {
        this.playerId = playerId;
        this.name = name;
        this.password = password;
        this.health = health;
    }

    public Player(Player copy) {
        this.playerId = copy.playerId;
        this.name = copy.name;
        this.password = copy.password;
        this.health = copy.health;
    }

    public long getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public long getHealth() {
        return health;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealth(long health) {
        this.health = health;
    }
}