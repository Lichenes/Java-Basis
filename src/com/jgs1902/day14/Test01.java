package com.jgs1902.day14;

//定义一个人类抽象类，属性包括姓名，年龄，性别，国籍。方法包括吃饭，睡觉工作
//根据人类，定义一个子类学生类，增加属性学校，学号。重写工作方法(工作是学习)
//根据人类，定义一个子类工人类，增加属性工龄。重写工作方法
//根据学生类，定义一个子类学生干部类，增加属性职务。增加方法开会
//编写测试类对这3类人物进行测试

abstract class Person{
	String name;
	int age;
	String sex;
	String nationality;
	
	public Person(String name, int age, String sex, String nationality) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.nationality = nationality;
	}
	public void eat(){
		System.out.println("吃饭");
	}
	public void sleep(){
		System.out.println("睡觉");
	}
	public abstract void work();
}

class Student extends Person{
	String school;
	int number;
	
	public Student(String name, int age, String sex, String nationality, String school, int number) {
		super(name, age, sex, nationality);
		this.school = school;
		this.number = number;
	}

	public void work() {
		System.out.println("学习");
	}
	
}

class StudentWorker extends Student{
	String duty;

	public StudentWorker(String name, int age, String sex, String nationality, String school, int number, String duty) {
		super(name, age, sex, nationality, school, number);
		this.duty = duty;
	}
	public void work1(){
		System.out.println("开会");
	}
}

class Worker extends Person{
	int age2;

	public Worker(String name, int age, String sex, String nationality, int age2) {
		super(name, age, sex, nationality);
		this.age2 = age2;
	}

	public void work() {
		System.out.println("工作");
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Person s = new Student("小明", 18, "男", "中国", "北大青鸟", 11111);
		s.eat();
		s.sleep();
		s.work();
		StudentWorker sw = new StudentWorker("小红", 18, "女", "中国", "北小青鸟", 22222, "班长");
		sw.eat();
		sw.sleep();
		sw.work1();
		Person w = new Worker("李华", 18, "男", "美国", 100);
		w.eat();
		w.sleep();
		w.work();
	}
}
