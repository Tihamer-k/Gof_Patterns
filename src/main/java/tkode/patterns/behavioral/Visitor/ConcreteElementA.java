package tkode.patterns.behavioral.Visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void operationA() {
        System.out.println("Realizando la operación A en ConcreteElementA.");
    }
}