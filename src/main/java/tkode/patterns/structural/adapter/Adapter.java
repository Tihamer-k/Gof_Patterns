package tkode.patterns.structural.adapter;

public class Adapter {
    public static void example() {
        System.out.println("\nAdapter Pattern:\n");
        // Crear una instancia de ElectricGuitar
        ElectricGuitar electricGuitar = new ElectricGuitar();

        // Crear un adaptador para ElectricGuitar
        Instrument guitarAdapter = new ElectricGuitarAdapter(electricGuitar);

        // Llamar al método play() en el adaptador
        guitarAdapter.play();
    }
}
