package pattern.action.vistor;

public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorElementB(this);
    }
}
