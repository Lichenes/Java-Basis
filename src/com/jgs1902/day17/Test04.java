package com.jgs1902.day17;

import java.util.Scanner;

//定义共同的父类 动物类，有公共属性以及展示信息方法，分别定义狮子，斑马，海豚三个类，他们具有特定的属性，重写父类的方法展示所有信息，
//再定义游泳，进食，奔跑三个接口，三个类按照实际情况实现对应的接口，
//定义动物园类，分别展示每个动物的所有信息，和它们会的技能。
//定义测试类，模拟游玩动物园，决定去看哪种动物(使用键盘录入)，就展示哪种动物的所有信息，和它们会的技能。

abstract class Animal1{
	private String name;
	private int age;
	
	public Animal1(){
		
	}
	
	public Animal1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名："+name+",年龄："+age);
	}
	public abstract void skill();
}

interface Swim{
	public void swim();
}

interface Eat{
	public void eat();
}

interface Run{
	public void run();
}

class Lion extends Animal1 implements Eat,Run{

	public Lion(){
		
	}
	
	public Lion(String name, int age) {
		super(name, age);
	}

	public void run() {
		System.out.println("奔跑");
	}

	public void eat() {
		System.out.println("吃肉");
	}

	public void skill() {
		System.out.println("捕猎");
	}
	
}

class Zebra extends Animal1 implements Eat,Run{
	
	public Zebra(){
		
	}

	public Zebra(String name, int age) {
		super(name, age);
	}

	public void run() {
		System.out.println("奔跑");
	}

	public void eat() {
		System.out.println("吃草");
	}

	public void skill() {
		System.out.println("玩耍");
	}
	
}

class Puffer extends Animal1 implements Eat,Swim{
	
	public Puffer(){
		
	}

	public Puffer(String name, int age) {
		super(name, age);
	}

	public void swim() {
		System.out.println("游泳");
	}

	public void eat() {
		System.out.println("吃东西");
	}

	public void skill() {
		System.out.println("好看");
	}
	
}

class Zoo {
	public void show(Animal1 animal){
		if(animal instanceof Lion){
			animal= new Lion("狮子", 6);
			System.out.println("信息:");
			animal.show();
			System.out.println("技能：");
			((Lion)animal).eat();
			((Lion)animal).run();
			animal.skill();
		}else if(animal instanceof Zebra){
			animal = new Zebra("斑马", 6);
			System.out.println("信息:");
			animal.show();
			System.out.println("技能：");
			((Zebra)animal).eat();
			((Zebra)animal).run();
			animal.skill();
		}else{
			animal = new Puffer("河豚", 6);
			System.out.println("信息:");
			animal.show();
			System.out.println("技能：");
			((Puffer)animal).eat();
			((Puffer)animal).swim();
			animal.skill();
		}
	}
}

public class Test04 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Zoo zoo = new Zoo();
		System.out.println("选择你想看的动物信息(1.狮子 2.斑马 3.河豚)：");
		int select = cin.nextInt();
		if(select == 1){
			Lion l = new Lion();
			zoo.show(l);
		}else if(select == 2){
			Zebra z = new Zebra();
			zoo.show(z);
		}else{
			Puffer p = new Puffer();
			zoo.show(p);
		}
		cin.close();
	}
}
