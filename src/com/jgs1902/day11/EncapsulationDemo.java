package com.jgs1902.day11;

class Person{
	//属性
		private String name;
		private String sex;
		private int age;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		//方法
		public void speak(){
			System.out.println("名字："+name+" 性别："+sex+" 年龄："+age);
		}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Lichenes");
		p.setAge(18);
		p.setSex("男");
		p.speak();
	}
}
