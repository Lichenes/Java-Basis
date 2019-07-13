package com.jgs1902.day06;

// 10个数 求偶数个数与偶数平均值
public class Test02 {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int sum=0,count=0;
		double average;
		for(int i=0 ;i<a.length;i++){
			if(a[i]%2 == 0){
				sum += a[i];
				count++;
			}
		}
		average = ((double)sum)/a.length;
		System.out.println("偶数个数 = "+count+" 平均值 = "+average);
	}
}
