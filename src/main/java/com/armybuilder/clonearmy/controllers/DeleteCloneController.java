package com.armybuilder.clonearmy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.armybuilder.clonearmy.Clon;
import com.armybuilder.clonearmy.ClonData;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeleteCloneController {

    
    /** 
     * Muestra la lista de clones existentes
     * @param model
     * @return String
     */
    @GetMapping("delete")
    public String showClone(Model model) {
    List<Clon> clonList = ClonData.getClonList();
    
    List<String> clonNames = new ArrayList<>();
    List<Integer> clonIds = new ArrayList<>();
    
    for (Clon clon : clonList) {
        clonNames.add(clon.getCloneName());
        clonIds.add(clon.getCloneId());
    }
    
    model.addAttribute("clonNames", clonNames);
    model.addAttribute("clonIds", clonIds);
    
    return "Delete";
}

    /**
     * Deletes data from the list if it is found.
     *
     * @param  nameToDelete  the name of the data to be deleted
     * @return               a redirect to the home page or the data list
     */
    
     @GetMapping("deleteclones")
     public String deleteData(@RequestParam("nameToDelete") String nameToDelete) {
        List<Clon> clonList = ClonData.getClonList();
        
        // Buscar el dato por su nombre en la lista
        Clon clonToRemove = null;
        for (Clon clon : clonList) {
            if (clon.getCloneName().equals(nameToDelete)) {
                clonToRemove = clon;
                break;
            }
        }
        
        // Eliminar el dato si se encontró
        if (clonToRemove != null) {
            clonList.remove(clonToRemove);
        }
        
        return "redirect:/delete"; // Redireccionar a la página principal o a la lista de datos
    }
}