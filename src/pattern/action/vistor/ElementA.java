package pattern.action.vistor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorElementA(this);
    }
}
