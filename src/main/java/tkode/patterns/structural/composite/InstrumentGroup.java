package tkode.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class InstrumentGroup implements InstrumentComponent {
    private final List<InstrumentComponent> instruments = new ArrayList<>();

    public void addInstrument(InstrumentComponent instrument) {
        instruments.add(instrument);
    }

    public void removeInstrument(InstrumentComponent instrument) {
        instruments.remove(instrument);
    }

    @Override
    public void play() {
        for (InstrumentComponent instrument : instruments) {
            instrument.play();
        }
    }
}
