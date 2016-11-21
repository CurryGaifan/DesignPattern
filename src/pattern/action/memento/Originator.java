package pattern.action.memento;

public class Originator {

    private int state;

    public void setState(Memento memento) {
        this.state = memento.getState();
        System.out.println("originator state: " + state);
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void run() {
        state++;
        System.out.println("originator state: " + state);
    }

}
