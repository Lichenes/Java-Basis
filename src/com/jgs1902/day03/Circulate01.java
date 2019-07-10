package com.jgs1902.day03;

import java.util.Scanner;

public class Circulate01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean flag = true;
		int count = 1;
		while(flag){
			System.out.println("1.继续打印");
			System.out.println("2.结束循环");
			System.out.println("请选择");
			int i = cin.nextInt();
			switch (i) {
			case 1:
				System.out.println(count+".打印语句！");
				count++;
				break;
			case 2:
				flag = false;
				System.err.println("结束循环！");
				break;
			}
		}
		cin.close();
	}
}
	