package com.pedro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("normalOrc")
@Component
public class Orc implements Creature {

	@Autowired // --> field injection
	private Weapon weapon;
	
	public Orc() {
	}

	//Constructor injection
//	@Autowired
//	public Orc(Weapon weapon) {
//		System.out.println(">> With constructor injection ");
//		this.weapon = weapon;
//	}
	//Constructor injection ends here

	public Weapon getWeapon() {
		return weapon;
	}

	//Setter injection
	// define setter method
//	@Autowired
//	public void setWeapon(Weapon weapon) {
//		System.out.println(">> With setter injection");
//		this.weapon = weapon;
//	}
	//Setter injection ends here


	@Override
	public void getEat() {
		// TODO Auto-generated method stub
		System.out.println("I like this food!");
 	}

	@Override
	public String getBlacksmith() {
		// TODO Auto-generated method stub
		return weapon.getWeapon();
	}

}
