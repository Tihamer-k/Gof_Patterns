package tkode.patterns.structural.bridge;

import tkode.patterns.structural.bridge.impl.InstrumentImpl;

public class Piano extends Instrument {
    public Piano(InstrumentImpl impl) {
        super(impl);
    }

    @Override
    public void play() {
        System.out.print("Piano - ");
        impl.play();
    }
}
