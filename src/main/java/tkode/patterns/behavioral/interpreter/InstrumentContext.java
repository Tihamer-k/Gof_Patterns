package tkode.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class InstrumentContext {
    private Map<String, Double> variables;

    public InstrumentContext() {
        variables = new HashMap<>();
    }

    public void setVariable(String variable, double value) {
        variables.put(variable, value);
    }

    public double getVariable(String variable) {
        return variables.getOrDefault(variable, 0.0);
    }
}
