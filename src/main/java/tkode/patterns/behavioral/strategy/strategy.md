## Strategy 

se utiliza para encapsular diferentes algoritmos o estrategias y permitir que se intercambien dinámicamente en tiempo 
de ejecución. La interfaz [Strategy](Strategy.java) define el método `executeStrategy()` que se implementa en las clases concretas de 
estrategia. En este caso, las clases [ConcreteStrategyAdd](Strategy.java) y [ConcreteStrategySubtract](Strategy.java) implementan la interfaz [Strategy](Strategy.java) 
y proporcionan sus propias implementaciones para realizar la suma y la resta respectivamente.

La clase [Context](Context.java) mantiene una referencia a la estrategia actual y utiliza el método `executeStrategy()` para ejecutar 
el algoritmo correspondiente. Al establecer una nueva estrategia utilizando el método `setStrategy()`, el comportamiento 
del contexto cambia en consecuencia.

Al ejecutar el programa, se muestra cómo el contexto utiliza diferentes estrategias para realizar operaciones 
matemáticas. En este caso, primero se realiza una suma y luego se cambia la estrategia a resta.

El patrón ***Strategy*** permite que los algoritmos o estrategias sean intercambiables, modularizando así el código y 
permitiendo una mayor flexibilidad y extensibilidad en el diseño. También evita el uso de condicionales y permite 
agregar nuevas estrategias fácilmente sin modificar el código existente.