package com.jgs1902.day03;

import java.util.Scanner;

//猜数字
public class Random02 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int random = (int) (Math.random()*10);
		int count = 1;
		boolean flag;
		/*while(flag){
			System.out.println("输入猜测数字：");
			int i = cin.nextInt();
			if(i>random){
				System.out.println("数字猜大~");
				count++;
			}else if(i < random){
				System.out.println("数字猜小~");
				count++;
			}else{
				flag = false;
				System.out.println("猜测次数 = "+count);
				System.err.println("猜正确了！");
			}
		}*/
		do {
			System.out.println("输入猜测数字：");
			int i = cin.nextInt();
			if(i>random){
				System.out.println("数字猜大~");
				count++;
				flag = true;
			}else if(i < random){
				System.out.println("数字猜小~");
				count++;
				flag = true;
			}else{
				flag = false;
				System.out.println("猜测次数 = "+count);
				System.err.println("猜正确了！");
			}
		} while (flag);
		cin.close();
	}
}
