package pattern.factory;

/**
 * ���󹤳�ģʽ�͹�������ģʽ�������������Ҫ��������ĸ��ӳ̶��ϡ����ҳ��󹤳�ģʽ������������Ϊ�������һ���Ե�
 * ����һ���Ʒ�Ĺ�ϵ��
 * @ClassName: AbstractFactory 
 * @Description: TODO
 * @author gaifan
 * @date May 19, 2014 11:19:07 AM 
 *
 */
public class AbstractFactory {

	
	public static void main(String[] args) {
		IIFactory f = new Factory_A();
		f.makeA().go();
		f.makeB().go();
	}
}
interface IIFactory{
	public AbstractProductA makeA();
	public AbstractProductB makeB();
}

class Factory_A implements IIFactory{

	@Override
	public AbstractProductA makeA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public AbstractProductB makeB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}
	
}

class Factory_B implements IIFactory{

	@Override
	public AbstractProductA makeA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public AbstractProductB makeB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}
	
}

abstract class AbstractProductA{
	public abstract void go();
}

class ProductA1 extends AbstractProductA{

	@Override
	public void go() {
		System.out.println("sing chinese song.");
		
	}
	
}

class ProductA2 extends AbstractProductA{

	@Override
	public void go() {
		System.out.println("sing english song.");
		
	}
	
}

abstract class AbstractProductB{
	public abstract void go();
}

class ProductB1 extends AbstractProductB{

	@Override
	public void go() {
		System.out.println("dance chinese. ");
		
	}
	
}

class ProductB2 extends AbstractProductB{

	@Override
	public void go() {
		System.out.println("dance english.");
		
	}
	
}