package com.jgs1902.day08;

import java.util.Scanner;

class Employee{
	int num;
	String name;
	String position;
	public void check(){
		System.out.println("编号："+num+"，姓名："+name+"，职位："+position);
	}
	public void check1(){
		System.out.println("姓名："+name+"，职位："+position);
	}
}

public class Test05 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("输入编号：");
		e.num = cin.nextInt();
		System.out.println("输入姓名：");
		e.name = cin.next();
		System.out.println("输入职位：");
		e.position = cin.next();
		e.check();
		e.check1();
		cin.close();
	}
}
