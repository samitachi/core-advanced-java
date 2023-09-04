package Set2CoreJava;

public class TryCatchFinallyDemo3 {
	public static void main(String[] args) {
		try {
			System.out.println(100 / 0);
			System.out.println("1");
		} catch (Exception e) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
		/*
		 * catch(Throwable e) {
		 * 
		 * }//Error message: Catch without try
		 */// Cannot write catch block at the end
	}
	
}
