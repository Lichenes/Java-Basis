package com.jgs1902.day04;

import java.util.Scanner;

//循环录入5门学科成绩 小于0重新输入 直到输入正确
public class Tbreak {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("输入学生姓名：");
		String name = cin.next();
		double sum = 0;
		for(int i=1;i<=5;i++){
			System.out.println("录入第"+i+"学科成绩：");
			int achievement = cin.nextInt();
			while(true){
				if(achievement<0){
				System.out.println("成绩录入错误！请重新录入：");
				 achievement = cin.nextInt();
				}else{
					sum += achievement;
					break;
				}
			}
		}
		System.out.println("录入完成！");
		System.out.println("姓名："+name);
		System.out.println("平均分 = "+(sum/5));
	}
}
