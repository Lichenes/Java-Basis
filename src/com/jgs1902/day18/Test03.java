package com.jgs1902.day18;

import java.util.Scanner;

class Person1{
	String name;
	int age;
	public void check(){
		if(age>=18 && age<=60){
			System.out.println(name+"的年龄为："+age+"，门票价格为：100元");
		}else if((age>0 && age<18) || (age>60 && age<100)){
			System.out.println(name+"的年龄为："+age+"，门票价格为50元");
		}else{
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
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
			System.out.println("输入年龄 ：");
			p1.age = cin.nextInt();
			p1.check();
		} while (true);
		System.out.println();
	}
}
