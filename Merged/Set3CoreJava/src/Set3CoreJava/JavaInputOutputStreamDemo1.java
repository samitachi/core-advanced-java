package Set3CoreJava;

import java.io.FileInputStream;


public class JavaInputOutputStreamDemo1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Work\\OOPsCodes\\src\\Set1OOPsGUIAWTSwing\\StaticDemo4.java");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();//if implementing from closable interface,we need to close.

		} catch (Exception e) {
			System.out.println(e);
		}
		// fieNotFound Exception-->FileInputStream fis = new FileInputStream("");
	}
}
