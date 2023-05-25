package tkode.pattern.creational.prototype;

public class Piano extends Instrument {
    public Piano() {
        this.name = "Piano";
        this.type = "Grand";
    }

    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}
