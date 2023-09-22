package com.armybuilder.clonearmy;

import java.util.ArrayList;
import java.util.List;

/**
 * Lista de clones con sus datos almacenados
 */
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

    public static Clon getCloneByName(String name) {
        for (Clon clone : clonList) {
            if (clone.getCloneName().equals(name)) {
                return clone; // Devolver el clon si se encuentra
            }
        }
        return null;
    }

    public static Clon getHasJumpPack(boolean hasJumpPack) {
        for (Clon clone : clonList) {
            if (clone.isHasJumpPack() == hasJumpPack) {
                return clone; // Devolver el clon si se encuentra
            }
        }
        return null;
    }

    public static Clon getCanFly(boolean canFly) {
        for (Clon clone : clonList) {
            if (clone.isCanFly() == canFly) {
                return clone; // Devolver el clon si se encuentra

            }
        }
        return null;
    }
}
