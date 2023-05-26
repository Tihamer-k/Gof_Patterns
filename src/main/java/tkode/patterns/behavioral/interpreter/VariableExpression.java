package tkode.patterns.behavioral.interpreter;

public class VariableExpression implements InstrumentExpression {
    private String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public double interpret(InstrumentContext context) {
        return context.getVariable(variable);
    }
}
