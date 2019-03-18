package com.pedro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//IoC
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("creature.xml");
		
		Orc orc1 = context.getBean("orc1", Orc.class);
		orc1.getEat();
		System.out.println("Orc1 name: " + ((Orc)orc1).getName());
		System.out.println("Orc1 age: " + ((Orc)orc1).getAge());
		System.out.println("Orc1 speed: " + ((Orc)orc1).getSpeed());
		
		((Orc)orc1).getSword().getWeapon();
		context.close();
	}

}
