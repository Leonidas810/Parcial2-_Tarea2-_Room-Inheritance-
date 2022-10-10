package oop.parcial2.neighborhood;

public class Kitchen extends Room{

    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;

    Kitchen(int width, int height, String color,boolean stove,boolean sink, int windows, boolean refrigerator, boolean oven){
        super(width,height,color);
        this.stove=stove;
        this.sink=sink;
        this.windows=windows;
        this.refrigerator=refrigerator;
        this.oven=oven;
    }

    public boolean isStove() {
        return stove;
    }

    public boolean isSink() {
        return sink;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isRefrigerator() {
        return refrigerator;
    }

    public boolean isOven() {
        return oven;
    }

    public static KitchenBuilder builder() {
        return new KitchenBuilder();
    }
}
