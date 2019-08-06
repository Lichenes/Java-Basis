package com.jgs1902.day18;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("输入10个分数");
		int[] arr = new int[10];
		int score;
		for(int i=0;i<arr.length;i++){
			try {
				score = cin.nextInt();
				if(score<0 || score > 10){
					arr[i] = 0;
					throw new Exception("分数错误！");
				}else{
					arr[i] = score;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int max=0,min=arr[0],sum=0;
		double average;
		Arrays.sort(arr);
		for(int j=1;j<arr.length-1;j++){
			sum += arr[j];
		}
		average = ((double)sum)/8;
		System.out.println("平均分 = "+average);
	}
}
