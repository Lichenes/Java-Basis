package com.jgs1902.day11;

import java.util.Scanner;

//使用封装实现电子宠物系统的企鹅类正确输入健康值和亲密度
//保证健康值的有效性( 0-100 ) ,否则取默认值60 
//保证亲密度的有效性( 0-100 ) ,否则取默认值60
class Dog{
	private String name;
	private int health;
	private int intimacy;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health>=0 && health<=100){
			this.health = health;
		}else{
			this.health = 60;
			System.out.println("健康值应该在0到100之间，否则默认为60");
		}
	}
	public int getIntimacy() {
		return intimacy;
	}
	public void setIntimacy(int intimacy) {
		if(intimacy>=0 && intimacy<=100){
			this.intimacy = intimacy;
		}else{
			this.intimacy = 60;
			System.out.println("亲密度应该在0到100之间，否则默认为60");
		}
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void show(){
		System.out.println("我的名字叫"+name+",健康值是"+health+",和主人的亲密度是"+intimacy+"我的性别是:"+sex+".");
	}
}

class Penguin{
	private String name;
	private int health;
	private int intimacy;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health>=0 && health<=100){
			this.health = health;
		}else{
			this.health = 60;
			System.out.println("健康值应该在0到100之间，否则默认为60");
		}
	}
	public int getIntimacy() {
		return intimacy;
	}
	public void setIntimacy(int intimacy) {
		if(intimacy>=0 && intimacy<=100){
			this.intimacy = intimacy;
		}else{
			this.intimacy = 60;
			System.out.println("亲密度应该在0到100之间，否则默认为60");
		}
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void show(){
		System.out.println("我的名字叫"+name+",健康值是"+health+",和主人的亲密度是"+intimacy+"我的性别是:"+sex+".");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Dog d = new Dog();
		Penguin p = new Penguin();
		String name1;
		System.out.println("欢迎你来到宠物店！");
		System.out.print("请输入想要领养的宠物的名字：");
		String name = cin.next();
		System.out.print("请选择要领养的宠物类型：(1.狗狗 2.企鹅)");
		int num = cin.nextInt();
		if(num == 1){
			name1 = "狗狗";
			d.setName(name);
		}else{
			name1 = "企鹅";
			p.setName(name);
		}
		System.out.print("请选择"+name1+"的性别：(1.Q仔 2.Q妹)");
		int num1 = cin.nextInt();
		if(num1 == 1 && num == 1){
			d.setSex("Q仔");
		}else if(num1 == 1 && num ==2){
			p.setSex("Q仔");
		}else if(num1 == 2 && num == 1){
			d.setSex("Q妹");
		}else{
			p.setSex("Q妹");
		}
		System.out.print("请输入"+name1+"健康值：(0~100)");
		int health = cin.nextInt();
		if(num == 1){
			d.setHealth(health);
		}else{
			p.setHealth(health);
		}
		System.out.print("请输入"+name1+"亲密度：(0~100)");
		int intimacy = cin.nextInt();
		if(num == 1){
			d.setIntimacy(intimacy);
		}else{
			p.setIntimacy(intimacy);
		}
		System.out.println("宠物自白：");
		if(num == 1){
			d.show();
		}else{
			p.show();
		}
	}
}
