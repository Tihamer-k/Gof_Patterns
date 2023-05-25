package tkode.patterns.creational.factory_method.factory;

import tkode.patterns.creational.factory_method.Instrument;
import tkode.patterns.creational.factory_method.Piano;

public class PianoFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Piano();
    }
}
