package tkode.patterns.behavioral.chain_of_responsibility;

public class ChainOfResponsibility {
    public static void example() {
        System.out.println("\nchain of responsibility Pattern:\n");
        // Create the chain of responsibility
        InstrumentHandler guitarHandler = new GuitarHandler();
        InstrumentHandler drumsHandler = new DrumsHandler();
        InstrumentHandler pianoHandler = new PianoHandler();

        guitarHandler.setSuccessor(drumsHandler);
        drumsHandler.setSuccessor(pianoHandler);

        // Play different instruments
        guitarHandler.play("guitar");
        guitarHandler.play("drums");
        guitarHandler.play("piano");
        guitarHandler.play("violin");
    }
}
