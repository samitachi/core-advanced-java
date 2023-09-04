package Set3CoreJava;

import java.io.FileInputStream;

public class JavaInputOutputStreamDemo3 {
	public static void main(String[] args) {
		// With Try with resource we dont need to write fis.close separately
		try (FileInputStream fis = new FileInputStream(
				"C:\\Work\\OOPsCodes\\src\\Set1OOPsGUIAWTSwing\\FinalKeywordExample2.java");) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
