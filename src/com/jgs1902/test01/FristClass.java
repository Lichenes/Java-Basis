package com.jgs1902.test01;

public class FristClass {
	
	static byte a; //byte = 0
	static short b; //short = 0
	static int c; //int = 0
	static long d; //long = 0L
	static float e; //float = 0.0f
	static double f; //double = 0.0d
	static char g; //char = '/u0000' 如果打印出来是一个空格
	static boolean h; // boolan = false
	public static void main(String[] args){
		System.out.println("我的第一个Java类!");
		System.out.println("Hello World!");
		
		System.out.println("byte = "+a+" short = "+b+" int = "+c+" long = "+d+" float = "+e+" double = "+f+" char = "+g+" boolean = "+h);
	} 
}
