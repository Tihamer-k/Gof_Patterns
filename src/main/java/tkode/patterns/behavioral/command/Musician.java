package tkode.patterns.behavioral.command;

public class Musician {
    private InstrumentCommand command;

    public void setCommand(InstrumentCommand command) {
        this.command = command;
    }

    public void playInstrument() {
        command.execute();
    }
}
