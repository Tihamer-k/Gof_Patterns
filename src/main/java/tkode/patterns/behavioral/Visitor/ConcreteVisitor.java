package tkode.patterns.behavioral.Visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("Visitando ConcreteElementA.");
        element.operationA();
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("Visitando ConcreteElementB.");
        element.operationB();
    }
}