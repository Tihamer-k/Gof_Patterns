package tkode.patterns.creational.abstract_factory;

public class DigitalPiano implements Piano {
    @Override
    public void play() {
        System.out.println("Playing digital piano");
    }
}
