package tkode.pattern.structural.composite;

public class InstrumentLeaf implements InstrumentComponent {
    private String name;

    public InstrumentLeaf(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing " + name);
    }
}
