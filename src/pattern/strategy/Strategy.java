package pattern.strategy;

/**
 * ����ģʽ������һϵ���㷨������ÿ���㷨��װ������ʹ���ǿ����໥�滻�����㷨�ı仯����Ӱ�쵽ʹ���㷨�Ŀͻ���
 * 
 * @ClassName: Strategy
 * @Description: TODO
 * @author gaifan
 * @date May 19, 2014 10:10:39 AM
 * 
 */
public class Strategy {
	public static void main(String[] args) {
		Context c = new Context(new StrategyA());
		c.excute();
	}

}

class Context {
	IStrategy strategy;

	public Context(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void excute() {
		strategy.doSomething();
	}

}

interface IStrategy {
	public void doSomething();
}

class StrategyA implements IStrategy {

	@Override
	public void doSomething() {
		System.out.println("Stragtegy A doSomething");

	}

}

class StrategyB implements IStrategy {

	@Override
	public void doSomething() {
		System.out.println("Stragtegy B doSomething");

	}

}