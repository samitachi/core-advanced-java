package Set2CoreJava;

public class TryCatchFinallyDemo4 {
	public static void main(String[] args) {
		try {
			System.out.println(100 / 0);
			System.out.println("1");
		} catch (Exception e) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
		try {
			System.out.println("4");
		} catch (Throwable e) {
			System.out.println("5");
		}
		System.out.println("6");
	}//Output: 2 3 4 6 //We can write other set of try-catch block/try-catch-finally block after one finally block
}//In between two different r-catch blocks we can write other sets of code
