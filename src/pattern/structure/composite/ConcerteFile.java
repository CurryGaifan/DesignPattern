package pattern.structure.composite;

public class ConcerteFile extends File {
    public ConcerteFile(String name) {
        super(name);
    }

    @Override
    public void add(File file) {
        throw new RuntimeException("can not add file to file");
    }

    @Override
    public void display(int depth) {
        printPrefix(depth);
        System.out.println(name);
    }
}
