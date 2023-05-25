package tkode.pattern.creational.abstract_factory.factory;


import tkode.pattern.creational.abstract_factory.Guitar;
import tkode.pattern.creational.abstract_factory.Piano;

public interface InstrumentFactory {
    Guitar createGuitar();
    Piano createPiano();
}
