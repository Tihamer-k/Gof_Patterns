package tkode.patterns.behavioral.Visitor;

public interface Element {
    void accept(Visitor visitor);
}