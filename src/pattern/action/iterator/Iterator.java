package pattern.action.iterator;

public interface Iterator {

    void next();
    void first();
    boolean isDone();
    Object currentItem();
}
