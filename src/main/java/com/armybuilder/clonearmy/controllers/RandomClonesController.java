package com.armybuilder.clonearmy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomClonesController {
    
    @GetMapping("randomclones")
    public String randomClones(){
        return "RandomClones";
    }
}
