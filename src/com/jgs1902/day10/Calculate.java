package com.jgs1902.day10;

class Calculater{
	public int Calculater1(int a,int b){
		return a+b;
	}
	public double Calculater1(double a,double b,double c){
		return a+b+c;
	}
}

public class Calculate {
	public static void main(String[] args) {
		Calculater c = new Calculater();
		int a=c.Calculater1(1, 2);
		System.out.println(a);
		double b=c.Calculater1(1.1, 2.2,3.3);
		System.out.println(b);
	}
}
