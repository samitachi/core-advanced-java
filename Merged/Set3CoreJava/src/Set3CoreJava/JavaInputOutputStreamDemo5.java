package Set3CoreJava;
import java.io.FileReader;
public class JavaInputOutputStreamDemo5 {
public static void main(String[] args) {
      try {
    	  FileReader fr = new FileReader("C:\\Work\\BankApp\\src\\BankFunctionalities\\BankAppFunctions.java");
   int i;
   while((i=fr.read()) !=-1);
   {
	   System.out.print((char)i);
   }
   fr.close();
      }
      catch(Exception e){
    	  System.out.println(e);
      }
}
}
