package com.jgs1902.day20;

public class Student implements Comparable<Student>{
	private int number;
	private int score;
	public Student() {
		super();
	}
	public Student(int number, int score) {
		super();
		this.number = number;
		this.score = score;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String toString() {
		return "Student [number=" + number + ", score=" + score + "]";
	}
	public int compareTo(Student s) {
		if(this.score == s.getScore()){
			return 0;
		}else if(this.score > s.getScore()){
			return 1;
		}
		return -1;
	}
	
}
