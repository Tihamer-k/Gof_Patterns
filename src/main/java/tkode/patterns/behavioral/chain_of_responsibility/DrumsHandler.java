package tkode.patterns.behavioral.chain_of_responsibility;

public class DrumsHandler extends InstrumentHandler {
    @Override
    public void play(String instrument) {
        if (instrument.equals("drums")) {
            System.out.println("Playing the drums");
        } else if (successor != null) {
            successor.play(instrument);
        } else {
            System.out.println("Cannot play the instrument");
        }
    }
}