package com.jgs1902.day11;

public class StaticDemo {
	int num = 50;
	static{
		StaticDemo test = new StaticDemo();
		test.num++;
		System.out.println(test.num);
	}
	static{
		StaticDemo test = new StaticDemo();
		test.num++;
		System.out.println(test.num);
	}
}
