package tkode.pattern.creational.factory_method;

import tkode.pattern.creational.factory_method.factory.GuitarFactory;
import tkode.pattern.creational.factory_method.factory.InstrumentFactory;
import tkode.pattern.creational.factory_method.factory.PianoFactory;

public class FactoryMethod {
    public static void example(){
        System.out.println("\nFactory Method Pattern:\n");
        InstrumentFactory guitarFactory = new GuitarFactory();
        Instrument guitar = guitarFactory.createInstrument();
        guitar.play(); // Playing the guitar

        InstrumentFactory pianoFactory = new PianoFactory();
        Instrument piano = pianoFactory.createInstrument();
        piano.play(); // Playing the piano
    }
}
