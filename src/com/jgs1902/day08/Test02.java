package com.jgs1902.day08;

class Students{
	String name;
	String sex;
	int age;
	String professional;
	public void introduction(){
		System.out.println("名字："+name+" 性别："+sex+" 年龄："+age+" 专业："+professional);
	}
}

class Teacher{
	String name; 
	String sex;
	int age;
	String position;
	public void introduction(){
		System.out.println("名字："+name+" 性别："+sex+" 年龄："+age+" 职位："+position);
	}
}

public class Test02 {
	public static void main(String[] args) {
		Students s = new Students();
		s.name = "小明";
		s.sex = "男";
		s.age = 22;
		s.professional = "计算机";
		s.introduction(); 
		Teacher t = new Teacher();
		t.name = "周老师";
		t.sex = "男";
		t.age = 30;
		t.position = "Java";
		t.introduction();
	}
}
