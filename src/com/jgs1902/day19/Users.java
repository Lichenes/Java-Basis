package com.jgs1902.day19;

import java.util.HashMap;
import java.util.Map;

public class Users {
	static Map<String, String> map = new HashMap<>();
	static{
		map.put("admin", "123456");
		map.put("admin1", "123456");
	}
	public boolean check(String name,String pwd){
		if(map.containsKey(name) && map.get(name).equals(pwd)){
			return true;
		}
		return false;
	}
	public void add(String name,String pwd){
		if(map.containsKey(name)){
			System.out.println("账号名已存在!");
			return;
		}
		map.put(name,pwd);
		System.out.println("添加成功!");
	}
	public void remove(String name){
		if(map.containsKey(name)){
			map.remove(name);
			System.out.println("删除成功!");
		}
		System.out.println("删除失败!");
	}
	public void modification(String name,String pwd){
		if(check(name,pwd)){
			map.put(name, name);
			System.out.println("修改成功！");
		}else{
			System.out.println("账号名或密码错误!");
		}
	}
}
