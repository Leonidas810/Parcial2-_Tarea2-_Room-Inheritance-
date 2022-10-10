package oop.parcial2.neighborhood;

import java.util.LinkedList;

public class House {
    private final Kitchen kitchen;
    private final DiningRoom diningRoom;
    private final LivingRoom livingRoom;
    private final LinkedList<RestRoom>  restRooms;
    private final LinkedList<BedRoom>  bedRooms;

    //package private default
    public House(Kitchen kitchen,DiningRoom diningRoom,LivingRoom livingRoom,LinkedList<RestRoom>  restRooms,LinkedList<BedRoom>  bedRooms){
        this.kitchen=kitchen;
        this.diningRoom=diningRoom;
        this.livingRoom=livingRoom;
        this.restRooms=restRooms;
        this.bedRooms=bedRooms;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public LinkedList<RestRoom> getRestRooms() {
        return restRooms;
    }

    public LinkedList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }
}
