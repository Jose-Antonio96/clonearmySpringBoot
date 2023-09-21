package com.armybuilder.clonearmy;

import java.util.ArrayList;
import java.util.List;



public class Clon {
    private static int nextId = 1;
    private int id;
    private String name;
    private boolean hasJumpPack;
    private boolean canFly;
    
    public Clon(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public Clon(String name, int id, boolean hasJumpPack, boolean canFly) {
        this.id = nextId;
        this.name = name;
        this.hasJumpPack = hasJumpPack;
        this.canFly = canFly;
    }

    public int getCloneId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getCloneName() {
        return name;
    }

    public static void incrementNextId() {
        nextId++;
    }

    public boolean isHasJumpPack() {
        return hasJumpPack;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void getCloneData(){
        
    }


}



    

