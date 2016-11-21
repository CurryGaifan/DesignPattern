package pattern.action.iterator;

public class Client {

    public static void main(String[] args) {

        AbstractList list = new ConcreteList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        Iterator iterator = list.createIterator(list);
        iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }

    }
}
