package tkode.patterns.behavioral.strategy;

public class StrategyMain {
    public static void example() {
        Context context = new Context();

        // Establecer la estrategia de suma
        context.setStrategy(new ConcreteStrategyAdd());
        context.executeStrategy(5, 3);

        // Cambiar la estrategia a resta
        context.setStrategy(new ConcreteStrategySubtract());
        context.executeStrategy(5, 3);
    }
}
