package com.jgs1902.day09;

//参数传递
class Student2{
	int age;
	public void parameter(Student2 student){
		student.age += 1;
	}
}

class Number{
	int num;
	public void paratmeter(int n){
		num = n+1;
	}
}
//	基本数据类型：传值
//	引用数据类型：传地址
public class Transfer {
	public static void main(String[] args) {
		Number num = new Number();
		int n = 8;
		num.paratmeter(n);
		Student2 s = new Student2();
		s.age = 18;
		s.parameter(s);
		System.out.println(n+"-----"+s.age);//8----19
	}
}
