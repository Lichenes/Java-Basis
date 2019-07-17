package com.jgs1902.day08;

import java.util.Scanner;

class User{
	Scanner cin = new Scanner(System.in);
	String name = "admin1";
	String password = "111111";
	public int login(){
		String name;
		String password;
		System.out.println("请输入用户名：");
		name = cin.next();
		System.out.println("请输入密码：");
		password = cin.next();
		if(this.name.equals(name) && this.password.equals(password)){
			System.out.println("登录成功！");
			return 1;
		}else{
			System.out.println("用户名或密码不匹配！");
			return 0;
		}
	}
	public void pwd(){
			System.out.println("请重新输入新密码：");
			this.password = cin.next();
			System.out.println("修改成功！你的新密码为："+this.password);

	  	}
}

public class Test04 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		User u = new User();
		if(u.login() == 1){
			System.out.println("是否修改密码(y/n)：");
			String jugement = cin.next();
			if("y".equals(jugement)){
				u.pwd();
				System.out.println("请重新登录");
				u.login();
			}else{
				System.out.println("退出程序");
			}
		}
		
		/*String name;
		String password;
		do {
			System.out.println("请输入用户名：");
			name = cin.next();
			System.out.println("请输入密码：");
			password = cin.next();
			if(u.name.equals(name) && u.password.equals(password)){
				System.out.println("登录成功！");
				System.out.println("是否修改密码(y/n)：");
				String jugement = cin.next();
				if("y".equals(jugement)){
					System.out.println("请重新输入新密码：");
					u.password = cin.next();
					System.out.println("修改成功！你的新密码为："+u.password);
					}
				}else{
					System.out.println("用户名或密码不匹配！");
					break;
				}
		} while (true);*/
		cin.close();
	}
}
