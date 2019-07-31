package com.jgs1902.day17;

//创建一个名称为Vehicle的接口 在接口中添加两个方法start()和stop()。
//在两个名称分别为Bike和Bus的类中实现Vehicle接口。
//创建一个名称为InterfaceDemo的类 在InterfaceDemo的main()方法中创建Bike和Bus对象 并访问start()和stop()方法。

interface Vechicle{
	public void start();
	public void stop();
}

class Bike implements Vechicle{

	public void start() {
		System.out.println("自行车启动");
	}

	public void stop() {
		System.out.println("自行车停车");
	}
	
}

class Bus implements Vechicle{

	public void start() {
		System.out.println("汽车启动");
	}

	public void stop() {
		System.out.println("汽车停车");
	}
	
}

public class Test05 {
	public static void main(String[] args) {
		Vechicle bike = new Bike();
		bike.start();
		bike.stop();
		Vechicle bus = new Bus();
		bus.start();
		bus.stop();
	}
}
