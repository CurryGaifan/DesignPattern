package pattern.bridge;

public class RefinedAbstractionB extends Abstraction {
    public RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("RefinedAbstractionB operation");
        implementor.operationImpl();
    }
}
