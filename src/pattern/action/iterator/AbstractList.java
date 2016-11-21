package pattern.action.iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractList {

    private List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public int size() {
        return list.size();
    }

    public Object get(int index) {
        return list.get(index);
    }

    public abstract Iterator createIterator(AbstractList list);
}
