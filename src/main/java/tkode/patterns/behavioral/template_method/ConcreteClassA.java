package tkode.patterns.behavioral.template_method;

public class ConcreteClassA extends AbstractClass {
    @Override
    void specificOperation() {
        System.out.println("Realizando una operación específica en ConcreteClassA.");
    }

    @Override
    void hook() {
        System.out.println("Implementando el hook en ConcreteClassA.");
    }
}