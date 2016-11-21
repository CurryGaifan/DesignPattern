package pattern.action.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.run();
        originator.run();
        Memento memento = originator.createMemento();
        originator.run();
        originator.run();
        originator.setState(memento);
        originator.run();
        originator.run();
    }
}
