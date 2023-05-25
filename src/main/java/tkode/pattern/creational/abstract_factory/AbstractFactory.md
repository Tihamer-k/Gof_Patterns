## Abstract Factory
El patrón Abstract Factory se utiliza para crear familias de instrumentos relacionados. La interfaz [InstrumentFactory](factory/InstrumentFactory.java) 
define los métodos para crear diferentes tipos de guitarras y pianos. Las fábricas concretas ([AcousticInstrumentFactory](factory/AcousticInstrumentFactory.java) 
y [ElectricInstrumentFactory](factory/ElectricInstrumentFactory.java)) implementan la interfaz `InstrumentFactory` para crear instancias específicas de guitarras y
pianos.

Cada producto concreto ([AcousticGuitar](AcousticGuitar.java), [ElectricGuitar](ElectricGuitar.java), [GrandPiano](GrandPiano.java), [DigitalPiano](DigitalPiano.java))
implementa la interfaz correspondiente ([Guitar](Guitar.java) o [Piano](Piano.java)) y proporciona su propia implementación del método play().

En el ejemplo de uso en la clase Main, se crean dos fábricas diferentes (`AcousticInstrumentFactory` y
`ElectricInstrumentFactory`) y se utilizan para crear diferentes tipos de guitarras y pianos. Luego, se llama al método 
`play()` en cada instrumento, lo que produce la salida correspondiente.

Este ejemplo ilustra cómo el patrón **Abstract Factory** permite crear familias de objetos relacionados 
(en este caso, guitarras y pianos) de manera coherente y sin acoplamientos directos a las implementaciones concretas.