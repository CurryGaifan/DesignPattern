package pattern.action.interpreter;

public class SubtractExpression extends AbstractExpression {

    private AbstractExpression left;
    private AbstractExpression right;

    public SubtractExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context) - right.interpreter(context);
    }
}
