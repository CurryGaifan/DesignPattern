package pattern.flyweight;

public class ConcreteFlyWeight implements FlyWeight {

    private char c;

    public ConcreteFlyWeight(char c) {
        this.c = c;
    }

    @Override
    public void operation(String color) {
        System.out.println("print char:" + c + ", color:" + color);
    }
}
