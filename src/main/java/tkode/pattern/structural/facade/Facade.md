## Facade
El patrón se utiliza para proporcionar una interfaz simplificada y unificada para el manejo de 
un conjunto de subsistemas relacionados con instrumentos musicales.

El subsistema [Guitar](Guitar.java) representa una guitarra y proporciona métodos para encenderla, apagarla y tocarla.

El subsistema [Amplifier](Amplifier.java) representa un amplificador y ofrece métodos para encenderlo, apagarlo y ajustar el volumen.

El subsistema [Effects](Effects.java) representa efectos de sonido y tiene métodos para habilitar y deshabilitar los efectos.

La clase [InstrumentFacade](InstrumentFacade.java) actúa como la fachada que encapsula la complejidad de los subsistemas anteriores y proporciona
métodos simples para interactuar con ellos. En este caso, tiene métodos `playInstrument()` y `stopInstrument()` 
que internamente realizan las llamadas necesarias a los subsistemas para encender, apagar y tocar el instrumento de
manera conveniente.

En el cliente ([Facade](Facade.java)), se crea una instancia de `InstrumentFacade` y se utilizan sus métodos para encender, tocar y apagar el
instrumento. La fachada oculta la complejidad de los subsistemas y proporciona una interfaz más sencilla y coherente 
para el cliente.

Este ejemplo muestra cómo el patrón **Facade** puede simplificar la interacción con un conjunto de subsistemas complejos,
proporcionando una interfaz unificada y fácil de usar.