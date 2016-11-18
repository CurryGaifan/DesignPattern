package pattern.action.responsibility;

public class ConcreteHandlerA extends Handler {
    public ConcreteHandlerA(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if (request.getName().equals("a")) {
            System.out.println(this.getClass().getSimpleName() + " handle " + request.getName());
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }


}
