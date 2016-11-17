package pattern.bridge;

public class Client {

    public static void main(String[] args) {
        Abstraction abstraction1 = new RefinedAbstractionA(new ConcreteImplementorA());
        abstraction1.operation();
        System.out.println("----------------------------");
        Abstraction abstraction2 = new RefinedAbstractionA(new ConcreteImplementorB());
        abstraction2.operation();
        System.out.println("----------------------------");
        Abstraction abstraction3 = new RefinedAbstractionB(new ConcreteImplementorA());
        abstraction3.operation();
        System.out.println("----------------------------");
        Abstraction abstraction4 = new RefinedAbstractionB(new ConcreteImplementorB());
        abstraction4.operation();
    }
}
