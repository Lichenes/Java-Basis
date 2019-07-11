package com.jgs1902.day04;

import java.util.Scanner;

//输出星期几
public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			System.out.println("输入数字(1~7),输入0退出：");
			int week = cin.nextInt();
			switch (week) {
			case 0:
				System.out.println("程序结束！");
				flag = false;
				break;
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入错误！请重新输入：");
				break;
			}
		}
	}
}
