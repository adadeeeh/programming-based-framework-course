package com.pedro;

public class Elf implements Creature {

	private Weapon weapon;
	
	public Elf(Weapon weapon) {
		this.weapon = weapon;
	}

//	@Override
	public void getEat() {
		System.out.println("Ah a food!");
	}

	@Override
	public String getBlacksmith() {
		return weapon.getWeapon();
	}

}
