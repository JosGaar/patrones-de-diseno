package clases;

import java.util.Stack;

/**
 *
 * @author Josue
 */

// Context
public class ExpressionContext {

    private Stack<IExpression> expressionStack = new Stack<>();

    public void pushExpression(IExpression expression) {
        expressionStack.push(expression);
    }

    public IExpression popExpression() {
        if (!expressionStack.isEmpty()) {
            return expressionStack.pop();
        }
        return null;
    }
}
