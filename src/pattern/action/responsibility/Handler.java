package pattern.action.responsibility;

public abstract class Handler {

    protected Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handle(Request request);
}
