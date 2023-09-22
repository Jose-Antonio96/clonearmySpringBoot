package com.armybuilder.clonearmy.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import com.armybuilder.clonearmy.Clon;
import com.armybuilder.clonearmy.ClonData;


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
     * @return una cadena de texto que representa la URL de redirección
     */


    @PutMapping("/updateclones/{clonId}")
public String update(@PathVariable Integer clonId, @RequestBody Clon cloneData) {
     Clon cloneDataExistent = ClonData.getCloneById(clonId);

     cloneDataExistent.setCloneName(cloneData.getCloneName());
     cloneDataExistent.setHasJumpPack(cloneData.isHasJumpPack());
     cloneDataExistent.setCanFly(cloneData.isCanFly());

     return "redirect:/read";

    
    
}


}