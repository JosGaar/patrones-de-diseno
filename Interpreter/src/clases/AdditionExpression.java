package clases;

/**
 *
 * @author Josue
 */

// NonterminalExpression
public class AdditionExpression implements IExpression {

    private IExpression left;
    private IExpression right;

    public AdditionExpression(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
