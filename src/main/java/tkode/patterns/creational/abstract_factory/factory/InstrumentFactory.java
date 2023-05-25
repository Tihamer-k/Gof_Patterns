package tkode.patterns.creational.abstract_factory.factory;


import tkode.patterns.creational.abstract_factory.Guitar;
import tkode.patterns.creational.abstract_factory.Piano;

public interface InstrumentFactory {
    Guitar createGuitar();
    Piano createPiano();
}
