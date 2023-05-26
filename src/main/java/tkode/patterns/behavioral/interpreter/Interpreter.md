##  Interpreter
En este caso, se utiliza el patrón para interpretar expresiones relacionadas con el cálculo del precio total de 
instrumentos musicales.

La clase [InstrumentContext](InstrumentContext.java) representa el contexto de interpretación y almacena las variables
y sus valores. En este caso, las variables son los precios de los instrumentos (guitarra = $2,357,500.22 y amplificador = $582,300.50).

La interfaz [InstrumentExpression](InstrumentExpression.java) define el método `interpret()` que toma un contexto 
y devuelve el resultado de interpretar la expresión.

La clase [VariableExpression](VariableExpression.java) es una implementación de `InstrumentExpression` que interpreta 
una variable, buscando su valor en el contexto.

La clase [AddExpression](AddExpression.java) es una implementación de `InstrumentExpression` que interpreta una
expresión de suma entre dos expresiones. Toma las expresiones izquierda y derecha, interpreta cada una de ellas 
y realiza la suma.

En el [cliente](Interpreter.java), se crea el contexto y se establecen las variables de precio de los instrumentos.
Luego, se crean las expresiones para el precio de la guitarra y el amplificador, y una expresión de suma para obtener
el precio total. Finalmente, se interpreta la expresión total utilizando el contexto y se imprime el resultado.

Este ejemplo muestra cómo el patrón **Interpreter** puede utilizarse para interpretar expresiones relacionadas con
precios de instrumentos musicales. Aunque es un ejemplo simplificado, puedes expandirlo para incluir más operaciones
y expresiones según tus necesidades.