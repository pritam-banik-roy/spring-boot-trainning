package com.in28minutes.learn_spring_framework;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1:launch a spring context
		
		var context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2:configure the things that we want spring to manage -@Configuration
	    //HelloWorldConfiguration -@Configuraton
		//name -@Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("address2"));
		
		System.out.println(context.getBean(Person.class));
		
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person5Qualifier"));
		
		
		//System.out.println
//		Arrays.stream(context.getBeanDefinitionNames())
//		    .forEach(System.out::println);
	}

}
