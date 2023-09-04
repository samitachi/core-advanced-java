package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class StdConfigFile {
	@Bean
	public Student stdObj() {
		Student std = new Student();
		std.setName("Abhishek");
		std.setRollno(101);
		return std;

	}
}
