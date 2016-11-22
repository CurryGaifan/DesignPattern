package pattern.action.strategy;

/**
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
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
		c.execute();
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

	public void execute() {
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