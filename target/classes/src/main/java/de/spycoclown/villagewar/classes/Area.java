package de.spycoclown.villagewar.classes;

import de.spycoclown.villagewar.utils.Util.AreaType;

public class Area {

    private int id;
    public int GetID(){
        return this.id;
    };
    public void SetID(int _id){
        this.id = _id;
    };
    
    private AreaType areaType;
    public AreaType getAreaType(){
        return this.areaType;
    }

    private String name;
    private int reputation; 
    private int tier;
}