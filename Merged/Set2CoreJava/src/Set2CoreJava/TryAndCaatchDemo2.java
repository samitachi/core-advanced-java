package Set2CoreJava;

public class TryAndCaatchDemo2 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println(100/0);
			System.out.println("2");
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3");
		}
		System.out.println("4");
		}/*Output:1
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Set2CoreJava/Set2CoreJava.TryAndCaatchDemo2.main(TryAndCaatchDemo2.java:7)
	It is a RunTimeException,Program ended abruptly
*/
	}

