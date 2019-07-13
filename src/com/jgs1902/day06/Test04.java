package com.jgs1902.day06;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("输入4家店的价格：");
		int[] pice = new int[4];
		for(int i=0;i<pice.length;i++){
			System.out.println("第"+(i+1)+"家价格：");
			pice[i] = cin.nextInt();
		}
		int min = pice[0];
		for(int j=0;j<pice.length;j++){
			if(min>pice[j]){
				min = pice[j];
			}
		}
		System.out.println("最低价格："+min);
		cin.close();
	}
}
