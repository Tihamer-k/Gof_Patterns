package tkode.pattern;

import tkode.pattern.creational.abstract_factory.AbstractFactory;
import tkode.pattern.creational.builder.Builder;
import tkode.pattern.creational.factory_method.FactoryMethod;
import tkode.pattern.creational.prototype.Prototype;
import tkode.pattern.creational.singleton.Singleton;
import tkode.pattern.structural.adapter.Adapter;
import tkode.pattern.structural.bridge.Bridge;
import tkode.pattern.structural.composite.Composite;
import tkode.pattern.structural.decorator.Decorator;
import tkode.pattern.structural.facade.Facade;
import tkode.pattern.structural.flyweight.Flyweight;
import tkode.pattern.structural.proxy.Proxy;

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
        
        // Uso del patrón Adapter
        Adapter.example();

        // Uso del patrón Bridge
        Bridge.example();

        // Uso del patrón Composite
        Composite.example();

        // Uso del patrón Decorator
        Decorator.example();

        // Uso del patrón Facade
        Facade.example();

        // Uso del patrón Flyweight
        Flyweight.example();
        
        // Uso del patrón Proxy
        Proxy.example();
    }
}