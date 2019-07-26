package com.jgs1902.day13;

//定义一个dog类属性有name, age, strain 方法有eat()吃和print()展示自身信息
//定义一个cat类属性有name, age, sex 方法有eat() 和print ()
//抽取通用的部分编写父类Anima1动物类
//编写测试类，调用print方法和eat方法

abstract class Animal{
	private String name;
	private int age;
	public Animal(String name, int age) {
		this.setName(name);
		this.setAge(age);
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
	public abstract void eat();
	public void print(){
		System.out.println("姓名："+this.getName()+",年龄"+this.getAge());
	}
}

class Dog extends Animal{
	private String strain;
	public Dog(String name, int age,String strain) {
		super(name, age);
		this.strain = strain;
	}
	public void eat(){
		System.out.println(getName()+"吃狗粮");
	}
	public void print(){
		super.print();
		System.out.println("品种:"+strain);
	}
}

class Cat extends Animal{
	private String sex;

	public Cat(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	public void eat(){
		System.out.println(getName()+"吃猫粮");
	}
	public void print(){
		super.print();
		System.out.println("性别:"+sex);
	}
}

public class Test01 {
	public static void main(String[] args) {
		Dog d = new Dog("旺财",18,"贵族");
		d.print();
		d.eat();
		Cat c = new Cat("tom",18,"公");
		c.print();
		c.eat();
		Animal a = new Dog("旺财", 20, "哈士奇");
		a.print();
		a.eat();
	}
}
