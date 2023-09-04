package in.sp.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.sp.beans")
//@ComponentScan({"in.sp.beans1","in.sp.beans2"}) //If multiple beans are there
//@ComponentScan(basePackages = {"in.sp.beans1","in.sp.beans2"})
public class JavaConfigFile {

}
