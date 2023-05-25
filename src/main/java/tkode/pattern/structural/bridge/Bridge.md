## Bridge
En este ejemplo, el patrón utiliza para separar la abstracción de los instrumentos musicales ([Instrument](Instrument.java)) 
de su implementación ([InstrumentImpl](impl/InstrumentImpl.java)), permitiendo que ambas puedan variar independientemente.

La interfaz `InstrumentImpl` define el comportamiento de los implementadores concretos, en este caso, [AcousticImpl](impl/AcousticImpl.java)
y [ElectricImpl](impl/ElectricImpl.java), que representan diferentes tipos de instrumentos musicales.

La clase `Instrument` es la abstracción que tiene una referencia a un objeto de tipo `InstrumentImpl`. Esta abstracción
proporciona un método `play()` que utiliza el objeto `InstrumentImpl` para realizar la acción específica del instrumento.

Las clases [Guitar](Guitar.java) y [Piano](Piano.java) son refinamientos de la abstracción `Instrument` y se encargan de
imprimir el tipo de instrumento antes de llamar al método `play()` del implementador.

En el cliente([Bridge](Bridge.java)), se crean instancias de implementadores (`AcousticImpl` y `ElectricImpl`) y se les
asignan a las abstracciones (`Guitar` y `Piano`) correspondientes. Luego, se llama al método `play()` en cada objeto de 
abstracción para que realicen la acción específica del instrumento.

Este ejemplo muestra cómo el patrón **Bridge** permite desacoplar la abstracción de su implementación, lo que facilita la 
extensibilidad y la capacidad de variarlas por separado.