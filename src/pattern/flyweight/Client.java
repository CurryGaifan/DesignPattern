package pattern.flyweight;

public class Client {

    public static void main(String[] args) {
        FlyWeight b = FlyWeightFactory.getFlyWeight('b');
        FlyWeight c = FlyWeightFactory.getFlyWeight('c');
        FlyWeight d = FlyWeightFactory.getFlyWeight('d');

        b.operation("white");
        c.operation("red");
        d.operation("red");
        b.operation("red");

    }
}
