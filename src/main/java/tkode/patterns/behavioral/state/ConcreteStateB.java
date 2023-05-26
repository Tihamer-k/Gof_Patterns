package tkode.patterns.behavioral.state;

class ConcreteStateB implements State {
    @Override
    public void doAction(ContextState context) {
        System.out.println("Realizando la acción en ConcreteStateB.");
        context.setContextState(new ConcreteStateA());
    }
}
