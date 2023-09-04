package Set2CoreJava;

public class TryCatchFinallyDemo2 {
	public static void main(String[] args) {
		System.out.println("1");

		try {
			System.out.println("2");
			System.out.println(100/0);

		}
		finally {
			System.out.println("3");
			}
	}/*Output:1
	2
	Exception in thread "main" 3
	java.lang.ArithmeticException: / by zero
		at Set2CoreJava/Set2CoreJava.TryCatchFinallyDemo2.main(TryCatchFinallyDemo2.java:9)
		Here Program ended abruptly, due to absense of catch block.
		*/

}
