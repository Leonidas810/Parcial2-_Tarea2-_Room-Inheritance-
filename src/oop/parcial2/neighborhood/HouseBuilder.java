package oop.parcial2.neighborhood;

import java.util.LinkedList;

public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private LinkedList<RestRoom> restRooms;
    private LinkedList<BedRoom>  bedRooms;

    public HouseBuilder kitchen(Kitchen kitchen){
        this.kitchen=kitchen;
        return this;
    }
    public HouseBuilder diningRoom(DiningRoom diningRoom){
        this.diningRoom=diningRoom;
        return this;
    }
    public HouseBuilder livingRoom(LivingRoom livingRoom){
        this.livingRoom=livingRoom;
        return this;
    }
    public HouseBuilder restRooms(LinkedList<RestRoom> restRooms){
        this.restRooms=restRooms;
        return this;
    }

    public HouseBuilder bedRooms(LinkedList<BedRoom>  bedRooms){
        this.bedRooms=bedRooms;
        return this;
    }

    public HouseBuilder bedRoom(BedRoom  bedRoom){
        if(this.bedRooms==null){
            this.bedRooms=new LinkedList<>();
        }
        this.bedRooms.add(bedRoom);
        return this;
    }

    public House build(){
        return new House( kitchen, diningRoom, livingRoom,  restRooms,  bedRooms);
    }
}
