package tkode.patterns.structural.flyweight;

public class Guitar implements Instrument {
    private final String type;

    public Guitar(String type) {
        this.type = type;
    }

    @Override
    public void play(String note) {
        System.out.println("Playing " + type + " guitar: " + note);
    }
}

