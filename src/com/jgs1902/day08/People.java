package com.jgs1902.day08;

class Person{
	//属性
		String name;
		String sex;
		int age;
		//方法
		public void speak(){
			System.out.println("名字："+name+" 性别："+sex+" 年龄："+age);
		}
}

public class People {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "张三";
		p.sex = "男";
		p.age = 40;
		p.speak();
	}
}
