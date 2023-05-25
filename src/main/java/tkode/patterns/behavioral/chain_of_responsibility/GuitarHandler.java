package tkode.patterns.behavioral.chain_of_responsibility;

public class GuitarHandler extends InstrumentHandler {
    @Override
    public void play(String instrument) {
        if (instrument.equals("guitar")) {
            System.out.println("Playing the guitar");
        } else if (successor != null) {
            successor.play(instrument);
        } else {
            System.out.println("Cannot play the instrument");
        }
    }
}
