package pattern.create.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        System.out.println(builder.getResult());

    }
}
