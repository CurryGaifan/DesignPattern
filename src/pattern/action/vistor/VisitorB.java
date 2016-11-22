package pattern.action.vistor;

public class VisitorB implements Visitor{
    @Override
    public void visitorElementA(Element element) {
        System.out.println("visitorB " + element.getClass().getName());
    }

    @Override
    public void visitorElementB(Element element) {
        System.out.println("visitorB " + element.getClass().getName());
    }
}
