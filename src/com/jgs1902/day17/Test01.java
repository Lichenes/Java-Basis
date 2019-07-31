package com.jgs1902.day17;

//编写一个Animal动物类，具有一些基本属性，以及一个返回信息的方法。
//接着编写一个Fly接口，包含了一个返回飞行速度的方法，
//编写Glede老鹰和Pigeon鸽子类，
//编写测试类打印老鹰和鸽子的信息以及飞行速度

class Animal{
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String toString() {
		return "Animal [age=" + speed + "]";
	}
	
}

interface Fly{
	public void fly();
}

class Glede extends Animal implements Fly{

	public void fly() {
		System.out.println("老鹰"+this.getSpeed()+"m/s,飞的很快");
	}
	
}

class Pigeon extends Animal implements Fly{

	public void fly() {
		System.out.println("鸽子"+this.getSpeed()+"m/s,飞的快");
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Glede g = new Glede();
		g.setSpeed(10);
		g.fly();
		Pigeon p = new Pigeon();
		p.setSpeed(7);
		p.fly();
	}
}
