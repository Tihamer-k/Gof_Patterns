package tkode.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class InstrumentFactory {
    private static Map<String, Instrument> instruments = new HashMap<>();

    public static Instrument getInstrument(String type) {
        Instrument instrument = instruments.get(type);

        if (instrument == null) {
            instrument = new Guitar(type);
            instruments.put(type, instrument);
        }

        return instrument;
    }
}
