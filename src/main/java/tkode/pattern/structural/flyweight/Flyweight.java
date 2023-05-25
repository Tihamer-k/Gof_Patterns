package tkode.pattern.structural.flyweight;

public class Flyweight {
    public static void example() {
        System.out.println("\nFlyweight Pattern:\n");
        Instrument guitar1 = InstrumentFactory.getInstrument("Acoustic");
        Instrument guitar2 = InstrumentFactory.getInstrument("Electric");

        guitar1.play("C");
        guitar1.play("G");

        guitar2.play("A");
        guitar2.play("D");
    }
}
