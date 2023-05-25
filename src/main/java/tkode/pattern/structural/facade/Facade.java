package tkode.pattern.structural.facade;

public class Facade {
    public static void example() {
        System.out.println("\nFacade Pattern:\n");
        InstrumentFacade instrumentFacade = new InstrumentFacade();

        // Encender y tocar el instrumento
        instrumentFacade.playInstrument();

        // Detener el instrumento
        instrumentFacade.stopInstrument();
    }
}
