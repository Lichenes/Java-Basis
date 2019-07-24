package com.jgs1902.day12;

class User1{
	String id;
	String password;
	public User1(String id,String password){
		this.id = id;
		this.password = password;
	}
}

class UserEmail extends User1{
	String email;
	public UserEmail(String id,String password,String email){
		super(id, password);
		this.email = email;
	}

	public void show(){
		System.out.println(this.id+" "+this.password+" "+this.email);
	}
}

public class Test04 {
	public static void main(String[] args) {
		UserEmail u = new UserEmail("123456", "123456", "123456@qq.com"); 
		u.show();
	}
}
