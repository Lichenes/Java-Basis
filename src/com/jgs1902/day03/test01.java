package com.jgs1902.day03;

//水仙花数
public class test01 {
	public static void main(String[] args) {
		int a,b,c;
		for(int i=100;i<1000;i++){
			 a = i%10;
			 b = i/10%10;
			 c = i/100%10;
			 if(i == a*a*a +b*b*b +c*c*c){
				 System.out.println("水仙花数："+i);
			 }
		}
	}
}
