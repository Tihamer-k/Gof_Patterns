## Decorator
En este caso, el patrón se utiliza para agregar funcionalidad adicional a un objeto `Instrument` sin
modificar su estructura original.

La interfaz [Instrument](Instrument.java) define el método `play()` que representa la funcionalidad básica de un instrumento.

La clase [BasicInstrument](BasicInstrument.java) es una implementación concreta de la interfaz `Instrument` que representa 
el instrumento básico sin ninguna funcionalidad adicional.

La clase [InstrumentDecorator](InstrumentDecorator.java) es el decorador abstracto que implementa la interfaz `Instrument` 
y tiene una referencia a otro objeto `Instrument`. Este decorador delega la llamada al objeto `Instrument` subyacente y 
agrega su propia funcionalidad adicional.

Las clases [TunedInstrument](TunedInstrument.java) y [AmplifiedInstrument](AmplifiedInstrument.java) son decoradores 
concretos que heredan de `InstrumentDecorator` y agregan funcionalidad de ajuste de afinación y amplificación, respectivamente.

En el cliente ([Decorator](Decorator.java)), se crea una instancia del objeto `BasicInstrument`. Luego, se decora este 
objeto con los decoradores `TunedInstrument` y `AmplifiedInstrument`. Finalmente, se llama al método `play()` en cada 
instrumento decorado para que realicen su funcionalidad básica junto con la funcionalidad adicional del decorador correspondiente.

Este ejemplo muestra cómo el patrón Decorator permite agregar responsabilidades adicionales a un objeto de manera dinámica
y flexible, sin afectar su estructura original.