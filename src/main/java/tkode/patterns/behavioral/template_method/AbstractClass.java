package tkode.patterns.behavioral.template_method;

public abstract class AbstractClass {
    // Template Method
    public void templateMethod() {
        commonOperation();
        specificOperation();
        hook();
    }

    // Operación común a todas las subclases
    private void commonOperation() {
        System.out.println("Realizando una operación común a todas las subclases.");
    }

    // Operación específica que será implementada por las subclases
    abstract void specificOperation();

    // Hook (gancho) opcional que puede ser implementado por las subclases
    void hook() {
        // Se proporciona una implementación por defecto, pero puede ser sobrescrito por las subclases si es necesario.
    }
}