package clases;

/**
 *
 * @author Josue
 */

// NonterminalExpression
public class SubtractionExpression implements IExpression {

    private IExpression left;
    private IExpression right;

    public SubtractionExpression(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
