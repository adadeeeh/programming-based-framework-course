package com.pedro;

import org.springframework.beans.factory.annotation.Value;

public class Elf implements Creature {

	private Weapon weapon;
	
//	@Value("${creature.name}")
//	private String name;
//	
//	public String getName() {
//		return name;
//	}

	public Elf(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void getEat() {
		System.out.println("Ah a food!");
	}

	@Override
	public String getBlacksmith() {
		return weapon.getWeapon();
	}

}
