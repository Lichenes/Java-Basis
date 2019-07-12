package com.jgs1902.day05;

//计算 1+2-3+4-5+6-7....+100的结果
public class Test03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i==1){
				sum += i;
			}else if( i%2 == 0){
				sum += i;
			}else{
				sum -= i;
			}
		}
		System.out.println("总和 = "+sum);
	}
}
