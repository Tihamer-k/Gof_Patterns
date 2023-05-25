## Flyweight
En este ejemplo, el patrón Flyweight se utiliza para compartir eficientemente instancias de objetos similares de la 
clase Guitar. Cada tipo de guitarra se representa como un flyweight.

La interfaz [Instrument](Instrument.java) define el método `play()` que toca una nota musical.

La clase [Guitar](Guitar.java) es una implementación concreta de `Instrument` y representa una guitarra con un tipo específico. 
Cada objeto `Guitar` tiene una propiedad `type` que se establece en el momento de la creación.

La clase [InstrumentFactory](InstrumentFactory.java) actúa como una fábrica de flyweights. Mantiene un mapa de
instrumentos existentes y, cuando se solicita un tipo de guitarra específico, verifica si ya existe un **flyweight** 
para ese tipo. Si existe, lo devuelve; de lo contrario, crea uno nuevo y lo agrega al mapa.

En el cliente ([flyweight](Flyweight.java)), se utiliza la fábrica `InstrumentFactory` para obtener instancias de guitarras. 
Cada guitarra se toca utilizando el método `play()`. Dado que los objetos de tipo `Guitar` son compartidos y reutilizados a 
través del patrón **Flyweight**, se evita la creación innecesaria de múltiples instancias para el mismo tipo de guitarra.

Este ejemplo muestra cómo el patrón **Flyweight** permite ahorrar memoria al compartir eficientemente objetos similares 
que pueden ser compartidos. En el caso de instrumentos musicales, esto puede ser útil cuando se tienen muchos tipos 
de instrumentos similares y se desea evitar la creación excesiva de objetos.