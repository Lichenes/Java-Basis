package com.jgs1902.day16;

interface Person{
	public void eat();
	public void sleep();
	public void play();
}

class Student implements Person{

	public void eat() {
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");
	}

	public void play() {
		System.out.println("玩游戏");
	}

}

public class Test01{
	public static void main(String[] args) {
		Person p = new Student();
		p.eat();
		p.sleep();
		p.play();
	}
}