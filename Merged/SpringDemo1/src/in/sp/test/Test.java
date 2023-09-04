package in.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.sp.beans.HelloBean;

public class Test {
public static void main(String[] args) {
	Resource res=new ClassPathResource("/in/sp/resources/applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(res); //depricated
	HelloBean hb=(HelloBean)factory.getBean("hb");
	hb.show();
}
}
