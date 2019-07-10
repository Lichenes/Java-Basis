package com.jgs1902.day03;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("录入学生成绩：");
		double speed = cin.nextDouble();
		if(speed < 10){
			System.out.println("录入学生性别：");
			String sex = cin.next();
			if("男".equals(sex)){
				System.out.println("进入男子决赛~");
			}else{
				System.out.println("进入女子决赛~");
			}
		}else{
			System.out.println("你被淘汰了~~~~");
		}
		cin.close();
	}
}
