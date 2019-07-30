package com.jgs1902.day16;
//实现思路,
//定义CPU的接口CPU ,返回CPU品牌和主频
//定义内存的接口EMS ,返回类型和容量
//定义硬盘的接口HardDisk ,返回容量
//编写各组件厂 商分别实现CPU、EMS和HardDisk接口
//编写计算机类,组装计算机并显示相关信息
//编写测试类运行

class Computer{
	String cpuBrand;
	String cpuFrequent;
	String emsType;
	String emsCapacity;
	String hardDisk;
	
	public Computer(){
		
	}
	
	public Computer(String cpuBrand, String cpuFrequent, String emsType, String emsCapacity, String hardDisk) {
		super();
		this.cpuBrand = cpuBrand;
		this.cpuFrequent = cpuFrequent;
		this.emsType = emsType;
		this.emsCapacity = emsCapacity;
		this.hardDisk = hardDisk;
	}
	
}

interface Cpu{
	public void brand();
	public void frequent();
}

interface Ems{
	public void type();
	public void capacity();
}

interface HardDisk{
	public void capacity1();
}

class Factory extends Computer implements Cpu,Ems,HardDisk{
	
	public Factory(){
		
	}

	public Factory(String cpuBrand, String cpuFrequent, String emsType, String emsCapacity, String hardDisk) {
		super(cpuBrand, cpuFrequent, emsType, emsCapacity, hardDisk);
	}

	public void type() {
		System.out.println("EMS类型:"+emsType);
	}

	public void capacity() {
		System.out.println("EMS容量:"+emsCapacity);
	}

	public void brand() {
		System.out.println("CPU品牌:"+cpuBrand);
	}

	public void frequent() {
		System.out.println("CPU主频:"+cpuFrequent);
	}

	public void capacity1() {
		System.out.println("HardDisk容量:"+hardDisk);
	}
	
}


public class Test02 {
	public static void main(String[] args) {
		Factory f = new Factory("Intel", "3.8GHz", "emsType", "3000GB", "4GB");
		f.brand();
		f.frequent();
		f.capacity();
		f.capacity1();
	}
}
