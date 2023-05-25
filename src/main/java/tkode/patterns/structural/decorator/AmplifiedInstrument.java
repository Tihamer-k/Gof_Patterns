package tkode.patterns.structural.decorator;

public class AmplifiedInstrument extends InstrumentDecorator {
    public AmplifiedInstrument(Instrument instrument) {
        super(instrument);
    }

    @Override
    public void play() {
        instrument.play();
        amplify();
    }

    private void amplify() {
        System.out.println("Amplifying the instrument");
    }
}
