package tkode.pattern.creational.singleton;

public class Singleton {
    public static void example() {
        System.out.println("\nSingleton Pattern:\n");
        InstrumentManager manager = InstrumentManager.getInstance();
        manager.addInstrument("Guitar");
        manager.addInstrument("Piano");

        InstrumentManager anotherManager = InstrumentManager.getInstance();
        anotherManager.addInstrument("Violin");

        manager.printInstruments();
    }
}
