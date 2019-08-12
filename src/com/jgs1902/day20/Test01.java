package com.jgs1902.day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Worker worker1 = new Worker("張三",30,6000);
		Worker worker2 = new Worker("李四",31,6100);
		Worker worker3 = new Worker("王五",32,6200);
		ArrayList<Worker> list = new ArrayList<>();
		list.add(worker1);
		list.add(worker2);
		list.add(worker3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.toArray()[i].toString());
		}
		System.out.println("***********************");
		list.add(1,new Worker("赵六", 22, 5000));
		for (Worker worker : list) {
			System.out.println(worker.toString());
		}
		System.out.println("***********************");
		list.remove(worker2);
		Iterator<Worker> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		System.out.println("***********************");
		Collections.sort(list);
		for (Worker worker : list) {
			System.out.println(worker.toString());
		}
	}
}
