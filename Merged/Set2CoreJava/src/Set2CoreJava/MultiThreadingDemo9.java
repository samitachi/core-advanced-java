package Set2CoreJava;
class MTDemo9{
	/*
	void divide() {
		int a=5,b=0,c;
		c=a/b;
	}
}
//Output:Exception in thread "main" java.lang.ArithmeticException: / by zero
//that means, main thread is executing divide method also. 

public class MultiThreadingDemo9 {
public static void main(String[] args) {
	MTDemo9 ob =new MTDemo9();
	ob.divide();
}
}*/
	//We can set the name of the current thread
	void divide() {
		int a=5,b=0,c;
		c=a/b;
	}
}
public class MultiThreadingDemo9 {
	
public static void main(String[] args) {
	Thread.currentThread().setName("Deepak");
	MTDemo9 ob =new MTDemo9();
	ob.divide();
}//output:Exception in thread "Deepak" java.lang.ArithmeticException: / by zero
}
