package com.jgs1902.day04;

import java.util.Scanner;

//循环录入成绩 统计大于80的人数 计算比例
public class Tcontinue {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int sum = 0, i = 1;
		while(i<=5){
			System.out.println("录入第"+i+"人的成绩：");
			int achievement = cin.nextInt();
			i++;
			if(achievement < 80){
				continue;
			}
			sum++;	
		}
		System.out.println("比例："+((double)sum/5)*100+"%");
		System.out.println(sum);
	}
}
