## Command
En este ejemplo, el patrón Command se utiliza para encapsular una solicitud como un objeto, permitiendo que los objetos
invocadores no estén acoplados directamente a los objetos receptores.

La interfaz [InstrumentCommand](InstrumentCommand.java) define el método `execute()`, que representa la ejecución de una acción en un instrumento.

La clase [GuitarCommand](GuitarCommand.java) es una implementación concreta de `InstrumentCommand` y tiene una referencia al objeto receptor
Guitar. Al llamar al método `execute()`, se invoca el método `play()` en el objeto receptor.

La clase [Guitar](Guitar.java) es el receptor que tiene la lógica para tocar la guitarra. En este caso, el método `play()` simplemente
imprime "_Playing the guitar_".

La clase [Musician](Musician.java) es el invocador que tiene una referencia al comando actual. Cuando se llama al método `playInstrument()`,
se ejecuta el comando actual invocando su método `execute()`.

En el [cliente](Command.java), se crea un músico (`Musician`) y un objeto receptor (`Guitar`). Luego, se crea un comando con el objeto 
receptor (`GuitarCommand`). El comando se establece en el músico utilizando el método `setCommand()`. Finalmente, se invoca 
el método `playInstrument()` en el músico para ejecutar el comando y tocar la guitarra.

Este ejemplo muestra cómo el patrón **Command** permite encapsular solicitudes como objetos independientes y flexibles.
En el contexto de instrumentos musicales, esto puede ser útil para separar la lógica de ejecución de las acciones de 
los objetos que las invocan, lo que facilita la extensibilidad y reutilización del código.