package com.jgs1902.day05;

import java.util.Arrays;
import java.util.Scanner;

//判断三角形
public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("输入三角形三边：");
		int[] a= new int[3];
		int i = 0;
		while(i<3){
			a[i] = cin.nextInt();
			i++;
		}
		Arrays.sort(a);
		if(a[0]+a[1]>a[2]){
			if(a[0]*a[0] + a[1]*a[1] == a[2]*a[2]){
				System.out.println("三角形为直角三角形！");
			}else if(a[0]*a[0] + a[1]*a[1] > a[2]*a[2]){
				System.out.println("三角形为钝角三角形！");
			}else if(a[0]*a[0] + a[1]*a[1] < a[2]*a[2]){
				System.out.println("三角形为锐角三角形！");
			}
		}else{
			System.out.println("不能构成三角形！");
		}
		
		cin.close();
	}
}
