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

import com.armybuilder.clonearmy.models.Clon;
import com.armybuilder.clonearmy.models.ClonData;

import java.util.List;
import java.util.ArrayList;

@Controller
/**
 * Controller para actualizar un clon
 */
public class UpdateCloneController {

    /**
     * Obtiene y muestra los detalles de un clon con el ID proporcionado.
     *
     * @param id    el ID del clon a obtener
     * @param model el objeto modelo para pasar datos a la vista
     * @return el nombre de la vista del formulario de actualización
     */
    @GetMapping("/update/{id}")
    public String showClone(@PathVariable("id") int id, Model model) {
        // Obtener los datos del clon seleccionado utilizando el ID
        Clon clon = ClonData.getCloneById(id);

        // Verificar si se encontró el clon
        if (clon == null) {
            return "redirect:/read";
        }

        // Pasar los datos del clon al modelo para que se muestren en el formulario
        model.addAttribute("clon", clon);
        model.addAttribute("clonId", id);

        // Devolver el nombre de la vista del formulario de actualización
        return "update";
    }

    /**
     * Actualiza un clon con el ID proporcionado utilizando el objeto Clon
     * proporcionado.
     *
     * @param clon   el objeto Clon que contiene los valores actualizados
     * @param clonId el ID del clon que se actualizará
     * @param model  el objeto Model para renderizar la vista
     * @return una cadena de texto que representa la URL de redirección
     */
    @PostMapping("/updateclones/{clonId}")
    public String updateClone(@ModelAttribute Clon clon, @PathVariable("clonId") int clonId, Model model) {
        Clon existingClone = ClonData.getCloneById(clonId);

        if (existingClone == null) {
            // Manejar el caso cuando la instancia existente no se encuentra
            return "redirect:/read";
        }
        
        // Actualizar los valores de la instancia existente con los valores del objeto
        // clon
        existingClone.setCloneName(clon.getCloneName());
        existingClone.setHasJumpPack(clon.isHasJumpPack());
        existingClone.setCanFly(clon.isCanFly());

        model.addAttribute("clonId", clonId);

        return "redirect:/read";
    }

}