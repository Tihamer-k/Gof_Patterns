package tkode.patterns.structural.proxy;

public class InstrumentProxy implements Instrument {
    private Guitar guitar;

    @Override
    public void play() {
        if (guitar == null) {
            guitar = new Guitar();
        }

        System.out.println("Preparing the guitar");
        guitar.play();
        System.out.println("Cleaning up the guitar");
    }
}
