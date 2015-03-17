package pattern.template.method;

/**
 * ����һ�������е��㷨�ĹǼܣ�����һЩ�����ӳٵ������С� Tģ�巽��ʹ��������Բ��ı�һ���㷨�Ľṹ�����ض�����㷨��ĳЩ�ض����衣
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

		System.out.println("doOperation3();");

	}
}

class ConcreteClass extends AbstractClass {
	public void primitiveMethod1() {

		// write your code here

		System.out.println("primitiveMethod1();");

	}

	public void primitiveMethod2() {

		// write your code here

		System.out.println("primitiveMethod2();");

	}
}