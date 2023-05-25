package tkode.pattern.structural.facade;

class InstrumentFacade {
    private final Guitar guitar;
    private final Amplifier amplifier;
    private final Effects effects;

    public InstrumentFacade() {
        guitar = new Guitar();
        amplifier = new Amplifier();
        effects = new Effects();
    }

    public void playInstrument() {
        amplifier.on();
        amplifier.setVolume(10);
        effects.enable();
        guitar.on();
        guitar.play();
    }

    public void stopInstrument() {
        guitar.off();
        effects.disable();
        amplifier.off();
    }
}
