package tkode.patterns.structural.proxy;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}
