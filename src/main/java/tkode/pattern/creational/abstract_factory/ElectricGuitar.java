package tkode.pattern.creational.abstract_factory;

public class ElectricGuitar implements Guitar {
    @Override
    public void play() {
        System.out.println("Playing electric guitar");
    }
}
