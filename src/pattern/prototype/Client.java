package pattern.prototype;

public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        System.out.println(prototype.clonePrototype());
    }


}
