package tkode.pattern.structural.proxy;

public class Proxy {
    public static void example(){
        System.out.println("\nProxy Pattern:\n");
        InstrumentProxy instrumentProxy = new InstrumentProxy();

        // Utilizar el proxy para tocar la guitarra
        instrumentProxy.play();
    }
}
