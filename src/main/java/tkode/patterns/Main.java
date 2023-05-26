package tkode.patterns;

import tkode.patterns.behavioral.chain_of_responsibility.ChainOfResponsibility;
import tkode.patterns.behavioral.command.Command;
import tkode.patterns.behavioral.interpreter.Interpreter;
import tkode.patterns.behavioral.iterator.Iterator;
import tkode.patterns.creational.abstract_factory.AbstractFactory;
import tkode.patterns.creational.builder.Builder;
import tkode.patterns.creational.factory_method.FactoryMethod;
import tkode.patterns.creational.prototype.Prototype;
import tkode.patterns.creational.singleton.Singleton;
import tkode.patterns.structural.adapter.Adapter;
import tkode.patterns.structural.bridge.Bridge;
import tkode.patterns.structural.composite.Composite;
import tkode.patterns.structural.decorator.Decorator;
import tkode.patterns.structural.facade.Facade;
import tkode.patterns.structural.flyweight.Flyweight;
import tkode.patterns.structural.proxy.Proxy;

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
        
        // Uso del patrón Chain of Responsibility
        ChainOfResponsibility.example();

        // Uso del patrón Command
        Command.example();

        // Uso del patrón Interpreter
        Interpreter.example();

        // Uso del patrón Iterator
        Iterator.example();
    }
}