package tkode.patterns.creational.factory_method.factory;

import tkode.patterns.creational.factory_method.Guitar;
import tkode.patterns.creational.factory_method.Instrument;

public class GuitarFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Guitar();
    }
}