package pattern.structure.bridge;

public class RefinedAbstractionA extends Abstraction {
    public RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("RefinedAbstractionA operation");
        implementor.operationImpl();
    }
}
