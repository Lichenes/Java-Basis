package com.jgs1902.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student1{
	private String name;
	private String sex;
	public Student1() {
	}
	public Student1(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "姓名是：" + name + "性别是：" + sex ;
	}
	
}

public class Test04 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Map<String, Student1> map = new HashMap<>();
		Student1 stu =new Student1("李明","男");
		map.put("Jack", stu);
		System.out.println("输入查看学生的英文名：");
		String name = cin.next();
		System.out.println(name+"对应的学生的"+map.get(name).toString());
	}
}
