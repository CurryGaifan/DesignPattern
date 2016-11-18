package pattern.structure.decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteDecorator operation");
        component.operation();
    }
}
