package pattern.structure.adapter;

public class Client {

    public static void main(String[] args) {
        Target target1 = new ClassAdapter();
        target1.request();

        Target target2 = new ObjectAdapter(new Adaptee());
        target2.request();
    }
}
