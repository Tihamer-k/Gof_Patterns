package tkode.pattern.structural.decorator;

public class Decorator {
    public static void example(){
        System.out.println("\nDecorator Pattern:\n");
        // Crear el componente básico
        Instrument basicInstrument = new BasicInstrument();

        // Decorar el instrumento básico con un ajuste de afinación
        Instrument tunedInstrument = new TunedInstrument(basicInstrument);

        // Decorar el instrumento básico con una amplificación
        Instrument amplifiedInstrument = new AmplifiedInstrument(basicInstrument);

        // Utilizar los instrumentos decorados
        basicInstrument.play();
        tunedInstrument.play();
        amplifiedInstrument.play();

    }
}
