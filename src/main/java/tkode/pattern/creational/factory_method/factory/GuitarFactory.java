package tkode.pattern.creational.factory_method.factory;

import tkode.pattern.creational.factory_method.Guitar;
import tkode.pattern.creational.factory_method.Instrument;

public class GuitarFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Guitar();
    }
}