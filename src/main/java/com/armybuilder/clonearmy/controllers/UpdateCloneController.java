package com.armybuilder.clonearmy.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.armybuilder.clonearmy.ClonData;
import java.util.List;
import java.util.ArrayList;
import com.armybuilder.clonearmy.Clon;


@Controller
public class UpdateCloneController {
    
    
    @GetMapping("/update")
    public String showUpdateClone(Model model) {
        // Get the data of the clone to update
        // Replace the following line with your code to fetch the data
        Clon clone = getCloneData();
    
        // Add the clone data to the model
        model.addAttribute("clone", clone);
    
        return "Update-form";
    }

}