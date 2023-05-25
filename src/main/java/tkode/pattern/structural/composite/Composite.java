package tkode.pattern.structural.composite;

public class Composite {
    public static void example() {
        // Crear hojas
        InstrumentComponent guitar = new InstrumentLeaf("Guitar");
        InstrumentComponent piano = new InstrumentLeaf("Piano");

        // Crear un grupo de instrumentos
        InstrumentGroup instrumentGroup = new InstrumentGroup();
        instrumentGroup.addInstrument(guitar);
        instrumentGroup.addInstrument(piano);

        // Utilizar el grupo de instrumentos
        instrumentGroup.play();
    }
}
