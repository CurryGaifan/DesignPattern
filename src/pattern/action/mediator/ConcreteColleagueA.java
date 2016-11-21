package pattern.action.mediator;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("ConcreteColleagueA update");
    }
}
