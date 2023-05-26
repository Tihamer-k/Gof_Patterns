package tkode.patterns.behavioral.memento;

public class MementoMain {
    public static void example() {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setState("Estado inicial");

        caretaker.saveMemento(originator.saveStateToMemento());

        originator.setState("Nuevo estado");

        originator.restoreStateFromMemento(caretaker.retrieveMemento());

        System.out.println("Estado actual: " + originator.getState());
    }
}