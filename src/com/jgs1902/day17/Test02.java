package com.jgs1902.day17;

//电脑主机上有一个3.0USB接口，现在有 U盘 鼠标 移动硬盘。模拟在电脑主机上分别插入使用的情况

interface Usb{
	public void service();
}

class UDisk implements Usb{

	public void service() {
		System.out.println("接入了U盘，可以读取数据");
	}

}

class Mouse implements Usb{

	public void service() {
		System.out.println("接入鼠标，移动鼠标");
	}
	
}

class Hhd implements Usb{

	public void service() {
		System.out.println("接入了移动硬盘，可以传输数据");
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		Usb u =new UDisk();
		u.service();
		Usb m = new Mouse();
		m.service();
		Usb h = new Hhd();
		h.service();
	}
}
