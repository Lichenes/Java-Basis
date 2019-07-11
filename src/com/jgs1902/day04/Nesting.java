package com.jgs1902.day04;

import java.util.Scanner;

// 嵌套循环：外层控住行数，内层控制列数
public class Nesting {
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//金字塔
		Scanner cin = new Scanner(System.in);
		System.out.println("输入金字塔层数：");
		int n = cin.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=0;k<(n-i);k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print(i);
			}
			System.out.println();
		}
		//乘法表
		System.out.println("输入乘法表：");
		int m = cin.nextInt();
	    for(int i=1; i<=m; i++){
	        for( int j=1; j<=i; j++){
	            System.out.print(i+"*"+j+"="+i*j+"  ");
	        }
	        System.out.println();
	    }
	    cin.close();
	}
}
