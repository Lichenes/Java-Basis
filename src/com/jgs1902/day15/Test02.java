package com.jgs1902.day15;

abstract class Pet1{

}

class Dog1 extends Pet1{

	public void play() {
		System.out.println("接飞盘");
	}
	
}

class Penguin1 extends Pet1{

	public void play() {
		System.out.println("游泳");
	}
	
}
class Master1{
	public void player(Pet1 pet){
		if(pet instanceof Dog1){
			((Dog1) pet).play();
		}else{
			((Penguin1)pet).play();
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Master1 m1 = new Master1();
		Pet1 d = new Dog1();
		m1.player(d);
		Pet1 p = new Penguin1();
		m1.player(p);
	}
}
