package com.jgs1902.day20;

import java.util.ArrayList;
import java.util.Collections;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<>();
		int number,score;
		for (int i = 0; i < 10; i++) {
			number = 20118001+i;
			score = 10-i;
			arr.add(new Student(number, score));
		}
		Collections.sort(arr);
		for (Student student : arr) {
			System.out.println(student.toString());
		}
	}
}
