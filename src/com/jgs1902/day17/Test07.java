package com.jgs1902.day17;

//小明有两个好友，一个是小张，喜欢吃川菜，打篮球，另一个是小王，喜欢吃比萨，踢足球。
//每当朋友来访的时候，小明都会按照各自的喜好来招待朋友们，使用多态来模拟以上需求

abstract class Friend{
	public abstract void eat();
	public abstract void play();
}

class Zhang extends Friend{

	public void eat() {
		System.out.println("一起吃川菜");
	}
	
	public void play() {
		System.out.println("一起打篮球");
	}
	
}

class Wang extends Friend{

	public void eat() {
		System.out.println("一起吃比萨");
	}

	public void play() {
		System.out.println("一起踢足球");
	}
	
}

public class Test07 {
	public static void main(String[] args) {
		System.out.println("小张的朋友来了：");
		Friend z = new Zhang();
		z.eat();
		z.play();
		System.out.println("小王的朋友来了：");
		Friend w = new Wang();
		w.eat();
		w.play();
	}
}
