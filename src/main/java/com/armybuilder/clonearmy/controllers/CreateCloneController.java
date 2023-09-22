package com.armybuilder.clonearmy.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.armybuilder.clonearmy.Clon;
import com.armybuilder.clonearmy.ClonData;

@Controller
public class CreateCloneController {

    /**
     * Vista de creación de clones
     * @return
     */
    @GetMapping("/create")
    public String showClone() {
        
        return "Create";
    }


    /**
     * Creación de clones con los atributos nombre, jumpack y canfly
     * @param nameToAdd
     * @param hasJumpPack
     * @param canFly
     * @return
     */
    @GetMapping("/createClon")
    public String createClone(@RequestParam("nameToAdd") String nameToAdd, @RequestParam("hasJumpPack") boolean hasJumpPack, @RequestParam("canFly") boolean canFly) {
        int nextId = Clon.getNextId();
        
        boolean jumpPack = hasJumpPack;
        boolean fly = canFly;
        
        Clon clon = new Clon(nameToAdd, nextId, jumpPack, fly);
        ClonData.addClon(clon);
        Clon.incrementNextId();
    
        return "redirect:/read";
    }

}

