package com.jgs1902.test02;

import java.util.Scanner;//工具包

public class Input {
	public static void main(String[] args) {
		//输入函数
		Scanner cin = new Scanner(System.in);
		System.out.println("请输入四位数的卡号：");
		int cardNo = cin.nextInt();
		System.out.println("输入卡号："+cardNo);
		int geWei = cardNo%10;
		int shiWei = cardNo/10%10;
		int baiWei = cardNo/100%10;
		int qianWei = cardNo/1000;
		int sum = geWei+shiWei+baiWei+qianWei;
		System.out.println("卡号数之和："+sum);
		System.out.println("千位="+qianWei+" 百位="+baiWei+" 十位="+shiWei+" 个位="+geWei);
		String res = sum > 20 ? "中奖了！" : "很遗憾~~~";
		System.out.println(res);
		cin.close();
	}
}
