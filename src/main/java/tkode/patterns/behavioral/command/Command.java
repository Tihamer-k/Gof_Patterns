package tkode.patterns.behavioral.command;

public class Command {
    public static void example() {
        System.out.println("\nCommand Pattern:\n");
        Musician musician = new Musician();

        // Create a receiver
        Guitar guitar = new Guitar();

        // Create a concrete command with the receiver
        InstrumentCommand guitarCommand = new GuitarCommand(guitar);

        // Set the command to the invoker
        musician.setCommand(guitarCommand);

        // Invoke the command
        musician.playInstrument();
    }
}
