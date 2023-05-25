package tkode.pattern.structural.decorator;

public abstract class InstrumentDecorator implements Instrument {
    protected Instrument instrument;

    public InstrumentDecorator(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void play() {
        instrument.play();
    }
}
