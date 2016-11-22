package pattern.action.vistor;

public class Client {
    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();
        structure.add(new ElementB());
        structure.add(new ElementA());
        structure.accept(new VisitorB());
        structure.accept(new VisitorA());

    }
}
