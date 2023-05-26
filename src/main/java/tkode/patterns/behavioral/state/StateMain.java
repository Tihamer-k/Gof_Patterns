package tkode.patterns.behavioral.state;

public class StateMain {
    public static void example() {
        ContextState context = new ContextState();
        context.doAction();
        context.doAction();
        context.doAction();
    }
}
