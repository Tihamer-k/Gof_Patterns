package tkode.patterns.behavioral.Visitor;

public class VisitorMain {
    public static void example() {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();

        tkode.patterns.behavioral.Visitor.Visitor visitor = new ConcreteVisitor();

        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
