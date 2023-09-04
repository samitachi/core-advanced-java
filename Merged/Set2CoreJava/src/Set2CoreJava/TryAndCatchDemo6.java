package Set2CoreJava;



public class TryAndCatchDemo6 {
	public static void main(String[] args) {
		System.out.println("1");
	
		try {
			System.out.println("2");
			System.out.println(100/0);
			
		}
		catch(Throwable e) {//(Will not work if we write Object)
			/*If we write multiple catch block then firstly child Exception class
			 * will be written. After that either parent Exception class will be written or
			 * of same level will be written) 
			 */
			System.out.println("3");
		}
		System.out.println("4");
}//Output: 1 2 3 4 
}
