package com.jgs1902.day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Student{
	private String name;
	private int age;
	private int score;
	public Student() {
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}

class MapDemo{
	static ArrayList<Student> arr = new ArrayList<>();
	static{
		arr.add(new Student("学生1", 18, 90));
		arr.add(new Student("学生2", 19, 91));
		arr.add(new Student("学生3", 20, 92));
		arr.add(new Student("学生4", 21, 93));
	}
	Map<Integer, Student> map = new HashMap<>();
	public void add(){
		for (int i = 0; i < arr.size(); i++) {
			map.put(i, (Student) arr.toArray()[i]);
		}
	}
	public void show(){
		Collection<Student> values = map.values();
		for (Student val : values) {
			System.out.println(val.toString());
		}
	}
}

public class Test03 {
	public static void main(String[] args) {
		MapDemo mp = new MapDemo();
		mp.add();
		mp.show();
	}
}
