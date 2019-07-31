package com.jgs1902.day17;

//定义一个学生类和一个教员类，继承自person类，都有说话的方法，
//定义班主任类 有聊天方法。
//在测试类中使用多态分别完成与学生和教员聊天。

 abstract class Person{
	public abstract  void speak();
}

class Student extends Person{

	public void speak() {
		System.out.println("学生说话");
	}
	
}

class Teacher extends Person{

	public void speak() {
		System.out.println("教员说话");		
	}

}

class Teacher1 extends Person{

	public void talk(){
		System.out.println("班主任聊天");
	}

	public void speak() {
		System.out.println("班主任说话");		
	}
}

public class Test03 {
	public static void main(String[] args) {
		Person s = new Student();
		s.speak();
		Person t = new Teacher();
		t.speak();
		Person t1 = new Teacher1();
		t1.speak();
		((Teacher1)t1).talk();
	}
}
