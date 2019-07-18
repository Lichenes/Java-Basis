package com.jgs1902.day09;

import java.util.Scanner;

class Student1{
	String[] names = new String[]{"学生1","学生2","学生3","学生4","学生5"};
	int[] achievements = new int[]{100,80,60,58,57};
	public void show(){
		System.out.println("学生序号\t学生姓名\t学生成绩");
		for (int i = 0; i < names.length; i++) {
			System.out.println((i+1)+"\t"+names[i]+"\t"+achievements[i]);
		}
	}
	public void revise(Student1 s,int n){
		if(achievements[n]<60){
			s.achievements[n]+=2;
		}
	}
}

public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Student1 s = new Student1();
		s.show();
		System.out.println("输入修改序号：");
		int n = cin.nextInt();
		s.revise(s,n-1);
		System.out.println("修改后的成绩："+s.achievements[n-1]);
		cin.close();
	}
}
