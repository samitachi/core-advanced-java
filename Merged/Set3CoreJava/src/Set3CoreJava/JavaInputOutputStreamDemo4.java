package Set3CoreJava;

import java.io.FileOutputStream;

public class JavaInputOutputStreamDemo4 {
public static void main(String[] args) {
	try {
		String data = "this is my Second demo";
		FileOutputStream fos =new FileOutputStream("d:\\aaa.txt",true);
		byte[] b=data.getBytes();
		fos.write(b);
		fos.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}

}
