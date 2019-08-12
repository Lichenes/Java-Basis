package com.jgs1902.day21;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int random = (int) ((Math.random()*9+1)*10);
		System.out.println(random);
		System.out.println("输入六位数卡号：");
		int id = cin.nextInt();
		int number = (id/100000)*10+id%10;
		System.out.println(number);
		if(number == random){
			System.out.println("中奖了！");
		}else{
			System.out.println("很遗憾！");
		}
	}
}
