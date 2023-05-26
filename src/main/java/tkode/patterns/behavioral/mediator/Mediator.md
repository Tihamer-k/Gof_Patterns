## Mediator
En este ejemplo, el patrón Mediator se utiliza para permitir la comunicación entre diferentes miembros
de una banda de música.

La interfaz [InstrumentMediator](InstrumentMediator.java) define el método `sendMessage()`, que permite a los miembros de la banda
enviar mensajes al mediador.

La clase [InstrumentPlayer](InstrumentPlayer.java) es la clase base abstracta que representa un el miembro de la banda. 
Tiene una referencia al mediador y proporciona métodos abstractos `receiveMessage()` y `play()`.

Las clases concretas [GuitarPlayer](GuitarPlayer.java) y [PianoPlayer](PianoPlayer.java) son implementaciones específicas
de los instrumentos especificos que tocan los miembros. Cada uno implementa los métodos abstractos de la clase base y tiene su propio nombre.


La clase [MusicBand](MusicBand.java) es el mediador concreto. Mantiene una lista de miembros y proporciona la implementación 
del método `sendMessage()`. Al recibir un mensaje, el mediador lo retransmite a todos los miembros excepto al que lo envió.
También tiene un método `playMusic()`que invoca el método `play()` en cada músico.

En el [cliente](Mediator.java), se crea una banda de música (`MusicBand`) y se crean miembros (`GuitarPlayer` y `PianoPlayer`).
Los miembros se agregan a la banda y se envían mensajes entre ellos utilizando el método `sendMessage()`. Luego, se invoca
el método `playMusic()` de la banda para que todos los instrumentos toquen su música.

Este ejemplo muestra cómo el patrón **Mediator** permite la comunicación indirecta entre los músicos, 
evitando las dependencias directas entre ellos. El mediador actúa como un punto centralizado para la comunicación,
lo que facilita la gestión y la interacción entre los miembros de la banda de música.





