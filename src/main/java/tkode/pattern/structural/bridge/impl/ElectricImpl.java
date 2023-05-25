package tkode.pattern.structural.bridge.impl;

public class ElectricImpl implements InstrumentImpl {
    @Override
    public void play() {
        System.out.println("Playing electric instrument");
    }
}
