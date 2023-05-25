package tkode.patterns.creational.builder;

public class Builder {
    public static void example() {
        System.out.println("\nBuilder Pattern:\n");
        Instrument guitar = new InstrumentBuilder()
                .setName("Guitar")
                .setType("Acoustic")
                .setColor("Brown")
                .setPrice(1_200_000.0)
                .build();

        Instrument piano = new InstrumentBuilder()
                .setName("Piano")
                .setType("Grand")
                .setColor("Black")
                .setPrice(14_000_000.0)
                .build();

        System.out.println(guitar);
        System.out.println(piano);

        guitar.play();
        piano.play();
    }
}
