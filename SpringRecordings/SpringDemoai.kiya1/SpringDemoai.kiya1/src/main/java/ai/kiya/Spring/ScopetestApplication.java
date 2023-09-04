package ai.kiya.Spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ai.kiya"})
public class ScopetestApplication {
	public static void main(String[] args) {
		SpringApplication.run(ScopetestApplication.class,args);
	}
	

}
