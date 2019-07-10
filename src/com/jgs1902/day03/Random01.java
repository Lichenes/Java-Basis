package com.jgs1902.day03;

import java.util.Scanner;

public class Random01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("请输入四位数的卡号：");
		int cardNo = cin.nextInt();
		System.out.println("输入卡号："+cardNo);
		int baiWei = cardNo/100%10;
		int Random = (int) (Math.random()*10);
		System.out.println("随机数 = "+Random);
		if(baiWei == Random){
			System.out.println("恭喜你，幸运会员！");
		}else{
			System.out.println("很遗憾~~~~");
		}
		cin.close();
	}
}
