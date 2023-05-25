package tkode.patterns.structural.decorator;

public class BasicInstrument implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing basic instrument");
    }
}
