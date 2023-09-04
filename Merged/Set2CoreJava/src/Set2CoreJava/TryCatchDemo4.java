package Set2CoreJava;

public class TryCatchDemo4 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println(100/0);
			System.out.println("2");
			}
		/*
		catch (Exception e) { 
			/*Now we cannot write child class of Exception for other catch blocks
			 * Unreachable catch block for ArrayIndexOutOfBoundsException. 
			 * It is already handled by the catch block for Exception
			
			System.out.println("3 CATCH");
		}
		catch(Exception e) { //Error due to ArrayIndexOutOfBoundsException 
			System.out.println("3...");
		}
		System.out.println("4");
		} */
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3...");
			}
		catch (Exception e) { //(Parent Exception can be after Child Exception) 
			System.out.println("3 CATCH");
		}
		System.out.println("4");
	}//Output: 1 3 CATCH 4
}
