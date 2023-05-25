## Singleton Pattern
En este ejemplo, [InstrumentManager](InstrumentManager.java) es la clase Singleton que gestiona una lista de instrumentos musicales.
Solo puede existir una única instancia de `InstrumentManager` en toda la aplicación, que se obtiene mediante 
el método `getInstance()`. Puedes agregar o eliminar instrumentos utilizando los métodos `addInstrument()` y 
`removeInstrument()`, y luego imprimir la lista de instrumentos con `printInstruments()`.



[Aquí](Singleton.java) hay un ejemplo de cómo puedes usar la clase `InstrumentManager`. 
Donde tanto `manager` como `anotherManager` son referencias a la misma instancia de `InstrumentManager`, por lo que
todas las operaciones se realizan en la misma lista de instrumentos.

Este ejemplo muestra cómo se puede utilizar el patrón **Singleton** para garantizar que solo haya una instancia del 
gestor de instrumentos en toda la aplicación.