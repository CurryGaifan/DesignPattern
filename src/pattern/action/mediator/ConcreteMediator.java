package pattern.action.mediator;

public class ConcreteMediator implements Mediator {

    private Colleague concreteColleagueA;
    private Colleague concreteColleagueB;

    public void setConcreteColleagueA(Colleague concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(Colleague concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    @Override
    public void componentChanged(Colleague colleague) {
        if (colleague instanceof ConcreteColleagueA) {
            concreteColleagueB.update();
        } else if (colleague instanceof ConcreteColleagueB) {
            concreteColleagueA.update();
        }
    }
}
