package com.jgs1902.day14;

class Auto {
	int num;
	String color;
	int weight;
	double speed;
	public Auto(int num,String color,int weight,double speed){
		this.num = num;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	public void accelerate(){
		System.out.println("Auto加速！");
	}
	public void parking(){
		System.out.println("Auto停车！");
	}
	public void slow(){
		System.out.println("Auto减速！");
	}
	public void destory(){
		System.out.println("Auto坏掉！");
	}
}

class Car extends Auto{
	String CD;
	String airConditioning;
	public Car(int num, String color, int weight, double speed,String CD,String airairConditioning) {
		super(num, color, weight, speed);
		this.CD = CD;
		this.airConditioning = airairConditioning;
	}
	public void accelerate(){
		System.out.println("Car加速！");
	}
	public void parking(){
		System.out.println("Car停车！");
	}
	public void slow(){
		System.out.println("Car减速！");
	}
/*	public void destory(){
		
	}*/
}

public class Test02{
	public static void main(String[] args) {
		Auto a = new Auto(4, "红", 100, 100);
		a.accelerate();
		a.destory();
		Car c = new Car(4, "红", 100, 100, "开", "开");
		c.accelerate();
		c.destory();
		Auto b = new Car(4, "红", 100, 100, "开", "开");
		b.accelerate();
		b.destory();
		
	}
}