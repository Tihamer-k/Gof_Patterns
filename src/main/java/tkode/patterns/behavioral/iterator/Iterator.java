package tkode.patterns.behavioral.iterator;

public class Iterator {
    public static void example() {
        System.out.println("\nIterator Pattern:\n");
        InstrumentList instrumentList = new InstrumentList();
        instrumentList.addInstrument("Guitar");
        instrumentList.addInstrument("Piano");
        instrumentList.addInstrument("Drums");
        instrumentList.addInstrument("Violin");

        InstrumentIterator iterator = instrumentList.createIterator();

        while (iterator.hasNext()) {
            String instrument = iterator.next();
            System.out.println("Instrument: " + instrument);
        }
    }
}
