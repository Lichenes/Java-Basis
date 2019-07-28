package com.jgs1902.day15;

class Student {
	private String name;
	private int id;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int age) {
		this.id = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj instanceof Student){ //传递进来的参数 是否是类的实例
			Student stu = (Student)obj;
			if(this.getId() == stu.getId() && this.getName() == this.getName()){
				return true;
			}
		}
		return false;
	}
}

public class Equals {
	public static void main(String[] args) {
		Student s = new Student();
		Student s2 = new Student();
		System.out.println(s.equals(s2));
		s.setId(111);
		s.setAge(18);
		s.setName("小明");
		System.out.println(s);
	}
}
