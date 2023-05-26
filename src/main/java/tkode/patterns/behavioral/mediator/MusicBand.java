package tkode.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MusicBand implements InstrumentMediator {
    private final List<InstrumentPlayer> instrumentPlayers;

    public MusicBand() {
        instrumentPlayers = new ArrayList<>();
    }

    public void addInstrumentPlayer(InstrumentPlayer instrumentPlayer) {
        instrumentPlayers.add(instrumentPlayer);
    }

    @Override
    public void sendMessage(InstrumentPlayer instrumentPlayer, String message) {
        for (InstrumentPlayer colleague : instrumentPlayers) {
            if (colleague != instrumentPlayer) {
                colleague.receiveMessage(message);
            }
        }
    }

    public void playMusic() {
        for (InstrumentPlayer instrumentPlayer : instrumentPlayers) {
            System.out.print(instrumentPlayer.getName() + ": ");
            instrumentPlayer.play();
        }
    }
}

