package pattern.structure.composite;

public class Client {

    public static void main(String[] args) {
        File d1 = new ConcreteDir("dir1");
        File f1_1 = new ConcerteFile("file1_1");
        File f1_2 = new ConcerteFile("file1_2");
        File d1_1 = new ConcreteDir("dir1_2");
        File f1_1_1 = new ConcerteFile("file1_1_1");
        File f1_1_2 = new ConcerteFile("file1_1_2");

        d1_1.add(f1_1_1);
        d1_1.add(f1_1_2);
        d1.add(d1_1);
        d1.add(f1_1);
        d1.add(f1_2);
        d1.display(0);
    }
}
