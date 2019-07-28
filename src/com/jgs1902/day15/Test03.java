package com.jgs1902.day15;

abstract class Goods{
	 int price;
	 
	
	public Goods(int price) {
		super();
		this.price = price;
	}

	public abstract void funtion();

}

class TVs extends Goods{

	public TVs(int price) {
		super(price);
	}

	public void funtion() {
		System.out.println("看电视");
	}
	
	public String toString(){
		return "TVs ="+price;
	}
}

class Foods extends Goods{

	public Foods(int price) {
		super(price);
	}

	public void funtion() {
		System.out.println("当食材");
	}
	public String toString(){
		return "Foods ="+price;
	}
}

class Master2{
	public Goods select(Goods goods){
		if(goods instanceof TVs){
			goods.funtion();
		}else{
			goods.funtion();
		}
		return goods;
	}
}

public class Test03 {
	public static void main(String[] args) {
		Master2 m2 = new Master2();
		Goods t = new TVs(6000);
		System.out.println(t);
		m2.select(t);
		Goods f = new Foods(100);
		System.out.println(f);
		m2.select(f);
	}
}
