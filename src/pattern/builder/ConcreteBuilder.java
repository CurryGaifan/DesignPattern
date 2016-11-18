package pattern.builder;

public class ConcreteBuilder implements Builder {

    private Product product;

    @Override
    public void buildProduct() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.add("-a-");
    }

    @Override
    public void buildPartB() {
        product.add("-b-");
    }

    @Override
    public void buildPartC() {
        product.add("-c-");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
