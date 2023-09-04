package Set2CoreJava;

public class StringDemo2 {
public static void main(String[] args) {
	/*
	String str1=new String("deepak");
	System.out.println(str1);
	byte[] b= {97,98,99,100};
	String str2=new String(b);
	System.out.println(str2);
}//Output: deepak abcd */
	/*char[] c= {'a','b'};
	String str3=new String(c);
	System.out.println(str3);
}//output: ab */
	/*
	String str2="deepak";
	int len = str2.length();
	System.out.println(str2.length());
	System.out.println(str2.isEmpty());
	String str3 = "     deepak             pawar";
	System.out.println(str3.trim());
}//output: 6 false deepak             pawar
*/
	/*
String str1="Deepak@gmail.com";
String str2="deepak123";
if(str1.equalsIgnoreCase("Deepak@gmail.com") && str2.equals("deepak123")) 
	{
		System.out.println("login Successful");
		
	}
	else
	{
		System.out.println("Failed");
	}
}//Output: login Successful
*/
	String str1="ab";
	String str2="ac";
	System.out.println(str1.compareTo(str2)); //Compares the strings lexicograhically 
	}//Output:-1
}

