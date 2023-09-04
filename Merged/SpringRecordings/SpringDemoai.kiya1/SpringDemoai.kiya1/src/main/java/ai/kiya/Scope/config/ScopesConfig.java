package ai.kiya.Scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import ai.kiya.Scope.domain.HelloMessageGenerator;
import ai.kiya.Scope.domain.Person;

@Configuration
public class ScopesConfig {

	@Bean
	@Scope("Singleton")
	public Person personSingleton1() {
		return new Person();

	}
	@Bean
	@Scope("Prototype")
	public Person personSingleton() {
		return new Person();

	}
	@Bean
	@RequestScope
	public HelloMessageGenerator requestScopedBean() {
		return new HelloMessageGenerator();
		
	}
	@Bean
	@SessionScope
	public HelloMessageGenerator sessionScopedBean() {
		return new HelloMessageGenerator();
		
	}
	@Bean
	@ApplicationScope
	public HelloMessageGenerator applicationScopedBean() {
		return new HelloMessageGenerator();
	
}
}
