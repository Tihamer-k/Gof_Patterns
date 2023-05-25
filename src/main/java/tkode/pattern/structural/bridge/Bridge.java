package tkode.pattern.structural.bridge;

import tkode.pattern.structural.bridge.impl.AcousticImpl;
import tkode.pattern.structural.bridge.impl.ElectricImpl;
import tkode.pattern.structural.bridge.impl.InstrumentImpl;

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
