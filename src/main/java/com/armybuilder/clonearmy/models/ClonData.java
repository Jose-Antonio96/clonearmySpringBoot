package com.armybuilder.clonearmy.models;

import java.util.ArrayList;
import java.util.List;

public class ClonData {

    
    private static List<Clon> clonList = new ArrayList<>();

    // Resto del código de ClonData

    public static List<Clon> getClonList() {
        return clonList;
    }

    public static void addClon(Clon clon) {
        clonList.add(clon);
    }

    public static Clon getCloneById(int id) {
        for (Clon clone : clonList) {
            if (clone.getCloneId() == id) {
                return clone; // Devolver el clon si se encuentra
            }
        }
        return null;

    }

    


    


}
