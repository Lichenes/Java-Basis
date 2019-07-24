package com.jgs1902.day12;

class Person{
	private String name;
	private String sex;
	public Person(String name,String sex){
		this.name = name;
		this.sex = sex;
	}
	public void show(){
		System.out.println("我的名字叫"+name+"我的性别是:"+sex+".");
	}
}

class Student extends Person{

	public Student(String name, String sex) {
		super(name, sex);
	}
	public void behavior(){
		System.out.println("学习！");
	}
}
class Teacher extends Person{

	public Teacher(String name, String sex) {
		super(name, sex);
	}
	public void behavior(){
		System.out.println("教书！");
	}
}

public class Test02 {
	public static void main(String[] args) {
		Student s = new Student("小明","男");
		s.show();
		s.behavior();
		Teacher t = new Teacher("大明","男");
		t.show();
		t.behavior();
	}
}
