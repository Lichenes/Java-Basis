package com.jgs1902.day05;

import java.util.Scanner;

//插入数据 小到大
public class Array01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] arr = new int[5];
		arr[0] = 60;
		arr[1] = 70;
		arr[2] = 80;
		arr[3] = 90;
		System.out.println("输入插入数据：");
		int a = cin.nextInt();
		int index = 0;
		for(int i=0;i<arr.length;i++){
			if(a<arr[i]){
				index = i;
				break;
			}
		}
		for(int j=arr.length-1;j>index;j--){
			arr[j]=arr[j-1];
		}
		arr[index] = a;
		System.out.println("插入下标："+index);
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
		cin.close();
	}
}
