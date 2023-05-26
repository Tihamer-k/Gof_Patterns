## Visitor
se utiliza para realizar operaciones sobre diferentes tipos de elementos ([ConcreteElementA](ConcreteElementA.java) y [ConcreteElementB](ConcreteElementB.java)) 
sin modificar la estructura de las clases de elementos. La interfaz [Visitor](Visitor.java) define las operaciones que pueden realizarse 
sobre cada tipo de elemento visitable. Cada elemento acepta el `Visitor` y llama al método de `visit()` correspondiente, 
permitiendo al `Visitor` realizar las operaciones apropiadas en cada elemento.