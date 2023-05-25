## Chain of Responsibility
En este ejemplo, el patrón se utiliza para procesar solicitudes relacionadas con diferentes instrumentos musicales.

La clase [InstrumentHandler](InstrumentHandler.java) es el handler abstracto que define el método `play()` para procesar
una solicitud de reproducción de un instrumento. También contiene una referencia al siguiente handler en la cadena (`successor`).

Las clases [GuitarHandler](GuitarHandler.java), [DrumsHandler](DrumsHandler.java) y [PianoHandler](PianoHandler.java) 
son handlers concretos que heredan de `InstrumentHandler` y procesan las solicitudes relacionadas con la guitarra, 
la batería y el piano, respectivamente.

En el [cliente](ChainOfResponsibility.java), se crea la cadena de responsabilidad estableciendo el sucesor de cada 
handler en la cadena. Luego, se envían diferentes solicitudes de reproducción de instrumentos a través del método 
`play()` en el primer handler de la cadena (`guitarHandler`).

Cada handler verifica si puede manejar la solicitud. Si puede, realiza la acción correspondiente (tocar el instrumento).
Si no puede manejar la solicitud, la pasa al siguiente handler en la cadena utilizando la referencia `successor`. De esta
manera, se crea una cadena de handlers que intentan manejar la solicitud en orden.

Este ejemplo muestra cómo el patrón **Chain of Responsibility** permite construir una cadena de objetos handlers y
proporciona una manera flexible de manejar solicitudes en función de la capacidad de cada handler para procesarlas. 
En el contexto de instrumentos musicales, cada handler puede manejar una solicitud relacionada con un instrumento 
específico y pasar la solicitud al siguiente handler si no puede manejarla.