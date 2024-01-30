package clases;

/**
 *
 * @author Josue
 */

// Client
public class InterpreterClient {

    public static void main(String[] args) {
        // Expresión en notación postfija: 3 4 2 - 1 + *
        ExpressionContext context = new ExpressionContext();
        context.pushExpression(new NumberExpression(3));
        context.pushExpression(new NumberExpression(4));
        context.pushExpression(new NumberExpression(2));
        context.pushExpression(new SubtractionExpression(context.popExpression(), context.popExpression()));
        context.pushExpression(new NumberExpression(1));
        context.pushExpression(new AdditionExpression(context.popExpression(), context.popExpression()));

        System.out.println("Result: " + context.popExpression().interpret());
    }
}
