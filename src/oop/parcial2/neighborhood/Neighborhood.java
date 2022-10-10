package oop.parcial2.neighborhood;

import java.util.List;

public class Neighborhood {
    private final List<Street> streets;
    private final  int gardens;
    private final boolean basketballCourt;
    private final boolean footballCourt;
    private final boolean swimmingPool;

    Neighborhood(List<Street> streets, int gardens, boolean basketballCourt, boolean footballCourt, boolean swimmingPool){
        this.streets=streets;
        this.gardens=gardens;
        this.basketballCourt=basketballCourt;
        this.footballCourt=footballCourt;
        this.swimmingPool=swimmingPool;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public int getGardens() {
        return gardens;
    }

    public boolean isBasketballCourt() {
        return basketballCourt;
    }

    public boolean isFootballCourt() {
        return footballCourt;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public static NeighborhoodBuilder builder(){
        return new NeighborhoodBuilder();
    }
}
