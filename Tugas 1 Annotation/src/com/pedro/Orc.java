package com.pedro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("normalOrc")
@Component
public class Orc implements Creature {

	private Weapon weapon;
	
	@Autowired
	public Orc(Weapon weapon) {
		this.weapon = weapon;
	}

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
