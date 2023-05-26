package tkode.patterns.behavioral.state;

class ConcreteStateA implements State {
    @Override
    public void doAction(ContextState context) {
        System.out.println("Realizando la acción en ConcreteStateA.");
        context.setContextState(new ConcreteStateB());
    }
}