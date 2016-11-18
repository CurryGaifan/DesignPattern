package pattern.create.builder;

public interface Builder {

    void buildProduct();

    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getResult();
}
