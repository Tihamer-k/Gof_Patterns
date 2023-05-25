package tkode.pattern.structural.bridge.impl;

public class AcousticImpl implements InstrumentImpl {
    @Override
    public void play() {
        System.out.println("Playing acoustic instrument");
    }
}
