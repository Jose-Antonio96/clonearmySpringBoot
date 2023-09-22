package com.armybuilder.clonearmy.models;

import java.util.ArrayList;
import java.util.List;



public class Clon {
    private static int nextId = 1;
    private int id;
    public String name;
    public boolean hasJumpPack;
    public boolean canFly;
    
    
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

    public static void setNextId(int nextId) {
        Clon.nextId = nextId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCloneName(String name) {
        this.name = name;
    }

    public void setHasJumpPack(boolean hasJumpPack) {
        this.hasJumpPack = hasJumpPack;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }





}



    

