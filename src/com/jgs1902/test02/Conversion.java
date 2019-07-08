package com.jgs1902.test02;

public class Conversion {
	public static void main(String[] args) {
//		byte b = 100;
//		int i = b;
		//大转小 强制转换
		int i = 500;
		byte b = (byte)i;
		System.out.println(b);
		
		char c = '在';
		int a = c;
		
		char c1 = (char)100;
		System.out.println(c1);
	}
}
