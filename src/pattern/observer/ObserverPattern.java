package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

	
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		sub.register(new ConcreteObserver("1"));
		sub.register(new ConcreteObserver("2"));
		sub.notifyAllObs();
	}
}

interface Subject{
	public void register(Observer obs);
	public void delete(Observer obs);
	public void notifyAllObs();
}

interface Observer{
	public void update();
}

class ConcreteObserver implements Observer{
	String name ;
	public ConcreteObserver(String string) {
		this.name = string;
	}
	@Override
	public void update() {
		System.out.println("I receive the change. I'm " + name);
		
	}
	
}

class ConcreteSubject implements Subject{
	private List<Observer> list = new ArrayList<Observer>();
	@Override
	public void delete(Observer obs) {
		list.remove(obs);
		
	}

	@Override
	public void notifyAllObs() {
		for(Observer obs : list)
			obs.update();
		
	}

	@Override
	public void register(Observer obs) {
		list.add(obs);
		
	}
	
	public void operate(){
		notifyAllObs();
	}
}