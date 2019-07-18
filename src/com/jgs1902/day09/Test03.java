package com.jgs1902.day09;

//定义学生类，属性有姓名年龄班级名称有展示信息方法
//定义学生信息管理类定义一个长度为10的学生类数组
//定义添加学生方法，将学生类对象作为参数，加入到数组中。
//定义一个查询方法在指定范围内查询是否有该学生对象，学生对象的判断以姓名和班级为准。
//定义一个查看所有学生信息的方法
//定义测试类，调用信息管理类的方法来进行添加查看所有和查询指定学生

class Student4{
	String name;
	int age;
	String className;
	public void show(){
		System.out.println("姓名："+name+",年龄："+age+",班级："+className);
	}
}

class Management{
	public void add(Student4[] s,String name,int age,String className){
		for (int i = 0; i < s.length; i++) {
			if(s[i] == null){
			    s[i] = new Student4();
				s[i].name = name;
				s[i].age = age;
				s[i].className = className;
				break;
			}
		}
	}
	public void check(Student4[] s,int start,int end,String name,String className){
		boolean flag =false;
		for(int i=start-1;i<end;i++){
			if(s[i].name.equals(name) && s[i].className.equals(className)){
				flag = true;
			}
		}
		if(flag){
			System.out.println("找到了！");
		}else{
			System.out.println("没找到！");
		}
	}
	public void show(Student4[] s){
		for (Student4 s4 : s) {
			if(s4 != null){
				System.out.println(s4.name+"\t"+s4.age+"\t"+s4.className);
			}else{
				break;
			}
		}
	}
}

public class Test03 {
	public static void main(String[] args) {
		Student4[] stu = new Student4[10];
		stu[0] = new Student4();
		stu[0].name = "学生1";
		stu[0].age = 18;
		stu[0].className = "班级1";
		stu[1] = new Student4();
		stu[1].name = "学生2";
		stu[1].age = 19;
		stu[1].className = "班级2";
		stu[2] = new Student4();
		stu[2].name = "学生3";
		stu[2].age = 20;
		stu[2].className = "班级3";
		Management m = new Management();
		System.out.println("添加前：");
		m.show(stu);
		m.add(stu, "学生4", 21, "班级4");
		System.out.println("添加后：");
		m.show(stu);
		m.check(stu, 1, 4, "学生2", "班级2");
		m.check(stu, 1, 4, "学生2", "班级4");
	}
}
