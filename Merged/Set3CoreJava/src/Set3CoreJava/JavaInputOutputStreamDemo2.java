package Set3CoreJava;

import java.io.FileInputStream;
import java.io.IOException;


public class JavaInputOutputStreamDemo2 {
	public static void main(String[] args) {
		FileInputStream fis =null;
		try {
			 fis = new FileInputStream(
					"C:\\Work\\OOPsCodes\\src\\Set1OOPsGUIAWTSwing\\FinalKeywordExample2.java");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			 

		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close();//if complete try block does not execute then fis will not close,so it must be written in finally block
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
