package com.postgrad.practice.controllers;

import com.postgrad.practice.models.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PlayerController {


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "JAVENTURE");
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "LOGIN");
        return "players/login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "REGISTER");
        return "players/register";
    }

    @PostMapping("/register")
    public String registered(Model model, @Valid @ModelAttribute Player player) {
        return "players/register";
    }
}
