package com.jgs1902.day16;

abstract class Handset{
	String brand;
	String type;
	
	public Handset(String brand, String type) {
		super();
		this.brand = brand;
		this.type = type;
	}
	public abstract void sendInfo();
	public abstract void call();
	public abstract void info();
}

interface TheakePictures{
	public void takePictures();
}

interface Network{
	public void network();
}

interface PlayWiring{
	public void playWiring();
}

class AptitudeHandset extends Handset implements TheakePictures,Network,PlayWiring{

	public AptitudeHandset(String brand, String type) {
		super(brand, type);
	}
	
	public void show(){
		System.out.println("这是一款型号为"+type+"的"+brand+"手机");
	}
	
	public void network() {
		System.out.println("已经启动移动网络......");
	}

	public void takePictures() {
		System.out.println("咔嚓...拍照成功");
	}

	public void sendInfo() {
		System.out.println("发送带图片与文字的信息");
	}

	public void call() {
		System.out.println("开始视频通话");
	}

	public void info() {
		System.out.println("接受信息");
	}

	public void playWiring() {
		System.out.println("开始播放视频《小时代》......");
	}
	
}

class CommonHandset extends Handset implements PlayWiring{

	public CommonHandset(String brand, String type) {
		super(brand, type);
	}
	
	public void show(){
		System.out.println("这是一款型号为"+type+"的"+brand+"手机");
	}

	public void playWiring() {
		System.out.println("开始播放视频《热雪》......");
	}

	public void sendInfo() {
		System.out.println("发送带文字的信息");
	}

	public void call() {
		System.out.println("开始语音通话");
	}

	public void info() {
		System.out.println("接受信息");
	}
	
}
 
public class Test03 {
	public static void main(String[] args) {
		AptitudeHandset a = new AptitudeHandset("I9100", "HTC");
		a.show();
		a.network();
		a.playWiring();
		a.takePictures();
		a.sendInfo();
		a.call();
		CommonHandset c = new CommonHandset("索尼爱立信", "G502c");
		c.show();
		c.playWiring();
		c.sendInfo();
		c.call();
	}
}
