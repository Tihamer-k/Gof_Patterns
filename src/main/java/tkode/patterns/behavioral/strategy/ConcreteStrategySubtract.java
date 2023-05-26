package tkode.patterns.behavioral.strategy;
public class ConcreteStrategySubtract implements Strategy {
    @Override
    public String executeStrategy(int num1, int num2) {
        int result = num1 - num2;
        return "Resta: " + result;
    }
}

