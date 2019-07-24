package com.jgs1902.day12;

/*class User{
	 String id;
	 String password;
	 String email;
	 public User(String id,String password,String email){
		 this.id = id;
		 this.password = password;
		 if(email == null){
			 this.email = id + "@gameschool.com";
		 }else{
			 this.email = email;
		 }
	 }
}*/

class User{
	String id;
	String password;
	String email;
	public User(String id,String password,String email){
		this.id = id;
		this.password = password;
		this.email = email;
	}
	public User(String id,String password){
		this.id = id;
		this.password = password;
		this.email = id + "@gameschool.com";
	}
}

public class Test03 {
	public static void main(String[] args) {
//		User u = new User("ltw","ltw970829",null);
		User u = new User("ltw","ltw970829","ltw@qq.com");
		System.out.println(u.id+" "+u.password+" "+u.email);
		u = new User("ltw","ltw970829");
		System.out.println(u.id+" "+u.password+" "+u.email);
	}
}

