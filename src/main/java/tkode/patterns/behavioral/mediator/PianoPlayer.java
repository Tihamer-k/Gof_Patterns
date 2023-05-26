package tkode.patterns.behavioral.mediator;

public class PianoPlayer extends InstrumentPlayer {
    public PianoPlayer(InstrumentMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("PianoPlayer received message: " + message);
    }

    @Override
    public void play() {
        System.out.println("Playing the piano");
    }

    @Override
    public String getName() {
        return "PianoPlayer";
    }
    
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }
}