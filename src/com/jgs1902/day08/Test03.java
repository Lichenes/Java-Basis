package com.jgs1902.day08;

import java.util.Scanner;

class Person1{
	String name;
	int age;
	public void check(){
		if(age>=18){
			System.out.print(name+"的年龄为："+age+"，门票价格为：20元");
		}else
		{
			System.out.print(name+"的年龄为："+age+"，门票价格为免费");
		}
	}
}

public class Test03 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Person1 p1 = new Person1();
		do {
			System.out.println("输入姓名：");
			p1.name = cin.next();
			if("n".equals(p1.name)){
				break;
			}
			System.out.println("输入年龄：");
			p1.age = cin.nextInt();
			p1.check();
		} while (true);
		System.out.println();
		cin.close();
	/*	do {
			System.out.println("输入姓名：");
			p1.name = cin.next();
			if("n".equals(p1.name)){
				break;
			}
			System.out.println("输入年龄：");
			p1.age = cin.nextInt();
			if(p1.age>=18){
				System.out.print(p1.name+"的年龄为："+p1.age+"，门票价格为：20元");
			}else{
				System.out.print(p1.name+"的年龄为："+p1.age+"，门票价格为免费");
			}
			System.out.println();
		} while (true);
		System.out.println("退出程序！");*/
	}
}
