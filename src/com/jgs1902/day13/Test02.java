package com.jgs1902.day13;

//一个整数，大于0，不用循环和本地变量，按照n, 2n, 4n, 8n的顺序递增，
//当值大于5000一个整数，大于0，不用循环和本地变量，按照n, 2n, 4n, 8n的顺序递增，当值大于5000
public class Test02 {
	public static void main(String[] args) {
		System.out.println("n = "+recursion(1,1));
	}

	public static int recursion(int n,int i) {
		if(n<=0){
			return 0;
		}else if(n*i > 5000){
			
			return n*i ;
		}else{
			System.out.println("n = "+(n*i));
			return recursion(n, i*2);
		}
	}
}
