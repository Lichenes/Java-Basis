package com.jgs1902.day11;

import java.util.Scanner;

//模拟实现选民投票过程:一-群选民进行投票，每个选民只允许投一次票,并且当投票总数达到100时,就停止投票
class Voter{
	private String name ;
	private static int num = 0;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void vote(){
		if(num == 100){
			System.out.println("投票结束！");
		}else{
			num++;
			System.out.println(this.name+"投票成功");
			System.out.println("当前票数："+num);
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Voter v = new Voter();
		boolean flag =true ;
		while(flag){
			System.out.print("输入投票人：");
			String name = cin.next();
			v.setName(name);
			v.vote();
			System.out.print("是否继续投票：");
			String juge =cin.next();
			if("n".equals(juge)){
				flag =false;
			}
		}
		
	}
}
