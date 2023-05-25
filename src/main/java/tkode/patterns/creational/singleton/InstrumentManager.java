package tkode.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class InstrumentManager {
    private static InstrumentManager instance;
    private final List<String> instruments;

    private InstrumentManager() {
        instruments = new ArrayList<>();
    }

    public static InstrumentManager getInstance() {
        if (instance == null) {
            instance = new InstrumentManager();
        }
        return instance;
    }

    public void addInstrument(String instrument) {
        instruments.add(instrument);
    }

    public void removeInstrument(String instrument) {
        instruments.remove(instrument);
    }

    public void printInstruments() {
        System.out.println("Instruments in the manager:");
        for (String instrument : instruments) {
            System.out.println(instrument);
        }
    }
}
