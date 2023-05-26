package tkode.patterns.behavioral.interpreter;

public class AddExpression implements InstrumentExpression {
    private InstrumentExpression leftExpression;
    private InstrumentExpression rightExpression;

    public AddExpression(InstrumentExpression leftExpression, InstrumentExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(InstrumentContext context) {
        double leftValue = leftExpression.interpret(context);
        double rightValue = rightExpression.interpret(context);
        return leftValue + rightValue;
    }
}
