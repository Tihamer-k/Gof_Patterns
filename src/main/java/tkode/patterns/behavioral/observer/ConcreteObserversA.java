package tkode.patterns.behavioral.observer;

public class ConcreteObserversA implements Observers {
    @Override
    public void update(String message) {
        System.out.println("Observador A: " + message);
    }
}
