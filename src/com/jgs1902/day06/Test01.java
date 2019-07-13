package com.jgs1902.day06;

import java.util.Arrays;
import java.util.Scanner;

//输入10个成绩 去除最高分与最低分 求平均分
public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("输入10个分数");
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = cin.nextInt();
		}
		int max=0,min=arr[0],sum=0;
		double average;
		
/*		for(int j=0;j<arr.length;j++){
			sum += arr[j];
			if(max<arr[j]){
				max = arr[j];
			}else if(min>arr[j]){
				min = arr[j];
			}
		}
		average = ((double)(sum-max-min))/8;
		System.out.println("平均分 = "+average);*/
		
		Arrays.sort(arr);
		for(int j=1;j<arr.length-1;j++){
			sum += arr[j];
		}
		average = ((double)sum)/8;
		System.out.println("平均分 = "+average);
	}
}
