package com.jgs1902.day09;

// 对象数组的运用
class Student3{
	String name;
	int score;
	public void show(Student3[] s){
		for (Student3 s3 : s) {
			System.out.println(s3.name+"\t"+s3.score);
		}
	}
	public void revise(Student3[] s){
		for (Student3 s3 : s) {
			if(s3.score<60){
				s3.score+=2;
			}
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Student3[] stu = new Student3[2];
		stu[0] = new Student3();
		stu[0].name = "学生1";
		stu[0].score  = 18;
		stu[1] = new Student3();
		stu[1].name = "学生2";
		stu[1].score  = 19;
		Student3 s1 = new Student3();
		s1.revise(stu);
		s1.show(stu);
	}
}
