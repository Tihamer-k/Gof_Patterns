package tkode.patterns.behavioral.strategy;

public class StrategyMain {
    public static void example() {
        Context context = new Context();

    context.setStrategy(new ConcreteStrategyAdd());
    System.out.println(context.executeStrategy(5, 3));

    context.setStrategy(new ConcreteStrategySubtract());
    System.out.println(context.executeStrategy(5, 3));
    }

}
