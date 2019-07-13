package com.jgs1902.day06;

import java.util.Arrays;
import java.util.Scanner;

//排序 0全排前面 其余数字 按大到小排序
public class Test03 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("输入数据个数：");
		int n = cin.nextInt();
		System.out.println("输入数据：");
		int[] a = new int[n];
		int count = 0;
		for(int i=0;i<n;i++){
			a[i] = cin.nextInt();
			if(a[i] == 0){
				count++;
			}
		}
		Arrays.sort(a);
		System.out.println("输出数据：");
		for(int i=0;i<count;i++){
			System.out.print(+a[i]+" ");
		}
		for(int j=a.length-1;j>=count;j--){
			System.out.print(a[j]+" ");
		}
		cin.close();
	}
}
