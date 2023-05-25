package tkode.patterns.structural.bridge;

import tkode.patterns.structural.bridge.impl.AcousticImpl;
import tkode.patterns.structural.bridge.impl.ElectricImpl;
import tkode.patterns.structural.bridge.impl.InstrumentImpl;

public class Bridge {
    public static void example() {
        System.out.println("\nBridge Pattern:\n");
        // Crear implementadores
        InstrumentImpl acousticImpl = new AcousticImpl();
        InstrumentImpl electricImpl = new ElectricImpl();

        // Crear abstracciones y asignar implementadores
        Instrument guitar = new Guitar(acousticImpl);
        Instrument piano = new Piano(electricImpl);

        // Utilizar las abstracciones
        guitar.play();
        piano.play();
    }
}
