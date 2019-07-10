package com.jgs1902.day03;

import java.util.Scanner;

public class Circulate02 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i = 1;
		System.out.println("学习任务：");
		System.out.println("上午阅读教材，学习理论部分");
		System.out.println("下午上机编程，掌握代码部分");
		do {
			if(i == 1) {
				System.out.println("上午学习是否合格：");
				String str = cin.next();
				if("合格".equals(str)){
					i=2;
					System.out.println("开始学习下午内容！");
				}else{
					i=1;
					System.out.println("继续学习！");
				}
			}else if( i == 2){
				System.out.println("下午学习是否合格：");
				String str = cin.next();
				if("合格".equals(str)){
					i=3;
					System.out.println("今天学习任务完成！");
				}else{
					i=2;
					System.out.println("继续学习！");
				}
			}
		} while (i == 1 || i== 2);
		cin.close();
	}
}
