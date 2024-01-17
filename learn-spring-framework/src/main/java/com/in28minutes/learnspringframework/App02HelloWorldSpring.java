package com.in28minutes.learnspringframework;

import java.util.Arrays;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
	//1. Launch a spring context / (spring container) -
		
	var context = new	AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
	//2. Configure the things we want spring to manage - @Configuration
	//we did this in HelloWorldConfiguration class
	// name - is a @bean here
	
	// 3. Retrieved beans managed by Spring
		System.out.println(context.getBean("name")); // pass in the same name as method name in configuration class
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean(Adress.class));
		System.out.println(context.getBean("person4Parameters"));
		
//		System.out.println("-----------------------------------------------------------\n Bean names \n");
//		Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
	}

}
