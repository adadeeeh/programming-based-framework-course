package com.pedro;

import org.springframework.stereotype.Component;

@Component("normalOrc")
public class Orc implements Creature {

	@Override
	public void getEat() {
		// TODO Auto-generated method stub
		System.out.println("I like this food!");
 	}

}
