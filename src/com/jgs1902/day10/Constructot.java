package com.jgs1902.day10;

class Person{
	String name;
	int age;
	public Person(){
		System.out.println("调用无参构造方法");
	}
	public Person(String name){
		System.out.println(name+"调用有参构造方法");
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class Constructot {
	public static void main(String[] args) {
		Person p = new Person("学生1",18);
		System.out.println(p.name+"\t"+p.age);
	}
}
