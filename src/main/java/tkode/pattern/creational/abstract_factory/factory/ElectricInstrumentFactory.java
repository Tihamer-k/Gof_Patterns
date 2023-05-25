package tkode.pattern.creational.abstract_factory.factory;

import tkode.pattern.creational.abstract_factory.DigitalPiano;
import tkode.pattern.creational.abstract_factory.ElectricGuitar;
import tkode.pattern.creational.abstract_factory.Guitar;
import tkode.pattern.creational.abstract_factory.Piano;

public class ElectricInstrumentFactory implements InstrumentFactory {
    @Override
    public Guitar createGuitar() {
        return new ElectricGuitar();
    }

    @Override
    public Piano createPiano() {
        return new DigitalPiano();
    }
}
