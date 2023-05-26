## Memento
se utiliza para capturar y restaurar el estado interno de un objeto sin violar su encapsulación. La clase **Memento** representa un objeto que 
almacena el estado interno de la clase Originator. La clase [Originator](Originator.java) tiene métodos para establecer y 
obtener su estado, así como para guardar y restaurar su estado desde un objeto [Memento](Memento.java). 
La clase [Caretaker](Caretaker.java) se encarga de almacenar y proporcionar los objetos [Memento](Memento.java).

Al ejecutar el programa, se muestra cómo se guarda y restaura el estado del objeto [Originator](Originator.java). 
Se establece un estado inicial, se guarda ese estado en el [Caretaker](Caretaker.java), se modifica el estado del [Originator](Originator.java) 
y luego se restaura el estado guardado desde el [Caretaker](Caretaker.java). Finalmente, se imprime el estado actual del [Originator](Originator.java), 
que debería ser el estado inicial.

El patrón **Memento** permite que un objeto capture y almacene su estado interno en un objeto Memento, y luego pueda restaurar 
su estado en cualquier momento posterior utilizando ese Memento. Esto proporciona un mecanismo para deshacer o revertir cambios 
en un objeto sin exponer su implementación interna ni violar su encapsulación.