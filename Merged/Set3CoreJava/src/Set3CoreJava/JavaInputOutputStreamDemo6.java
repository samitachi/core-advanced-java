package Set3CoreJava;
import java.util.Scanner;
public class JavaInputOutputStreamDemo6 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter gmail");
	String gmail =sc.next();
	System.out.println("Enter password");
	String password =sc.next();
	if(gmail.equals("saayush@hmail.com")&&password.equals("qwerty")) {
		System.out.println("login success");
	}
	else {
		System.out.println("login failed");
	}
	sc.close();
}
}
