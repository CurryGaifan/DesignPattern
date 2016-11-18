package pattern.builder;

public class Product {
    private String name = "";

    void add(String value) {
        name += value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
