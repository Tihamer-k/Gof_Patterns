package tkode.patterns.creational.factory_method.factory;

import tkode.patterns.creational.factory_method.Instrument;

public abstract class InstrumentFactory {
    public abstract Instrument createInstrument();

    public void playInstrument() {
        Instrument instrument = createInstrument();
        instrument.play();
    }
}