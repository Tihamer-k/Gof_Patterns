package tkode.pattern.creational.abstract_factory;

import tkode.pattern.creational.abstract_factory.factory.AcousticInstrumentFactory;
import tkode.pattern.creational.abstract_factory.factory.ElectricInstrumentFactory;
import tkode.pattern.creational.abstract_factory.factory.InstrumentFactory;

public class AbstractFactory {
    public static void example() {
        System.out.println("\nAbstract Factory Pattern:\n");
        InstrumentFactory acousticFactory = new AcousticInstrumentFactory();
        Guitar acousticGuitar = acousticFactory.createGuitar();
        Piano grandPiano = acousticFactory.createPiano();
        acousticGuitar.play();
        grandPiano.play();

        InstrumentFactory electricFactory = new ElectricInstrumentFactory();
        Guitar electricGuitar = electricFactory.createGuitar();
        Piano digitalPiano = electricFactory.createPiano();
        electricGuitar.play();
        digitalPiano.play();
    }
}
