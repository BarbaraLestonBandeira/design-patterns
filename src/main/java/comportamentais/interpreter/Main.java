package comportamentais.interpreter;

public class Main {

    public static void main(String[] args) {
        Expression expression = new AddExpression(
                new NumberExpression(10),
                new SubtractExpression(
                        new NumberExpression(5),
                        new NumberExpression(2)
                )
        );
        System.out.println(expression.interpret(null));
    }
}
