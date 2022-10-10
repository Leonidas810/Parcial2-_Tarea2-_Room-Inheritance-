package oop.parcial2.neighborhood;

public class LivingRoom extends Room {
    private int windows;
    private boolean tv;
    private boolean homeTheater;

    LivingRoom(int width, int height, String color,int windows, boolean tv, boolean homeTheater){
        super(width,height,color);
        this.windows=windows;
        this.tv=tv;
        this.homeTheater=homeTheater;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isHomeTheater() {
        return homeTheater;
    }
}
