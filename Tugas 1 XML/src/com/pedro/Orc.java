package com.pedro;

public class Orc implements Creature {
	private Sword sword;
	private String name;
	private int age;
	private String speed;
	
	public Orc() {
	}

	public Orc(String name, int age, String speed) {
		this.name = name;
		this.age = age;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public Orc(Sword sword) {
		this.sword = sword;
	}

	public Sword getSword() {
		return sword;
	}

	@Override
	public void getEat() {
		// TODO Auto-generated method stub
		System.out.println("I like this food!");
	}

}
