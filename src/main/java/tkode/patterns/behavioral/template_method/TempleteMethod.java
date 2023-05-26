package tkode.patterns.behavioral.template_method;

public class TempleteMethod {
    public static void example() {
        AbstractClass classA = new ConcreteClassA();
        AbstractClass classB = new ConcreteClassB();

        classA.templateMethod();
        System.out.println("------------------------");
        classB.templateMethod();
    }
}
