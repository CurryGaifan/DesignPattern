package pattern.action.templatemethod;

/**
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。 T模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * @ClassName: TemplateMethodPattern 
 * @Description: TODO
 * @author gaifan
 * @date May 19, 2014 2:41:22 PM 
 *
 */
public class TemplateMethodPattern {

	
	public static void main(String[] args) {
		AbstractClass a = new ConcreteClass();
		a.TemplateMethod();
	}
}

abstract class AbstractClass {
	public final void TemplateMethod() {

		primitiveMethod1();

		primitiveMethod2();

		doOperation3();

	}

	protected abstract void primitiveMethod1();

	protected abstract void primitiveMethod2();

	private final void doOperation3() {

		System.out.println("doOperation3()");

	}
}

class ConcreteClass extends AbstractClass {
	public void primitiveMethod1() {

		System.out.println("primitiveMethod1()");

	}

	public void primitiveMethod2() {

		System.out.println("primitiveMethod2()");

	}
}