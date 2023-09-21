package com.armybuilder.clonearmy.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.armybuilder.clonearmy.ClonData;
import java.util.List;
import java.util.ArrayList;
import com.armybuilder.clonearmy.Clon;

@Controller
public class ReadCloneController {

    /**
     * @param model
     * @return String
     */

    @GetMapping("read")
    public String readClone(Model model) {
        List<Clon> clonList = ClonData.getClonList();
    
        List<String> clonNames = new ArrayList<>();
        List<Integer> clonIds = new ArrayList<>();
        List<Boolean> canFly = new ArrayList<>();
        List<Boolean> hasJumpPack = new ArrayList<>();
    
        for (Clon clon : clonList) {
            clonNames.add(clon.getCloneName());
            clonIds.add(clon.getCloneId());
            canFly.add(clon.isCanFly());
            hasJumpPack.add(clon.isHasJumpPack());
        }
    
        model.addAttribute("clonNames", clonNames);
        model.addAttribute("clonIds", clonIds);
        model.addAttribute("canFly", canFly);
        model.addAttribute("hasJumpPack", hasJumpPack);
    
        return "Read";
    }
}