package com.jgs1902.day18;

import java.util.Scanner;

class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Test02 {
	public static void main(String[] args) throws Exception {
		Scanner cin = new Scanner(System.in);
		Person p = new Person();
		System.out.println("输入年龄：");

			int age= cin.nextInt();
			if(age<0 || age>100){
				throw new Exception("年龄必须在1~100之间");
			}else{
				p.setAge(age);
			}

	}
}
