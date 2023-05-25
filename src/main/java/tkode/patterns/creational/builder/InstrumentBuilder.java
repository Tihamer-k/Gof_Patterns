package tkode.patterns.creational.builder;

public class InstrumentBuilder {
    private String name;
    private String type;
    private String color;
    private double price;

    public InstrumentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public InstrumentBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public InstrumentBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public InstrumentBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Instrument build() {
        return new Instrument(name, type, color, price);
    }
}
