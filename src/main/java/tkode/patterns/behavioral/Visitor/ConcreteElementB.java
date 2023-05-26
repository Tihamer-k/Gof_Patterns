package tkode.patterns.behavioral.Visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("Realizando la operación B en ConcreteElementB.");
    }
}