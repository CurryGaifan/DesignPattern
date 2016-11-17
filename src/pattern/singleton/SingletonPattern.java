package pattern.singleton;

public class SingletonPattern {

}

class Singleton1 {
    private static Singleton1 s = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return s;
    }
}

class Singleton2 {
    private static volatile Singleton2 s;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (s == null) {
            synchronized (Singleton2.class) {
                if (s == null)
                    s = new Singleton2();
            }
        }
        return s;
    }
}