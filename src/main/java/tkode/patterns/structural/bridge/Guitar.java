package tkode.patterns.structural.bridge;

import tkode.patterns.structural.bridge.impl.InstrumentImpl;

public class Guitar extends Instrument {
    public Guitar(InstrumentImpl impl) {
        super(impl);
    }

    @Override
    public void play() {
        System.out.print("Guitar - ");
        impl.play();
    }
}
