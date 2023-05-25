## Factory Method
En este ejemplo se utiliza este patrón para crear diferentes tipos de instrumentos musicales ([Guitar](Guitar.java) y [Piano](Piano.java))
a través de las clases [GuitarFactory](factory/GuitarFactory.java) y [PianoFactory](factory/PianoFactory.java). La interfaz [Instrument](Instrument.java)
representa el producto que se crea. Cada creador concreto (por ejemplo, `GuitarFactory`) implementa el método `createInstrument()` 
para crear un instrumento específico.
El método `playInstrument()` en [InstrumentFactory](factory/InstrumentFactory.java) es el Factory Method que llama al método `createInstrument()` para crear el 
instrumento y luego ejecuta el método `play()` en él.

En el ejemplo de uso en la clase [FactoryMethod](FactoryMethod.java), se crean instrumentos utilizando las fábricas correspondientes 
(`GuitarFactory` y `PianoFactory`). Luego, se llama al método `play()` en cada instrumento, que produce la salida
adecuada para cada tipo de instrumento.

Este ejemplo ilustra cómo el patrón **Factory Method** permite crear diferentes tipos de instrumentos musicales de manera 
flexible y extensible.
