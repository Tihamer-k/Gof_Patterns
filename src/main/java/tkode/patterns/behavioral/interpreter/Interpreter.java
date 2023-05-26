package tkode.patterns.behavioral.interpreter;

import tkode.util.NumFormat;

public class Interpreter {
    public static void example() {
        System.out.println("\nInterpreter Pattern:\n");
        // Crear el contexto y establecer variables
        InstrumentContext context = new InstrumentContext();
        context.setVariable("price_guitar", 2_357_500.22);
        context.setVariable("price_amplifier", 582_300.50);

        // Crear las expresiones
        InstrumentExpression guitarPrice = new VariableExpression("price_guitar");
        InstrumentExpression amplifierPrice = new VariableExpression("price_amplifier");
        InstrumentExpression totalPrice = new AddExpression(guitarPrice, amplifierPrice);

        // Interpretar la expresión
        double result = totalPrice.interpret(context);
        System.out.println("Total Price: ".concat(NumFormat.priceFormat(result)));
    }
}
