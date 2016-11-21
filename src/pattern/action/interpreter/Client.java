package pattern.action.interpreter;

public class Client {

    public static void main(String[] args) {

        TerminalExpression t1 = new TerminalExpression(1);
        TerminalExpression t2 = new TerminalExpression(2);
        TerminalExpression t3 = new TerminalExpression(3);

        AbstractExpression addExpression = new AddExpression(t1, t3);
        AbstractExpression subtractExpression = new SubtractExpression(t2, addExpression);
        System.out.println(subtractExpression.interpreter(new Context()));

    }

}
