package tutorials.jdk8.lambda;

/**
 * A lambda expression is characterized by the following syntax.
 * <p>
 * <p>
 * <p>
 * <p>
 * Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.
 * <p>
 * Optional parenthesis around parameter − No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.
 * <p>
 * Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.
 * <p>
 * Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns a value.
 */
public class LambdaLesson {
	
	interface Sum {
		/***
		 * To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type. Calling the interface's method will run the lambda expression:
		 * @param a : String
		 * @param b : String
		 * @return : String
		 */
		String sum(String a, String b);
		
	}
	
	
	public static void main(String[] args) {
		
		// (parameter1, parameter2) -> { code block }
		Sum stringSum = (s1, s2) -> s1 + " " + s2;
		System.out.print("ID Name : " + stringSum.sum("David", "Stankov"));
	}
}
