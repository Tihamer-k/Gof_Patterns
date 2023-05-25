package tkode.pattern.creational.factory_method.factory;

import tkode.pattern.creational.factory_method.Instrument;

public abstract class InstrumentFactory {
    public abstract Instrument createInstrument();

    public void playInstrument() {
        Instrument instrument = createInstrument();
        instrument.play();
    }
}