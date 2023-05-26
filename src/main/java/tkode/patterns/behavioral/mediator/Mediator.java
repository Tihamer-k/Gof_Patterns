package tkode.patterns.behavioral.mediator;

public class Mediator {
    public static void example() {
        System.out.println("\nMediator Pattern:\n");
        MusicBand band = new MusicBand();

        InstrumentPlayer guitarPlayer = new GuitarPlayer(band);
        InstrumentPlayer pianoPlayer = new PianoPlayer(band);

        band.addInstrumentPlayer(guitarPlayer);
        band.addInstrumentPlayer(pianoPlayer);

        band.sendMessage(guitarPlayer, "Let's start the performance!");
        band.sendMessage(pianoPlayer,"Sure, I'm ready!");

        band.playMusic();
    }
}
