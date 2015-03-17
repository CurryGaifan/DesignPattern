package pattern.proxy;

/**
 * Ϊ���������ṩһ�ִ������Կ��ƶ��������ķ���
 * @ClassName: ProxyPattern 
 * @Description: TODO
 * @author gaifan
 * @date May 19, 2014 3:12:12 PM 
 *
 */
public class ProxyPattern {

	public static void main(String[] args) {
		ISubject s = new Proxy(new ConcreteSubject());
		s.method();
	}

}

interface ISubject {
	public void method();
}

class ConcreteSubject implements ISubject {

	@Override
	public void method() {
		System.out.println("ConcreteSubject do method");

	}

}

class Proxy implements ISubject {
	ConcreteSubject cs;

	public Proxy(ConcreteSubject cs) {
		this.cs = cs;
	}

	@Override
	public void method() {
		beforMethod();
		cs.method();
		afterMethod();
	}

	private void beforMethod() {
		System.out.println("beforMethod");
	}

	private void afterMethod() {
		System.out.println("afterMethod");
	}

	public void setCs(ConcreteSubject cs) {
		this.cs = cs;
	}

}