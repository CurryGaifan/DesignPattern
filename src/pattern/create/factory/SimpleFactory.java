package pattern.create.factory;

public class SimpleFactory {
	public static void main(String[] args) {
		Product p = new Factory().make("B");
		p.go();
		
	}

}

class Factory{
	
	public Product make(String str){
		if("A".equals(str))
			return new ProductA();
		else if("B".equals(str))
			return new ProductB();
		else {
			System.out.println("I can't make this product.");
			return null;
		}
	}
	
}


abstract class Product{
	public abstract void go();
}

class ProductA extends Product{

	@Override
	public void go() {
		System.out.println("singing.");
		
	}
	
}

class ProductB extends Product{

	@Override
	public void go() {
		System.out.println("dancing.");
		
	}
	
}