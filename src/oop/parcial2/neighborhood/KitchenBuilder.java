package oop.parcial2.neighborhood;

public class KitchenBuilder {
    private int width;
    private int height;
    private String color;
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;

    public KitchenBuilder width(final int width){
        this.width =width;
        return this;
    }
    public KitchenBuilder height(final int height){
        this.height =height;
        return this;
    }
    public KitchenBuilder color(final String color){
        this.color =color;
        return this;
    }

    public KitchenBuilder stove(final boolean stove){
        this.stove =stove;
        return this;
    }
    public KitchenBuilder sink(final boolean sink){
        this.sink =sink;
        return this;
    }
    public KitchenBuilder windows(final int windows){
        this.windows =windows;
        return this;
    }
    public KitchenBuilder refrigerator(final boolean refrigerator){
        this.refrigerator =refrigerator;
        return this;
    }
    public KitchenBuilder oven(final boolean oven){
        this.oven =oven;
        return this;
    }

    public Kitchen build(){
        return new Kitchen(width,height,color,stove,sink,windows,refrigerator,oven);
    }
}
