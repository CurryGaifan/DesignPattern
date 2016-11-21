package pattern.action.interpreter;

public class TerminalExpression extends AbstractExpression {

    private int value;

    public TerminalExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpreter(Context context) {
        return value;
    }
}
