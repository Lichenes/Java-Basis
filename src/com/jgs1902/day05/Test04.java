package com.jgs1902.day05;

//百钱买百鸡
public class Test04 {
	public static void main(String[] args) {
		for(int i=0;i<=20;i++){
			for(int j=0;j<=34;j++){
				int k = (100-i-j);
					if(k%3==0 && 5*i+3*j+k/3==100){
						System.out.println("公鸡 = "+i+" 母鸡 = "+j+" 小鸡 = "+k);
				}
			}
		}
	}
}
