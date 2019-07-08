package com.jgs1902.test02;

public class Operator {
	public static void main(String[] args) {
		int a = 9;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(++a); //10 先赋值后运算
		System.out.println(--b); //1
		
		int a1 = 9;
		int b1 = 2;
		System.out.println(a1++); //9 先运算后赋值
		System.out.println(b1--); //2
		System.out.println(a1); //10
		System.out.println(b1); //1
		
		short s = 1;
		s = (short) (s+1); //需要手动强转换
		s += 1; // += 复合运算运算符 根据数据类型自动转换 
		
		int num = (a>b ? a : b);
		System.out.println("num = "+num);
	}
}
