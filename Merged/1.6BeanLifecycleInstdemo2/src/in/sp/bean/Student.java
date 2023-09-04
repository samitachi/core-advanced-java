package in.sp.bean;

public class Student {
	
	public Student(int a) {
		System.out.println("Contructor Invoked!");
	}
	
	private String name;
	private int rollno;

	public String getName() {
		System.out.println("Getter method invoked");
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter method invoked");
		this.name = name;
	}
	//Both getter setter methods were not invoked as we have not used property tags xml file configuration
               
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void display() {
		System.out.println("Hello");
	}
	//But if we want to anyhow create bean objects through parameterized constructor, then we have to use static factory method
	public static Student createStdobj() {
		System.out.println("static factory method invoked");
		return new Student(10);//just remember this statement, put any value
		//Without "<bean class="in.sp.bean.Student" id="stdId" factory-method="createStdobj" >"
		//factory method will not be started. 
	}
	/*Output:
	 * static factory method invoked
       Contructor Invoked!
       Hello
	 */
}
