package tkode.pattern.creational.prototype;

public abstract class Instrument implements Cloneable {
    protected String name;
    protected String type;

    public abstract void play();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
