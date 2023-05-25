package tkode.patterns.behavioral.chain_of_responsibility;

public class PianoHandler extends InstrumentHandler {
    @Override
    public void play(String instrument) {
        if (instrument.equals("piano")) {
            System.out.println("Playing the piano");
        } else if (successor != null) {
            successor.play(instrument);
        } else {
            System.out.println("Cannot play the instrument");
        }
    }
}
