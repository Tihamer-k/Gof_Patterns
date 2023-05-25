package tkode.pattern.structural.bridge;

import tkode.pattern.structural.bridge.impl.InstrumentImpl;

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
