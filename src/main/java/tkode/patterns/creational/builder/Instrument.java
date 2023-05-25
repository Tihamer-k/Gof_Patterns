package tkode.patterns.creational.builder;

import tkode.util.NumFormat;

public class Instrument {
    private String name;
    private String type;
    private String color;
    private double price;

    public Instrument(String name, String type, String color, double price) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void play() {
        System.out.println("Playing " + name);
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price= " + NumFormat.priceFormat(price) +
                '}';
    }
}
