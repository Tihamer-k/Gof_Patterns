package tkode.pattern;

import tkode.pattern.creational.factory_method.FactoryMethod;
import tkode.pattern.creational.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        // Uso del patrón Singleton
        Singleton.example();
        
        // Uso del patrón Factory method
        FactoryMethod.example();
    }
}