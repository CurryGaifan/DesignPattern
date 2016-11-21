package pattern.action.mediator;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("ConcreteColleagueB update");
    }
}
