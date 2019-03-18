package com.pedro;

import org.springframework.stereotype.Component;

@Component
public class Sword implements Weapon {

	@Override
	public String getWeapon() {
		// TODO Auto-generated method stub
		return "This is my sword!";
	}

}
