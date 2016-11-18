package pattern.create.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildProduct();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
