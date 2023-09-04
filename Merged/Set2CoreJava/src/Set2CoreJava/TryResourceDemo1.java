package Set2CoreJava;
import java.io.FileInputStream;

public class TryResourceDemo1 {
	
//Resource closing is necessory because otherwise our program becomes slow. 
//Finally block is executed everytime, either there is exception or not
	
	public static void main(String [] args) {
		/* FileInputStream fis =null;
	 try {
		 fis = new FileInputStream("-");
		 fis.read();
		 System.out.println(100/0);
		 /*resource closing is always written inside finally block because 
		  * if resource close is written after any exception in try block, then
		  * all codes below it will get unread and our resource close will not happen   
		  
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
	 finally{
		
		 try {
			 fis.close(); //Resource close
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
	}*/
		try(FileInputStream fis = new FileInputStream("-");)//Try with resource
		//Here we don't need to manually close the resource with finally block.
		//jvm will close it if we write like this,(Similarly we can close other resources
		//which inherits autoclosable as well) 
		{
		fis.read();	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
}
