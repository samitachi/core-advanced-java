package Set2CoreJava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo5 {
	public static void main(String[] args) {
		System.out.println("1");
	
		try {
			FileInputStream fis = new FileInputStream("-");
			System.out.println(100/0);
			System.out.println("2");
		}
		catch(FileNotFoundException e) {
			System.out.println("3");
		}
		catch(ArithmeticException e) {//If we dont write exception that is happening
			//in try block (Here, for ex. ArrayOufBoundsException Output:  Unresolved compilation problem: 
			//ArrayOufBoundsException cannot be resolved to a type)
			System.out.println("4");
		}
		System.out.println("5");
		
	}//Output: 1 3 5

}
