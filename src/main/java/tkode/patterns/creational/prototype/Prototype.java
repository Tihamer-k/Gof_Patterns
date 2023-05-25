package tkode.patterns.creational.prototype;

public class Prototype {
    public static void example() throws CloneNotSupportedException {
        System.out.println("\nPrototype Pattern:\n");
        // Crear prototipos
        Instrument guitarPrototype = new Guitar();
        Instrument pianoPrototype = new Piano();

        // Clonar y personalizar los instrumentos
        Instrument customGuitar = (Instrument) guitarPrototype.clone();
        customGuitar.play();

        Instrument customPiano = (Instrument) pianoPrototype.clone();
        customPiano.play();

        // Personalizar y clonar nuevamente
        customGuitar.type = "Electric";
        customGuitar.play();
    }
}
