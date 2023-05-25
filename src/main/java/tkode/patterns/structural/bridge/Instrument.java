package tkode.patterns.structural.bridge;

import tkode.patterns.structural.bridge.impl.InstrumentImpl;

public abstract class Instrument {
    protected InstrumentImpl impl;

    protected Instrument(InstrumentImpl impl) {
        this.impl = impl;
    }

    public abstract void play();
}
