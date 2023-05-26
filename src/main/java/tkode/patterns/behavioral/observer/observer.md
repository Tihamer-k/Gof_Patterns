## Observer
se utiliza para establecer una relación de uno a muchos entre un objeto de tema o sujeto observado `(Subject)`
y múltiples objetos observadores `(Observers)`. La interfaz [Observers](Observers.java) define el método `update()` que se implementa 
en las clases concretas de observadores. La clase [Subject](Subject.java) mantiene una lista de observadores y notifica a todos 
los observadores cuando cambia el mensaje.

Al ejecutar el programa, se muestra cómo los observadores reciben las actualizaciones del tema observado. 
En este caso, se agrega un mensaje al tema observado `(subject.setMessage("Nuevo mensaje!"))`, y tanto el Observador 
A como el [Observador B](ConcreteObserversA.java)  reciben y muestran el mensaje actualizado. Luego, se elimina el [Observador B](ConcreteObserversA.java)
`(subject.removeObserver(observerB))` y se actualiza el mensaje nuevamente, solo el [Observador A](ConcreteObserversA.java)  recibe 
la notificación.

El patrón **Observer** permite que los objetos observadores sean notificados y actualizados automáticamente cuando 
cambia el estado del objeto observado, sin acoplamiento directo entre ellos. Esto facilita la implementación 
de la comunicación y la sincronización entre objetos en una aplicación, permitiendo una mayor flexibilidad y 
extensibilidad en el diseño.