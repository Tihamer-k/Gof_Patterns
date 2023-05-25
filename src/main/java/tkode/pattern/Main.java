package tkode.pattern;

import tkode.pattern.creational.abstract_factory.AbstractFactory;
import tkode.pattern.creational.builder.Builder;
import tkode.pattern.creational.factory_method.FactoryMethod;
import tkode.pattern.creational.prototype.Prototype;
import tkode.pattern.creational.singleton.Singleton;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Uso del patrón Singleton
        Singleton.example();
        
        // Uso del patrón Factory method
        FactoryMethod.example();
        
        // Uso del patrón Abstract Factory
        AbstractFactory.example();

        // Uso del patrón Abstract Factory
        Builder.example();

        // Uso del patrón Prototype
        Prototype.example();
    }
}