## Prototype
Acá se utiliza este patrón para crear y personalizar objetos de instrumentos musicales. 
La clase abstracta [Instrument](Instrument.java) define el comportamiento común de un instrumento y proporciona el método `clone()` 
para clonar objetos.

Las clases concretas [Guitar](Guitar.java) y [Piano](Piano.java) extienden Instrument y proporcionan su propia implementación del método `play()`. 
Cada clase también tiene un constructor que establece los valores iniciales del nombre y el tipo del instrumento.

En el cliente([Prototype](Prototype.java)), se crean prototipos de guitarra y piano. Luego, se clonan los prototipos para crear instancias 
personalizadas de instrumentos. Se puede personalizar el objeto clonado modificando los atributos específicos, 
como el tipo de guitarra. Finalmente, se llama al método `play()` en cada instrumento personalizado para obtener 
la salida correspondiente.

Este ejemplo muestra cómo el patrón **Prototype** permite clonar y personalizar objetos sin acoplar el código cliente 
a las clases concretas.