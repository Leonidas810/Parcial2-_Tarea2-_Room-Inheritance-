package oop.parcial2.neighborhood;

import java.util.TreeMap;

public class StreetBuilder {
    private String name;
    private TreeMap<Integer,House> houses;

    public StreetBuilder name(String name){
        this.name=name;
        return this;
    }

    public StreetBuilder houses(TreeMap<Integer,House> houses){
        this.houses=houses;
        return this;
    }

    public Street build(){
        return new Street(name,houses);
    }

    public StreetBuilder houses(int i, House house) {
        if(houses==null){
            this.houses=new TreeMap<>();
        }
        houses.put(i,house);
        return this;
    }
}
