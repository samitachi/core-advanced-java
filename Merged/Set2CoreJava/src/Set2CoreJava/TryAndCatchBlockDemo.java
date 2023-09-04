package Set2CoreJava;
//Different Ways to write Try-Catch Block
public class TryAndCatchBlockDemo {
	public static void main(String[] args) {
		/*System.out.println("1");
		try {
			System.out.println("2");
			}
		catch(Exception e) {
			System.out.println("3");

		}
		System.out.println("4");
		}//Output: 1 2 4
	*/
		/*System.out.println("1");
	try {
		System.out.println("2");
		System.out.println(100/0);
		}
	catch(Exception e) {
		System.out.println("3");
	}
	System.out.println("4");
	}//Output: 1 2 3 4 */
		System.out.println("1");
		try {
			System.out.println(100/0);
			System.out.println("2");
			}
		catch(Exception e) {
			System.out.println("3");
		}
		System.out.println("4");
		}//Output:1 3 4
}
