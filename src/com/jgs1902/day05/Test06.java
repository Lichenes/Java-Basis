package com.jgs1902.day05;

//给出50个数，1，2，4，7，11，„，其规律是：第1个数是1，第2个数比第1个数大1，第3个数比第2个数大2，第4个数比第3个数大3
public class Test06 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<50;i++){
			if(i+1==1){
				sum += 1;
			}else{
				sum += i;
			}
			System.out.print(sum+" ");
		}
	}
}
