package com.jgs1902.day03;

import java.util.Scanner;

// 输入：姓名，年龄，输出：姓名，年龄，票价(100 18~60 其他半价) N结束
public class test04 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean flag;
		do {
			System.out.println("输入姓名(输入N结束)：");
			String name = cin.next();
			if("N".equals(name)){
				flag = false;
				System.out.println("输入结束！");
			}else{
				System.out.println("输入年龄：");
				int age = cin.nextInt();
				System.out.println("姓名："+name);
				System.out.println("年龄："+age);
				if(age >= 18 && age <=60){
					System.out.println("票价 = 100");
				}else{
					System.out.println("票价 = 50");
				}
				flag = true;
			}
		} while (flag);
		cin.close();
	}
}
