package com.jgs1902.day05;

import java.util.Scanner;

//判断整数的位数
public class Test02 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("输入整数：");
		int a = cin.nextInt();
		int count = 0;
		while(a!=0){
			a/=10;
			count++;
		}
		System.out.println("一共有"+count+"位");
		cin.close();
	}
}
