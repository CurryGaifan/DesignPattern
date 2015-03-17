package pattern.singleton;

public class SingletonPattern {

}

class Singleton1 {
	private static Singleton1 s = new Singleton1();

	private Singleton1(){
		
	};
	public static Singleton1 getInstance() {
		return s;
	}
}

class Singleton2 {
	private static Singleton2 s;

	private Singleton2(){
		
	};
	
	public synchronized static Singleton2 getInstance() {
		if (s == null) {
			s = new Singleton2();
		}
		return s;
	}
}