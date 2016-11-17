package pattern.prototype;

public class ConcretePrototype implements Prototype {
    private int a;

    @Override
    public Object clonePrototype() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.a = this.a;
        return concretePrototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "a=" + a +
                '}';
    }
}
