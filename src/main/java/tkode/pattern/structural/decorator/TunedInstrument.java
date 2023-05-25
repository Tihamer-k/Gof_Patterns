package tkode.pattern.structural.decorator;

public class TunedInstrument extends InstrumentDecorator {
    public TunedInstrument(Instrument instrument) {
        super(instrument);
    }

    @Override
    public void play() {
        instrument.play();
        tune();
    }

    private void tune() {
        System.out.println("Tuning the instrument");
    }
}
