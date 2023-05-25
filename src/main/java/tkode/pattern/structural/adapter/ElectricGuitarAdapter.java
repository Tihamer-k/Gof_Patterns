package tkode.pattern.structural.adapter;

public class ElectricGuitarAdapter implements Instrument {
    private final ElectricGuitar electricGuitar;

    public ElectricGuitarAdapter(ElectricGuitar electricGuitar) {
        this.electricGuitar = electricGuitar;
    }

    @Override
    public void play() {
        electricGuitar.playElectric();
    }
}
