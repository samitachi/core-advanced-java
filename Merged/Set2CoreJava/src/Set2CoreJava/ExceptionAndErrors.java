package Set2CoreJava;

public class ExceptionAndErrors {
	// public staitc viod main(String[] args); //Lexical Error
	// public static void main(String{} args) //Syntax Error
	// char c1='a',c2='b';
	// char c = c1+c2; //semantic error
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println(100 / 0);//Exception
		/*Program will compile successfully but it won't print after this line as flow has
		 * been disturbed.
		 * 1
		 * 2
		 * 3
Exception in thread "main" java.lang."ArithmeticException: / by zero"
This exception needs to be handled so that the flow is not disturbed (ex.atm)
It is a pre-defined exception, as compiler knows divide by 0 is not possible.
But if we need to specify a vote program where voter cannot be lower than 18yrs. will
be user defined exception'
		 */
		System.out.println("4");
		System.out.println("5");
	}
}
