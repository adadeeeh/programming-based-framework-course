package com.pedro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("creature.xml");
		
		// get the bean from spring container
		Orc myOrc = context.getBean("normalOrc", Orc.class);
		
		// call a method i=on the bean
		myOrc.getEat();
		
		// close the context
		context.close();
	}

}
