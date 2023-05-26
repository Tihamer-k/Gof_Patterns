package tkode.patterns.behavioral.observer;

public class ConcreteObserversB implements Observers {
    @Override
    public void update(String message) {
        System.out.println("Observador B: " + message);
    }
}
