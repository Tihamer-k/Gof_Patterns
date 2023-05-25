## Proxy
El patrón Proxy se utiliza en este caso para proporcionar un sustituto o representante de un objeto Instrument real,
en este caso, una guitarra.

La interfaz [Instrument](Instrument.java) define el método `play()` que representa la acción de tocar el instrumento.

La clase [Guitar](Guitar.java) es la implementación concreta de `Instrument` y representa una guitarra real. 
En este ejemplo, se supone que la creación de una guitarra es costosa y queremos controlar cuándo se crea.

La clase [InstrumentProxy](InstrumentProxy.java) actúa como un proxy para la guitarra real (`Guitar`). Cuando se llama 
al método `play()` en el proxy, primero se verifica si ya se ha creado una instancia de guitarra. 
Si no se ha creado, se crea una nueva instancia de `Guitar`. Luego, el **proxy** realiza tareas adicionales antes y después 
de llamar al método `play()` en la guitarra real. En este caso, muestra mensajes de preparación y limpieza.

En el cliente ([Proxy](Proxy.java)), se crea una instancia del proxy `InstrumentProxy`. Luego, se llama al método `play()`
en el proxy para tocar la guitarra. El proxy maneja la creación y el uso de la guitarra real de manera transparente para el cliente.

Este ejemplo muestra cómo el patrón **Proxy** permite controlar el acceso a un objeto real y proporcionar funcionalidad
adicional antes o después de la llamada al objeto real. En el contexto de instrumentos musicales, esto puede ser 
útil para realizar tareas de preparación, limpieza o administración antes o después de tocar un instrumento real.