package com.jgs1902.day15;

abstract class Pet{
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public abstract void eat();
}

class Dog extends Pet{

	public void eat() {
		 System.out.println("吃狗粮");
	}
	
}

class Penguin extends Pet{

	public void eat() {
		System.out.println("吃企鹅粮");
	}
	
}

class Master {
	public void feed(Pet pet){
		if(pet instanceof Dog){
			if(pet.getHealth() < 100){
				pet.setHealth(pet.getHealth()+3);
			}
		}else{
			if(pet.getHealth() < 100){
				pet.setHealth(pet.getHealth()+5);
			}
		}
	}
}

public class Test01 {
	public static void main(String[] args) {
		Master m = new Master();
		Pet d = new Dog();
		d.setHealth(60);
		m.feed(d);
		System.out.println("狗狗"+d.getHealth());
		Pet p = new Penguin();
		p.setHealth(70);
		m.feed(p);
		System.out.println("企鹅"+p.getHealth());
	}
}
