package com.jgs1902.test02;

public class Exchange {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		
		//中间数运算
		/*int temp;
		temp = a;
		a = b;
		b = temp;*/
		
		//算术运算
		/*a = a-b;
		b = b+a;
		a = b-a;*/
		
		//位运算
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a ="+a+" b ="+b);
	}
}
