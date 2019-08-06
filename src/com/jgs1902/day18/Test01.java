package com.jgs1902.day18;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("请输入课程代号(1~3之间的数字)：");
			int i = cin.nextInt();
			if(i == 1){
				System.out.println("java课程");
			}else if(i == 2){
				System.out.println("C语言课程");
			}else if(i == 3){
				System.out.println("C++课程");
			}else{
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("输入错误！");
				}
			}
			System.out.println("欢迎提出建议！");
	}
}
