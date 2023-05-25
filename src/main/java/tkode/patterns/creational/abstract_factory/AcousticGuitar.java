package tkode.patterns.creational.abstract_factory;


public class AcousticGuitar implements Guitar {
    @Override
    public void play() {
        System.out.println("Playing acoustic guitar");
    }
}