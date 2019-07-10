package com.jgs1902.day03;

import java.util.Scanner;

public class Choose {
	public static void main(String[] args) {		
		Scanner cin = new Scanner(System.in);
		System.out.println("请录入Java成绩：");
		double s = cin.nextDouble();
		System.out.println("请录入音乐成绩：");
		double s1 = cin.nextDouble();
		if(s>90 && s1>70){
			System.out.println("iphones6s");
		}else if(s==100 && s1>60){
			System.out.println("iphonesx");
		}else{
			System.out.println("蹲马步~~");
		}
		System.out.println("程序结束！");
		cin.close();
	}
}
