package com.jgs1902.day04;

import java.util.Scanner;

//循环录入5门学科成绩 小于0重新输入 直到输入正确
public class Tbreak {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i = 1;
		System.out.println("输入学生姓名：");
		String name = cin.next();
		while(true){
			if(i>5){
				System.out.println("录入完成！");
				break;
			}else{
				System.out.println("录入第"+i+"学科成绩：");
				int achievement = cin.nextInt();
				while(true){
						if(achievement<0){
						System.out.println("成绩录入错误！请重新录入：");
						 achievement = cin.nextInt();
					}else{
						break;
					}
				}
			}
			i++;
		}
	}
}
