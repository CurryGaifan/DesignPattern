package pattern.action.vistor;

public class VisitorA implements Visitor {
    @Override
    public void visitorElementA(Element element) {
        System.out.println("visitorA " + element.getClass().getName());
    }

    @Override
    public void visitorElementB(Element element) {
        System.out.println("visitorA " + element.getClass().getName());
    }
}
