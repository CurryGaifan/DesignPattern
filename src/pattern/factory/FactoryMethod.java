package pattern.factory;

/**
 * 这样在简单工厂模式里集中在工厂方法上的压力可以由工厂方法模式里不同的工厂子类来分担
 * @ClassName: FactoryMethod 
 * @Description: TODO
 * @author gaifan
 * @date May 19, 2014 11:18:09 AM 
 *
 */
public class FactoryMethod {

	
	public static void main(String[] args) {
		IProduct a = new FactoryA().make();
		a.go();
		IProduct b = new FactoryB().make();
		b.go();
	}
	
}

interface IProduct{
	public void go();
}

class AProduct implements IProduct{

	@Override
	public void go() {
		System.out.println("singing");
		
	}
	
}

class BProduct implements IProduct{

	@Override
	public void go() {
		System.out.println("dancing");
		
	}
	
}
interface IFactory{
	public IProduct make();
}
class FactoryA implements IFactory{

	@Override
	public IProduct make() {
		// TODO Auto-generated method stub
		return new AProduct();
	}
	
}

class FactoryB implements IFactory{

	@Override
	public IProduct make() {
		// TODO Auto-generated method stub
		return new BProduct();
	}
	
}