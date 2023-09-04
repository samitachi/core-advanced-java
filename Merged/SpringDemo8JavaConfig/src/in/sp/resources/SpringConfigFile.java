package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
@Bean(name ="stdobj1")

	public Student CreatBeanObj1() {  //Return type should be object
	Student std=new Student();
	
	std.setName("Deepesh");
    std.setRollno(104);		
	return std;     //Returning
}
}

