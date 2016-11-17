package pattern.composite;

public abstract class File {
    protected String name;

    public File(String name) {
        this.name = name;
    }

    public abstract void add(File file);

    public abstract void display(int depth);

    protected void printPrefix(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
    }

}
