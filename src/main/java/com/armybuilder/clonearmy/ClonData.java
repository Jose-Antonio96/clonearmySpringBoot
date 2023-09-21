package com.armybuilder.clonearmy;

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


    


}
