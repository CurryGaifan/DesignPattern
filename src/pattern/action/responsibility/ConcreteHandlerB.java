package pattern.action.responsibility;

public class ConcreteHandlerB extends Handler {
    public ConcreteHandlerB(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if (request.getName().equals("b")) {
            System.out.println(this.getClass().getSimpleName() + " handle " + request.getName());
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
