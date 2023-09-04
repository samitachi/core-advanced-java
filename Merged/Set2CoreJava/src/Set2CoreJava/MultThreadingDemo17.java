package Set2CoreJava;
class TakeAdmn extends Thread{
	public void run() {
		try {
			System.out.println("You have applied for admission");
			Thread.sleep(1000);//Suppose 4000 miliseconds
			System.out.println("Admission Sucessful");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class PayFee extends Thread{
	public void run() {
		try {
			System.out.println("You have to pay fee");
			Thread.sleep(1000);
			System.out.println("Payment Sucessful");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class RollNo extends Thread{
	public void run() {
		try {
			System.out.println("Roll No Generated");
			Thread.sleep(1000);
			System.out.println("Can Give Exam");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class MultThreadingDemo17 {
public static void main(String[] args) throws InterruptedException {
	TakeAdmn ob1 = new TakeAdmn();
	ob1.start();
	ob1.join();//Suppose ob1.join(2000) hen it will wait for 2 secs after.If above task is taking 
	//4sec then it will ask ob2 thread to proceed.
	/*Output:
	 * You have applied for admission
You have to pay fee
Payment Sucessful
Roll No Generated
Admission Sucessful
Can Give Exam
	 */
	
	PayFee ob2 = new PayFee();
	ob2.start();
	ob2.join();
	
	RollNo ob3 = new RollNo();
	ob3.start();
	ob3.join();
	}
}
/*Without "join" order of output was random which is not desired.
 * Output:
 * You have applied for admission
Admission Sucessful
You have to pay fee
Payment Sucessful
Roll No Generated
Can Give Exam*/

