package tkode.patterns.behavioral.command;

public class GuitarCommand implements InstrumentCommand {
    private final Guitar guitar;

    public GuitarCommand(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public void execute() {
        guitar.play();
    }
}
