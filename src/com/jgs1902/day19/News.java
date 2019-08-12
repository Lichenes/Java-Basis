package com.jgs1902.day19;

import java.util.ArrayList;
import java.util.List;

class New{
	private String title;
	private String author;
	private int id;
	
	public New() {
		
	}
	
	public New(int id,String title, String author) {
		this.title = title;
		this.author = author;
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "新闻编号" + id + ", 标题=" + title + ", 作者=" + author ;
	}
	
}

@SuppressWarnings({ "all"})
public class News{
	static List list = new ArrayList();
	static{
		list.add(new New(1001,"新闻1","作者1"));
		list.add(new New(1002,"新闻2","作者2"));
	}
	public boolean add(int id,String title,String author){
		New news = new New(id,author,title);
		if(list.contains(title)){
			return false;
		}
		return list.add(news);
	}
	public boolean remove(int index){
		return list.remove(list.toArray()[index]);
	}
	public void clear(){
		 list.clear();
		 System.out.println("清除成功!");
	}
	public void show(){
		int i = 0;
		for (Object object : list) {
			News news = (News)object;
			i++;
			System.out.println("序号"+i+", "+news.toString());
		}
	}
}

