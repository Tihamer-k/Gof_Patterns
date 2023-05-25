package tkode.pattern.creational.abstract_factory.factory;


import tkode.pattern.creational.abstract_factory.AcousticGuitar;
import tkode.pattern.creational.abstract_factory.GrandPiano;
import tkode.pattern.creational.abstract_factory.Guitar;
import tkode.pattern.creational.abstract_factory.Piano;

public class AcousticInstrumentFactory implements InstrumentFactory {
    @Override
    public Guitar createGuitar() {
        return new AcousticGuitar();
    }

    @Override
    public Piano createPiano() {
        return new GrandPiano();
    }
}