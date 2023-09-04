package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean(name = "stdobj1")
        public Student CreatBeanObj1() {
		Student std1 = new Student();

		std1.setName("Deepesh");
		std1.setRollno(104);
		return std1; 
	}
	
	@Bean(name = "stdobj2")
    public Student CreatBeanObj2() {
	Student std2 = new Student();

	std2.setName("Akash");
	std2.setRollno(105);
	return std2; 
}
}
