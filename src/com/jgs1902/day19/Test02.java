package com.jgs1902.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		int  totalRecord  = list.size();
		final int pageSize = 5;
		int totalPage = totalRecord % pageSize;
		if(totalPage > 0){
			totalPage = totalRecord / pageSize +1;
		}else{
			totalPage = totalRecord / pageSize;
		}
		List<Integer> data = new ArrayList<Integer>();
		data = list.subList(0, 5);
		int page = 1;
		int pages = 1;
		int prepage= 0,nextpage = 1;
		System.out.println("***************************");
		for (Integer integer : data) {
			System.out.println("数据:"+integer);
		}
		System.out.println("当前页数："+pages);
		System.out.println("页数:"+1+"\t"+2+"\t"+3+"\t"+4+"\t总页数："+totalPage);
		System.out.println("输入要跳转的页数：");
		page = cin.nextInt();
		if(page <= totalPage){
			pages = page;
			prepage = (pages-1)*pageSize;
			nextpage = pages*pageSize;
		}else{
			System.out.println("输入错误！");
		}
		do {
			data = list.subList(prepage, nextpage);
			System.out.println("***************************");
			for (Integer integer : data) {
				System.out.println("数据:"+integer);
			}
			System.out.println("输入上一页/下一页换页:");
			String rest = cin.next();
			if("上一页".equals(rest) && pages >0){
				pages --;
			}else if("下一页".equals(rest) && pages<totalPage){
				pages++;
			}else{
				System.out.println("输入错误!");
			}
			prepage = (pages-1)*pageSize;
			nextpage = pages*pageSize;
		} while (true);
		
	}
}
