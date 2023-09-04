package Set2CoreJava;

public class TryCatchDemo3 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println(100/0);
			System.out.println("2");
			}
		catch (ArithmeticException e) {
			System.out.println("3 CATCH");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3...");
		}
		System.out.println("4");
		}//Output:1 3 CATCH 4

	}


