package com.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppSpring {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call method one bean
		System.out.println(theCoach.getDailyWorkout());
		
		// new mehtods of fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
