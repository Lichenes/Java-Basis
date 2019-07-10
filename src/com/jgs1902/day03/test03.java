package com.jgs1902.day03;

//猴子吃桃，一只猴子每天吃一半加一个，10天，只剩一个桃
public class test03 {
	public static void main(String[] args) {
		int sum = 1;
		for(int i=1;i<10;i++){
			sum = (sum+1)*2;
		}
		System.out.println("桃子数 = "+sum);
	}
}
