package com.pedro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ActivityConfig.class);
		
		// get the bean from spring container
		Creature theCreature = context.getBean("elf", Creature.class);

		// call a method on the bean
		theCreature.getEat();
		
		// call a method to get blacksmith
		System.out.println(theCreature.getBlacksmith());
		
		// close the context
		context.close();
	}

}
