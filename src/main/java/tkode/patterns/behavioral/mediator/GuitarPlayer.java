package tkode.patterns.behavioral.mediator;

public class GuitarPlayer extends InstrumentPlayer {
    public GuitarPlayer(InstrumentMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("GuitarPlayer received message: " + message);
    }

    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }

    @Override
    public String getName() {
        return "GuitarPlayer";
    }
    
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }
}
