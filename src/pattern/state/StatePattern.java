package pattern.state;

/**
 * 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
 * @ClassName: StatePattern 
 * @Description: TODO
 * @author gaifan
 * @date May 19, 2014 3:26:08 PM 
 *
 */
public class StatePattern {
	public static void main(String[] args) {
		Context c = new Context(new State1());
		c.excute();
		c.excute();
		c.excute();
		c.excute();
	}
}

interface IState{
	public void handle(Context c);
}
class State1 implements IState{

	@Override
	public void handle(Context c) {
		System.out.println("State1 handle");
		c.setS(new State2());
	}
	
}

class State2 implements IState{

	@Override
	public void handle(Context c) {
		System.out.println("State2 handle");
		c.setS(new State1());
	}
	
}

class Context{
	IState s ;

	public Context(IState s) {
		this.s = s;
	}
	public void setS(IState s) {
		this.s = s;
	}
	public void excute(){
		s.handle(this);
	}
}