## Builder
El patrón se utiliza para construir objetos de la clase [Instrument](Instrument.java) de manera flexible. 
La clase `Instrument` representa un instrumento musical con varios atributos como nombre, tipo, color y precio. 
El constructor de `Instrument` es privado y los atributos se establecen utilizando el patrón Builder en la clase 
[InstrumentBuilder](InstrumentBuilder.java).

En el ejemplo de uso en la clase [Builder](Builder.java), se crean objetos `Instrument` utilizando el `InstrumentBuilder`. Se establecen los 
atributos deseados llamando a los métodos correspondientes en el `InstrumentBuilder` y luego se llama al método `build()` 
para obtener la instancia de Instrument construida.

Después de construir los objetos `Instrument`, se imprimen sus detalles utilizando `System.out.println()` y se llama al 
método `play()` en cada instrumento.

Este ejemplo muestra cómo el patrón **Builder** permite construir objetos complejos paso a paso, proporcionando una interfaz
clara y flexible para configurar los atributos del objeto.
