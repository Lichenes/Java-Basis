package com.jgs1902.day03;

//偶数和
public class test02 {
	public static void main(String[] args) {
		int a,sum = 0;
		int i = 0;
	/*	while(i<=100){
			a = i%2;
			if(a == 0){
				sum += i;
			}
				i++;
		}
		System.out.println("偶数和:"+sum);
		*/
		
	/*	do {
			a = i%2;
			if(a == 0){
				sum += i;
			}
				i++;
		} while (i<= 100);
		System.out.println("偶数和:"+sum);
		*/
		
		for(;i<=100;i++){
			a = i%2;
			if(a == 0){
				sum += i;
			}
				i++;
		}
		System.out.println("偶数和:"+sum);
	}
}
