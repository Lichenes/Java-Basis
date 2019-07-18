package com.jgs1902.day09;

class Student{
	String[] name = new String[5];
	
	public void addName(String name){
		for (int i = 0; i < this.name.length; i++) {
			if(this.name[i] == null){
				this.name[i] = name;
				break;
			}
		}
	}
	public void showName(){
		System.out.println("学生姓名：");
		for(String name : this.name){
			if(name != null){
				System.out.println(name);
			}
		}
	}
	public boolean search(int start,int end,String name){
		boolean flag = false;
		for (int i = start-1; i < end; i++) {
			if(name.equals(this.name[i])){
				flag =true;
			}
		}
		return flag;
	}
}

public class StudentInfo {
	public static void main(String[] args) {
		Student s = new Student();
		s.addName("张三");
		s.addName("李四");
		s.addName("王五");
		s.showName();
		int e =4;
		boolean res=s.search(1, e, "李四");
		if(res == true){
			System.out.println("找到了！");
		}else{
			System.out.println("没找到！");
		}
	}
}
