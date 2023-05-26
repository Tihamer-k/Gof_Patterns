package tkode.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observers> observers = new ArrayList<>();
    private String message;

    public void addObservers(Observers observers) {
        this.observers.add(observers);
    }

    public void removeObservers(Observers observers) {
        this.observers.remove(observers);
    }

    public void notifyObservers() {
        for (Observers observers : this.observers) {
            observers.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}