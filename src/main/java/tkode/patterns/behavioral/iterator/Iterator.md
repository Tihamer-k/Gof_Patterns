## Iterator
En este ejemplo, el patrón se utiliza para recorrer una colección de instrumentos musicales.

La interfaz [InstrumentIterator](InstrumentIterator.java) define los métodos `hasNext()` y `next()` que se utilizan para iterar sobre 
los elementos de la colección.

La clase [InstrumentListIterator](InstrumentListIterator.java) es una implementación concreta de `InstrumentIterator` que recorre una lista 
de instrumentos. Mantiene un seguimiento de la posición actual en la lista y permite comprobar si hay elementos 
disponibles y obtener el siguiente elemento.

La interfaz [InstrumentCollection](InstrumentCollection.java) define el método `createIterator()` que devuelve un `InstrumentIterator` 
para la colección.

La clase [InstrumentList](InstrumentList.java) es una implementación concreta de `InstrumentCollection` que almacena una lista de 
instrumentos. Permite agregar y eliminar instrumentos y crea un iterador específico para la lista de instrumentos.

En el [cliente](Iterator.java), se crea una lista de instrumentos (`InstrumentList`) y se agregan algunos instrumentos. Luego, se crea
un iterador (`InstrumentIterator`) utilizando el método `createIterator()` de la lista de instrumentos. Se itera sobre 
los elementos de la lista utilizando el iterador y se imprime cada instrumento.

Este ejemplo muestra cómo el patrón **Iterator** proporciona una forma estandarizada de acceder a los elementos de una
colección sin exponer su estructura interna. Esto permite recorrer y manipular una colección de instrumentos musicales
de manera sencilla y flexible.