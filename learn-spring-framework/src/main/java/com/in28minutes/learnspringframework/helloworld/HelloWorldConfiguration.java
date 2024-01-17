package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// spring managing object of an custom class
record Person(String name,int age,Adress addr) {};

/*Record is a new feature introduced in JDK16,
 * eliminates verbosity in creating Java Beans
 * Public accessor methods,constructor, equals and toString methods are automatically created. */

record Adress(String firstLine,String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Junaid";
	}
	
	@Bean
	public int  age() {
		return 25;
	}
	
	// spring managing object of an custom class
	@Bean
	
	public Person person() {
		return  new Person("John",24,new Adress("TNagar","Chennai"));
	}
	
	@Bean
	@Primary
	public Adress address() {
		return  new Adress("JP Nagar","Bangalore");
	}
	
	@Bean
	@Qualifier("secondary address")
	public Adress address2() {
		return  new Adress("Thrissur","Kerala");
	}
	
	@Bean 
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3Parameters(String name,int age,Adress address2) {
		return new Person(name,age,address2);
	}
	
	@Bean
	public Person person4Parameters(String name,int age,@Qualifier("secondary address") Adress address2) {
		return new Person(name,age,address2);
	}
	
	
}
