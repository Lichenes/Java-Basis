package com.jgs1902.day20;


public class Worker implements Comparable<Worker>{
	private String name;
	private int age;
	private int salary;
	public Worker() {
	}
	public Worker(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Worker worker) {
		if(this.age == worker.getAge()){
			return 0;
		}else if(this.age > worker.getAge()){
			return 1;
		}else{
			return -1;
		}
		
		
	}
}


