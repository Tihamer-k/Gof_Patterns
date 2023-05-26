package tkode.patterns.behavioral.state;

public class ContextState {
    private State state;

    public ContextState() {
        state = new ConcreteStateA(); // Establecer el estado inicial
    }

    public void setContextState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction(this);
    }
}