package com.jgs1902.day10;

import java.util.Scanner;

//创建学生类，属性有姓名，年龄，成绩。有展示信息方法
class Student{
	String name;
	int age;
	int score;
	public void show(){
		System.out.print("姓名:"+name+"  年龄:"+age+"  成绩:"+score);
	}
}

//创建信息管理类
class Management{
	//定义添加学员方法可以将学员添加到数组中
	public void add(Student[][] s,Student s1){
		a:for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				if(s[i][j] == null){
					s[i][j] = new Student();
					s[i][j].name = s1.name;
					s[i][j].age = s1.age;
					s[i][j].score = s1.score;
					System.out.println("添加成功！");
					break a;
				}
			}
		}
	}
	//定义查看所有学员信息方法可以查看学员的所有信息以及班级和下标,
	public void show(Student[][] s){
		for (int i = 0; i < s.length; i++) {
			System.out.println("班级"+(i+1)+":");
			for (int j = 0; j < s[i].length; j++) {
				if(s[i][j] != null && s[i][j].name != null){
					s[i][j].show();
					System.out.println("  下标"+(j+1));
				}
			}
		}
	}
	//定义删除方法可以通过班级和下标来删除学员，判断当前输入的班级和下标位置不为空才可以删除
	public void delete(Student[][] s,String className,int index){
		if("null".equals(className) && index>=1 && index <=5){
			System.out.println("输入错误");
		}else if("班级1".equals(className)){
				s[0][index-1].name = null;
				s[0][index-1].age = 0;
				s[0][index-1].score = 0;
				System.out.println("删除成功!");
		}else if("班级2".equals(className)){
			s[1][index-1].name = null;
			s[1][index-1].age = 0;
			s[1][index-1].score = 0;
			System.out.println("删除成功!");
		}else if("班级3".equals(className)){
			s[2][index-1].name = null;
			s[2][index-1].age = 0;
			s[2][index-1].score = 0;
			System.out.println("删除成功!");
		}
	}
}

//创建测试类
//编写系统选择界面(循环界面展示，直到退出为止) 
//1.使用键盘录入学员信息(每次录入一个)
//2.查看所有学员信息
//3.删除指定学员信息(输入班级和下标)
//4.退出系统
//否则给出提示
//创建数组用于存放所有学员信息(二维或多个一维)
//共有3个班级每个班级5名学员
public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Student[][] stu = new Student[3][5];
		Student s = new Student();
		Management m = new Management();
		int num;
		do {
			System.out.println("***********************");
			System.out.println("1.录入信息");
			System.out.println("2.查看信息");
			System.out.println("3.删除信息");
			System.out.println("4.退出系统");
			System.out.println("***********************");
			System.out.print("请选择:");
			int choose = cin.nextInt();
			boolean flag = true;
			switch (choose) {
			case 1:
				System.out.println("********录入信息********");
				do {
					System.out.print("输入学生姓名：");
					s.name = cin.next();
					System.out.print("输入学生年龄：");
					s.age = cin.nextInt();
					System.out.print("输入学生成绩：");
					s.score = cin.nextInt();
					m.add(stu, s);
					System.out.print("是否继续添加(y/n)：");
					String check = cin.next();
					if("n".equals(check)){
						flag =false;
					}
				} while (flag);
				break;
			case 2:
				System.out.println("********查看信息********");
				m.show(stu);
				break;
			case 3:
				System.out.println("********删除信息********");
				System.out.print("输入班级:");
				String className = cin.next();
				System.out.print("输入下标：");
				int index = cin.nextInt();
				m.delete(stu, className, index);
				break;
			default:
				break;
			}
			if(choose <1 || choose>3){
				break;
			}else{
				System.out.println("输入0返回：");
				num = cin.nextInt();
			}
		} while (num == 0);
		System.out.println("谢谢使用~~");
		cin.close();
	}
}
