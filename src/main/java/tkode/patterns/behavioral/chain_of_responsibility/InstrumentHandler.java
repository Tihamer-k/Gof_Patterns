package tkode.patterns.behavioral.chain_of_responsibility;

public abstract class InstrumentHandler {
    protected InstrumentHandler successor;

    public void setSuccessor(InstrumentHandler successor) {
        this.successor = successor;
    }

    public abstract void play(String instrument);
}
