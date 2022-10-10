package oop.parcial2.neighborhood;

import java.util.TreeMap;

public class Street {
    private final String name;
    private final TreeMap<Integer,House> houses;

    Street(String name, TreeMap<Integer, House> houses){
        this.name=name;
        this.houses=houses;
    }

    public String getName() {
        return name;
    }
    public TreeMap<Integer, House> getHouses() {
        return houses;
    }

    public static StreetBuilder builder() {
        return new StreetBuilder();
    }
}
