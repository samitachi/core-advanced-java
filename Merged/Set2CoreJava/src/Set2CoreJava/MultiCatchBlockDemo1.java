package Set2CoreJava;

public class MultiCatchBlockDemo1 {
public static void main(String[] args) {
	try{
		System.out.println(100/0);
		int[] a = {10,20,30,40};
		System.out.println(a[5]);
	}
	/*
	catch(ArithmeticException e) {
		System.out.println("Can not divide by 0");
		}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Out Of Bound");
	}//Output: Can not divide by 0
	*/
	//After new JAVA feature we can add multi-catch block together
	catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}//Output: java.lang.ArithmeticException: / by zero
	/*It is better if we have to write common exception for multiple try blocks 
	 * but if required we have to write seperate catch blocks for different exceptions.
	 * 
	 */
}
}
