package com.jgs1902.day17;

//设计一个系统 xxx饮料生产线 目前流程是 从某个地方把水取出来 然后经过缓冲 过滤 加热和放糖的步骤 
//抽象类水有取水的方法 
//接着定义interface 过滤{} interface 缓冲{} interface 加热{} interface 放糖{}
//然后创建纯净水类继承水，实现接口。
//在测试类打印出全流程

abstract class Water{
	public abstract void intake();
}

interface Filtration{
	public void filtration();
}

interface Buffer{
	public void buffer();
}

interface Warm{
	public void warm();
}

interface Sugar{
	public void sugar(); 
}

class ClearWater extends Water implements Filtration,Buffer,Warm,Sugar{

	public void sugar() {
		System.out.println("放糖...");
	}

	public void warm() {
		System.out.println("加热...");
	}

	public void buffer() {
		System.out.println("缓冲...");
	}

	public void filtration() {
		System.out.println("过滤...");
	}

	public void intake() {
		System.out.println("取水...");
	}
	
}

public class Test06 {
	public static void main(String[] args) {
		ClearWater c = new ClearWater();
		c.intake();
		c.filtration();
		c.buffer();
		c.warm();
		c.sugar();
	}
}
