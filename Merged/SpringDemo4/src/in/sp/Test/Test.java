package in.sp.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.sp.beans.Student;

public class Test {
public static void main(String[] args) {
	Resource res =new ClassPathResource("/in/sp/resources/applicationContext.xml");
	BeanFactory factory =new XmlBeanFactory(res);
	Student st = (Student)factory.getBean("std");
	
	st.setName("Shashwat");
	st.setRollno("102");
	st.setMarks(89);
	
	st.display();
}
}
