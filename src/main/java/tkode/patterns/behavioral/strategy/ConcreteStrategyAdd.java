package tkode.patterns.behavioral.strategy;

class ConcreteStrategyAdd implements Strategy {
    @Override
    public void executeStrategy(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Suma: " + result);
    }
}