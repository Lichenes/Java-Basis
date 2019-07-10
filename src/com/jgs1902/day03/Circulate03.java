package com.jgs1902.day03;

import java.util.Scanner;

//录入学生成绩 计算平均值
public class Circulate03 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double sum = 0;
		int num = cin.nextInt();
		System.out.println("录入"+num+"门成绩");
		for(int i=1; num<=5 ; i++){
			System.out.println("输入第"+i+"门成绩：");
			double s = cin.nextDouble();
			sum += s;
		}
		System.out.println("总成绩 = "+sum);
		double average = sum/num;
		System.out.println("平均分 = "+average);
		cin.close();
	}
}
