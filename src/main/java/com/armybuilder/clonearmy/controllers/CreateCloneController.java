package com.armybuilder.clonearmy.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.armybuilder.clonearmy.models.Clon;
import com.armybuilder.clonearmy.models.ClonData;

@Controller
public class CreateCloneController {

    @GetMapping("/create")
    public String showClone() {
        
        return "Create";
    }


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

