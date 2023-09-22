package com.armybuilder.clonearmy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomClonesController {
    
    /**
     * Pantalla de la api rest para obtener usuarios random
     * @return
     */
    @GetMapping("randomclones")
    public String randomClones(){
        return "RandomClones";
    }
}
