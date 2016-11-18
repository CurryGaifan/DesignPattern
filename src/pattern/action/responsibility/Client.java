package pattern.action.responsibility;

public class Client {
    public static void main(String[] args) {

        Request request = new Request("a");

        Handler handlerA = new ConcreteHandlerA(null);
        Handler handlerB = new ConcreteHandlerB(handlerA);
        handlerB.handle(request);

    }
}
