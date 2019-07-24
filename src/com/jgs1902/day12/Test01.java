package com.jgs1902.day12;

class Animal{
	private String name;
	private String sex;
	public Animal(String name,String sex){
		this.name = name;
		this.sex = sex;
	}
	public void show(){
		System.out.println("我的名字叫"+name+"我的性别是:"+sex+".");
	}
}

class Dog extends Animal{
	public Dog(String name, String sex) {
		super(name, sex);
	}

	public void behavior(){
		System.out.println("汪汪汪");
	}
}

class Cat extends Animal{
	public Cat(String name, String sex) {
		super(name, sex);
	}

	public void behavior(){
		System.out.println("喵喵喵");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Dog d = new Dog("旺财","公");
		d.show();
		d.behavior();
		Cat c = new Cat("tom","公");
		c.show();
		c.behavior();
	}
}
