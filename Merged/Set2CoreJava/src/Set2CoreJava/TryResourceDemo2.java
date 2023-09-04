package Set2CoreJava;

public class TryResourceDemo2 {/*
public static void name(String[] args ) {
	 //For Database Cnnection We write 2 lines
	 Class.forName("");
	 Connection con = DriverManager.getConnection(""); 
 }//It is showing 2 types of Exceptions, So we will try with try-catch block*/
	/*
	Connection con = null;
	try {
		 Class.forName("");
		 Connection con = DriverManager.getConnection(""); 
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally {
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}*///we can also do above code with try with resource
	public static void name(String[] args ) {
//		try(Class.forName(""); // (We can write close with ry with resource as it does not inherit autoclosable class)
//				//thus it has to be written outside with try-catch method
//		    Connection con = DriverManager.getConnection("","",""); //Connection inherits autoclosable thus we can write ){
//			
//		}
//		catch(Exception e) {
//			System.out.println(e);
		//} finally block is not required 
	}
}
