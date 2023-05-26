package tkode.patterns.behavioral.iterator;

import java.util.List;

public class InstrumentListIterator implements InstrumentIterator {
    private final List<String> instruments;
    private int position;

    public InstrumentListIterator(List<String> instruments) {
        this.instruments = instruments;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < instruments.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            String instrument = instruments.get(position);
            position++;
            return instrument;
        }
        return null;
    }
}