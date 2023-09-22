package com.armybuilder.clonearmy.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @Value("${spring.application.name}")
    String appClone;

    /**
     * Página landing
     * @param model
     * @return
     */
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appClone", appClone);
        return "/Clones";
    }
}