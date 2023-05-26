package tkode.patterns.behavioral.observer;

public class ObserverMain {
    public static void example() {
        Subject subject = new Subject();

        Observers observerA = new ConcreteObserversA();
        Observers observerB = new ConcreteObserversB();

        subject.addObservers(observerA);
        subject.addObservers(observerB);

        subject.setMessage("Nuevo mensaje!");

        subject.removeObservers(observerB);
        subject.setMessage("Mensaje actualizado!");
    }
}
