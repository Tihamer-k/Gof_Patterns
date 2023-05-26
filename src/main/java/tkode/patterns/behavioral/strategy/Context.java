package tkode.patterns.behavioral.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(int num1, int num2) {
        return strategy.executeStrategy(num1, num2);
    }
}
