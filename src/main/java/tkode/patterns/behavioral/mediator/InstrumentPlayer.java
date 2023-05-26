package tkode.patterns.behavioral.mediator;

public abstract class InstrumentPlayer {
    protected InstrumentMediator mediator;

    public InstrumentPlayer(InstrumentMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveMessage(String message);
    public abstract void play();
    public abstract String getName();
}
