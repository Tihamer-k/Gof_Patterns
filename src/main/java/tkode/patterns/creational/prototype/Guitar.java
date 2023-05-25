package tkode.patterns.creational.prototype;

public class Guitar extends Instrument {
    public Guitar() {
        this.name = "Guitar";
        this.type = "Acoustic";
    }

    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}
