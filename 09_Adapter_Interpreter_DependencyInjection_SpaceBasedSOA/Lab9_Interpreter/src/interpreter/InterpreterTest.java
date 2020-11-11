package interpreter;

public class InterpreterTest {

	public static void main(String[] args) {


		BooleanExp expression;
		Context context = new Context();

		VariableExp x = new VariableExp("X");
		VariableExp y = new VariableExp("Y");

		expression = new OrExp(
				new AndExp(new Constant(true), x),
				new AndExp(y, new NotExp(x))
				);

		context.assign("X", false);
		context.assign("Y", true);

		boolean result = expression.evaluate(context);
		
		System.out.println("Result of first expression: " + result);
		
		
		BooleanExp replacement;
		VariableExp z = new VariableExp("Z");

		replacement = new NotExp(z);
		expression = expression.replace("Y", replacement);

		context.assign("Z", true);

		result = expression.evaluate(context);
		System.out.println("Result of modified expression: " + result);
		
	}

}
