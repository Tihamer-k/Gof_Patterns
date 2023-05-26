package tkode.patterns.behavioral.strategy;
class ConcreteStrategySubtract implements Strategy {
    @Override
    public void executeStrategy(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Resta: " + result);
    }
}
