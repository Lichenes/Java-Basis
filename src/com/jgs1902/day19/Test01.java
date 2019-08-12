package com.jgs1902.day19;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		News news = new News();
		Users user = new Users();
		RandomNumber random = new RandomNumber();
		int i;
		System.out.println("欢迎登录新闻管理系统!");
		while(true){
			System.out.println("请输入用户名:");
			String name = cin.next();
			System.out.println("请输入密码:");
			String pwd = cin.next();
			System.out.print("验证码:");
			String rd1 = random.random().toString();
			System.out.println(rd1);
			System.out.println("输入验证码：");
			String rd = cin.next();
			if(rd1.equals(rd)){
				if(user.check(name, pwd)){
					System.out.println("登录成功！");
					do {
						System.out.println("*******欢迎使用新闻管理系统*****");
						System.out.println("*******1.查看新闻********");
						System.out.println("*******2.添加新闻********");
						System.out.println("*******3.删除新闻********");
						System.out.println("*******4.删除所有新闻*****");
						System.out.println("*******5.添加管理员账号****");
						System.out.println("*******6.删除管理员账号****");
						System.out.println("*******7.修改密码********");
						System.out.println("*******8.退出系统********");
						System.out.println("请选择：");
						i = cin.nextInt();
						switch (i) {
						case 1:
							System.out.println("*******查看新闻********");
							news.show();
							break;
						case 2:
							System.out.println("*******添加新闻********");
							System.out.println("输入新闻编号：");
							int id = cin.nextInt();
							System.out.println("输入新闻标题:");
							String title = cin.next();
							System.out.println("输入新闻作者:");
							String author = cin.next();
							String rest = news.add(id, title, author) ? "添加成功!":"添加失败!";
							System.out.println(rest);
							break;
						case 3:
							System.out.println("*******删除新闻********");
							news.show();
							System.out.println("选择要删除新闻的序号:");
							int index = cin.nextInt();
							if(news.remove(index)){
								System.out.println("删除成功！");
							}
							break;
						case 4:
							System.out.println("*******删除所有新闻*****");
							news.clear();
							break;
						case 5:
							System.out.println("*******添加管理员账号****");
							System.out.println("请输入要添加的账号");
							name = cin.next();
							System.out.println("请输入要添加的密码");
							pwd = cin.next();
							user.add(name, pwd);
							break;
						case 6:
							System.out.println("*******删除管理员账号****");
							System.out.println("请输入要删除的账号");
							name = cin.next();
							user.remove(name);
							break;
						case 7:
							System.out.println("*******修改密码********");
							System.out.println("请输入要修改的账号");
							name = cin.next();
							System.out.println("请输入要修改的密码");
							pwd = cin.next();
							user.modification(name, pwd);
							break;
						case 8:
							System.out.println("欢迎使用~");
							System.exit(0);
							break;
						default:
							break;
						}
					} while (true);
				}else{
					System.out.println("账号名或密码错误!");
					System.out.print("重新");
				}
			}else{
				System.out.println("验证码输入错误！");
			}
			
		}
			
	}
}
