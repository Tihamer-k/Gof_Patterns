package tkode.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class InstrumentList implements InstrumentCollection {
    private List<String> instruments;

    public InstrumentList() {
        instruments = new ArrayList<>();
    }

    public void addInstrument(String instrument) {
        instruments.add(instrument);
    }

    public void removeInstrument(String instrument) {
        instruments.remove(instrument);
    }

    @Override
    public InstrumentIterator createIterator() {
        return new InstrumentListIterator(instruments);
    }
}
