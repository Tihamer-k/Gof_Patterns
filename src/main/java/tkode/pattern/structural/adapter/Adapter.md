## Adapter
En este caso se utiliza el patrón para permitir que un objeto de la clase [ElectricGuitar](ElectricGuitar.java)
se comporte como un objeto de la interfaz [Instrument](Instrument.java). 
La interfaz Instrument define el método `play()`, que es común para todos los instrumentos.

La clase `ElectricGuitar` representa un instrumento específico que tiene un método `playElectric()` para reproducir
la guitarra eléctrica.

El adaptador [ElectricGuitarAdapter](ElectricGuitarAdapter.java) implementa la interfaz `Instrument` y tiene una referencia a un objeto `ElectricGuitar`.
En el método `play()` del adaptador, se llama al método `playElectric()` del objeto `ElectricGuitar`.

En el cliente([Adapter](Adapter.java)), se crea una instancia de `ElectricGuitar` y luego se crea un adaptador `ElectricGuitarAdapter` pasando la
instancia de `ElectricGuitar` como argumento. Finalmente, se llama al método `play()` en el adaptador, lo que invoca 
indirectamente el método `playElectric()` de `ElectricGuitar`.

Este ejemplo muestra cómo el patrón **Adapter** permite que objetos incompatibles trabajen juntos al proporcionar una 
interfaz común y un adaptador que traduce las llamadas de un objeto a las llamadas apropiadas del otro objeto. 
En este caso, el adaptador permite que un objeto `ElectricGuitar` se comporte como un objeto `Instrument`.