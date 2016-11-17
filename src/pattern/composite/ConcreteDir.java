package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteDir extends File {

    private List<File> list = new ArrayList();

    public ConcreteDir(String name) {
        super(name);
    }

    @Override
    public void add(File file) {
        list.add(file);
    }

    @Override
    public void display(int depth) {
        printPrefix(depth);
        System.out.println(name);
        for (File file : list) {
            file.display(depth + 1);
        }
    }
}
