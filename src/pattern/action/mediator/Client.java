package pattern.action.mediator;

public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);
        mediator.setConcreteColleagueA(colleagueA);
        mediator.setConcreteColleagueB(colleagueB);

        colleagueA.changed();
        colleagueB.changed();
    }
}
