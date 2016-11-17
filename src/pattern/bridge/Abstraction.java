package pattern.bridge;

public abstract class Abstraction {
    Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public String toString() {
        return "Abstraction{" +
                "implementor=" + implementor +
                '}';
    }

    public abstract void operation();
}
