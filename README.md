# GoF Patterns at Java
| Nombre del Patrón                                                                                  | Tipo       | Descripción                                                                                                                                                                                       | Aplicaciones Principales                                                                    |
|----------------------------------------------------------------------------------------------------|------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| **[Singleton](src/main/java/tkode/pattern/creational/singleton/Singleton.md)**                     | Creational | Asegura que una clase solo tenga una instancia y proporciona un punto de acceso global a ella.                                                                                                    | Gestión de conexiones a bases de datos, registros de eventos, caché.                        |
| **[Factory Method](src/main/java/tkode/pattern/creational/factory_method/FactoryMethod.md)**       | Creational | Define una interfaz para crear un objeto, pero permite que las subclases decidan qué clase instanciar.                                                                                            | Creación de objetos en tiempo de ejecución según el contexto.                               |
| **[Abstract Factory](src/main/java/tkode/pattern/creational/abstract_factory/AbstractFactory.md)** | Creational | Proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.                                                                         | Creación de familias de objetos relacionados, como GUIs multiplataforma.                    |
| **[Builder](src/main/java/tkode/pattern/creational/builder/Builder.md)**                           | Creational | Se utiliza para construir objetos complejos paso a paso. Permite la creación de diferentes representaciones de un objeto.                                                                         | Construcción de objetos complejos con diferentes configuraciones.                           |
| **[Prototype](src/main/java/tkode/pattern/creational/prototype/Prototype.md)**                     | Creational | Permite la creación de nuevos objetos mediante la clonación de un objeto existente en lugar de crearlo desde cero.                                                                                | Creación de objetos cuando la creación tradicional es costosa o complicada.                 |
| **[Adapter](src/main/java/tkode/pattern/structural/adapter/Adapter.md)**                           | Structural | Convierte la interfaz de una clase en otra interfaz que los clientes esperan. Permite que clases trabajen juntas, aunque sus interfaces sean incompatibles.                                       | Integración de componentes con interfaces diferentes.                                       |
| **Bridge**                                                                                         | Structural | Desacopla una abstracción de su implementación, lo que permite que ambas varíen independientemente.                                                                                               | Separación de la interfaz de una abstracción de su implementación.                          |
| **Composite**                                                                                      | Structural | Compone objetos en estructuras de árbol para representar jerarquías de partes-todo. Permite que los clientes traten los objetos individuales y los compuestos de manera uniforme.                 | Representación de estructuras de árbol, como interfaces gráficas o estructuras de archivos. |
| **Decorator**                                                                                      | Structural | Añade responsabilidades adicionales a un objeto de manera dinámica. Proporciona una alternativa flexible a la herencia para extender la funcionalidad.                                            | Extensión de funcionalidades de objetos de manera flexible.                                 |
| **Facade**                                                                                         | Structural | Proporciona una interfaz unificada para un conjunto de interfaces en un subsistema. Simplifica y oculta la complejidad del subsistema.                                                            | Proporcionar una interfaz sencilla para un subsistema complejo.                             |
| **Flyweight**                                                                                      | Structural | Permite compartir eficientemente objetos a nivel granular para reducir la sobrecarga de memoria.                                                                                                  | Reducción de uso de memoria al compartir objetos en grandes cantidades.                     |
| **Proxy**                                                                                          | Structural | Proporciona un representante o sustituto de otro objeto para controlar el acceso a él.                                                                                                            | Control de acceso a un objeto, protección de objetos sensibles.                             |
| **Chain of Responsibility**                                                                        | Behavioral | Evita acoplar el remitente de una solicitud a su receptor al dar a más de un objeto la oportunidad de manejar la solicitud.                                                                       | Manejo de solicitudes en cascada hasta que una sea procesada.                               |
| **Command**                                                                                        | Behavioral | Encapsula una solicitud como un objeto, lo que permite parametrizar a los clientes con solicitudes diferentes, encolar o registrar solicitudes y soportar operaciones reversibles.                | Gestión de operaciones, historial o registro de acciones.                                   |
| **Interpreter**                                                                                    | Behavioral | Define una representación gramatical de un lenguaje y proporciona un intérprete para evaluar sentencias en dicho lenguaje.                                                                        | Implementación de lenguajes de programación o sistemas de consulta.                         |
| **Iterator**                                                                                       | Behavioral | Proporciona una forma de acceder secuencialmente a los elementos de un objeto agregado sin exponer su representación interna.                                                                     | Recorrido y acceso a los elementos de una estructura de datos.                              |
| **Mediator**                                                                                       | Behavioral | Define un objeto que encapsula cómo un conjunto de objetos interactúan. Promueve el acoplamiento suelto al evitar que los objetos se refieran explícitamente entre sí.                            | Coordinación de interacciones complejas entre objetos.                                      |
| **Memento**                                                                                        | Behavioral | Permite capturar y restaurar el estado interno de un objeto sin violar su encapsulación.                                                                                                          | Implementación de mecanismos de "deshacer" o de checkpoints en una aplicación.              |
| **Observer**                                                                                       | Behavioral | Define una dependencia uno-a-muchos entre objetos, de manera que cuando uno de los objetos cambia de estado, todos los objetos dependientes son notificados y actualizados automáticamente.       | Implementación de sistemas de notificación y actualización automáticos.                     |
| **State**                                                                                          | Behavioral | Permite que un objeto cambie su comportamiento cuando su estado interno cambia. Parece que cambia su clase.                                                                                       | Implementación de máquinas de estado, donde los estados son objetos.                        |
| **Strategy**                                                                                       | Behavioral | Define una familia de algoritmos, encapsula cada uno y los hace intercambiables. Permite que el algoritmo varíe independientemente de los clientes que lo utilizan.                               | Selección de un algoritmo específico en tiempo de ejecución.                                |
| **Template Method**                                                                                | Behavioral | Define el esqueleto de un algoritmo en una operación, delegando algunos pasos a las subclases. Permite que las subclases redefinan ciertos pasos del algoritmo sin cambiar su estructura general. | Definición de algoritmos con pasos comunes pero con variaciones en pasos específicos.       |
| **Visitor**                                                                                        | Behavioral | Permite definir nuevas operaciones sobre una estructura de objetos sin cambiar las clases de los objetos sobre los que opera.                                                                     | Realización de operaciones sobre una estructura de objetos sin modificar sus clases.        |

