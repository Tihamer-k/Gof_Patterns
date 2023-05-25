## Composite
En este ejemplo, el patrón Composite se utiliza para representar una estructura jerárquica de instrumentos musicales. 
La interfaz [InstrumentComponent](InstrumentComponent.java) define las operaciones comunes a las hojas y compuestos,
en este caso, el método `play()`.

La clase [InstrumentLeaf](InstrumentLeaf.java) es una hoja que representa un instrumento musical individual. En este
ejemplo, se crean hojas para la guitarra y el piano.

La clase [InstrumentGroup](InstrumentGroup.java) es un compuesto que puede contener tanto hojas como otros compuestos. En este ejemplo, 
se crea un grupo de instrumentos que contiene la guitarra y el piano. El método `addInstrument()` agrega un instrumento
al grupo y el método `removeInstrument()` lo elimina. El método `play()` en `InstrumentGroup` itera sobre todos los 
instrumentos del grupo y llama al método `play()` en cada uno.

En el cliente([Composite](Composite.java)), se crean instancias de hojas (`InstrumentLeaf`) para la guitarra y el piano. Luego, se crea un 
compuesto (`InstrumentGroup`) llamado `instrumentGroup` y se agregan las hojas al grupo. Finalmente, se llama al
método `play()` en el `instrumentGroup` para que todos los instrumentos dentro del grupo toquen.

Este ejemplo muestra cómo el patrón **Composite** permite tratar tanto objetos individuales como estructuras compuestas
de manera uniforme, lo que facilita el tratamiento de objetos complejos en una estructura jerárquica.