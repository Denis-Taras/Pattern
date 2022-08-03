package interpreter;

import interpreter.context.Context;
import interpreter.expressions.Expression;

public class Main {

    public static void main(String[] args) {
        String stringExpression = "12578-278+33669";
        Context context = new Context();
        Expression expression = context.evaluateExpression(stringExpression);
        System.out.println(stringExpression + " = " + expression.interpret());
    }
}
