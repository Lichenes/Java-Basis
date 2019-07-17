package com.jgs1902.day08;

import java.util.Scanner;

/**
 * 订餐系统
 * @author Lichenes
 *
 */
public class Test01 {
	public static void main(String[] args) {
		//数据主体：订餐信息
		String[] names = new String[4]; //订餐人
		String[] dishMegs = new String[4]; //锁定餐品信息
		int[] times = new int[4]; //送餐时间
		String[] addresses = new String[4]; //送餐地址
		int[] states = new int[4]; //订餐状态 0：已预订 1：已完成
		double[] sumPrices = new double[4]; //总金额
		
		//初始化2条订单信息
		names[0] = "张三";
		dishMegs[0] = "鱼香肉丝 1份";
		times[0] = 12 ;
		addresses[0] = "hf";
		states[0] = 0;
		sumPrices[0] = 24.0;
		
		names[1] = "李四";
		dishMegs[1] = "红烧带鱼 2份";
		times[1] = 12 ;
		addresses[1] = "hf";
		states[1] = 1;
		sumPrices[1] = 76.0;
		
		//数据主体：一组餐品信息
		String[] dishNames = {"红烧带鱼","鱼香肉丝","时令蔬菜"};//菜名
		double[] prices = new double[]{38.0,20.0,10.0};//菜价
		int[] praiseNums = new int[]{1,0,1};
		String[] evaluations = {"还行","无","不错"};
		
		Scanner cin = new Scanner(System.in);
		//循环(do-while)
		int num;
		do{
			System.out.println("***********************");
			System.out.println("1.查看餐品");
			System.out.println("2.我想订餐");
			System.out.println("3.查看餐袋");
			System.out.println("4.签收订单");
			System.out.println("5.删除订单");
			System.out.println("6.我要点赞");
			System.out.println("7.退出系统");
			System.out.println("***********************");
			System.out.println("请选择：");
			int choose = cin.nextInt();
			boolean isAdd = true; //是否找到插入位置
			switch (choose) {
			case 1:
				System.out.println("********查看餐品*********");
					System.out.println("序号\t餐品名\t单价\t点赞数\t评价");
					for(int j=0;j<dishNames.length;j++){
						String price = prices[j] + "元";
						String praise = praiseNums[j] + "赞";
						System.out.println((j+1)+"\t"+dishNames[j]+"\t"+price+"\t"+praise+"\t"+evaluations[j]);
					}
				break;
			case 2:
				System.out.println("********订餐********");
				int chooseDish;
				int[] number=new int[10];
				int n = 0;
				String dishMeg[] = new String[3];
				boolean order = true;
				for(int i=0;i<names.length;i++){//查询餐袋
					if(names[i] == null){
						isAdd = false;
						//插入信息
						System.out.println("序号\t餐品名\t单价\t点赞数\t评价");
						for(int j=0;j<dishNames.length;j++){
							String price = prices[j] + "元";
							String praise = praiseNums[j] + "赞";
							System.out.println((j+1)+"\t"+dishNames[j]+"\t"+price+"\t"+praise+"\t"+evaluations[j]);
						}
						do {
							System.out.print("请选择所选餐品序号：");
							 chooseDish = cin.nextInt();
							System.out.print("请选择所选份数：");
							 number[n] = cin.nextInt();
							 dishMeg[n] = dishNames[chooseDish - 1]+" "+number[n]+"份";//订餐信息
							System.out.print("是否继续点餐：");
							String order1 = cin.next();
							if("否".equals(order1)){
								order = false;
							}
							n++;
						} while (order);
						
						System.out.print("请输入订餐人姓名：");
						String name = cin.next();
						System.out.print("请输入订餐时间(10~20整点):");
						int time =cin.nextInt();
						while(time<10||time>20){
							System.out.print("你的输入有误(10~20整数):");
							time = cin.nextInt();
						}
						System.out.print("输入送餐地址：");
						String address = cin.next();
						double sumPrice = 0;
						for(int m=0;m<n;m++){
							sumPrice += prices[m] * number[m];
						}
						double deliCharge = sumPrice>=50? 0.0:6.0; //送餐费
						System.out.println("订餐成功！");
						System.out.print("你所订的是：");
						for(int k=0;k<n;k++){
							System.out.print(dishMeg[k]+" ");
						}
						System.out.println();
						System.out.println("订餐人："+name);
						System.out.println("送餐时间："+time+"点");
						System.out.println("送餐地址："+address);
						System.out.println("餐费："+sumPrice+" 送餐费："+deliCharge+"元");
						System.out.println("总金额："+(sumPrice+deliCharge)+"元");
						//添加数据
						names[i]= name;
						for(int k=0;k<n;k++){
							if(k == 0){
								dishMegs[i] = dishMeg[k];
							}else{
								dishMegs[i] = dishMegs[i]+","+dishMeg[k];
							}	
						}
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = (sumPrice+deliCharge);
						break;
					}
				}
				if(isAdd){
					System.out.println("对不起，餐袋已满！");
				}
				break;
			case 3:
				System.out.println("********查看餐袋********");
				System.out.println("序号\t\t订餐人\t\t所定餐品信息\t\t订餐时间\t\t送餐地址\t\t总金额\t\t状态");
				for(int i=0;i<names.length;i++){
					if(names[i] == null){
						break;
					}else{
						String state = states[i] == 0 ? "已预订":"已完成";
						System.out.println((i+1)+"\t\t"+names[i]+"\t\t"+dishMegs[i]+"\t\t"+times[i]+"点"+"\t\t"+addresses[i]+"\t\t"+sumPrices[i]+"元"+"\t\t"+state);
					}
				}
				break;
			case 4:
				System.out.println("********签收餐袋********");
				System.out.print("请输入要签收的订单序号：");
				boolean isFind = false;
				int signOrderId = cin.nextInt();
				for(int i=0;i<names.length;i++){
					if(names[i] != null && states[i]==1 && signOrderId == i+1){
						System.out.println("对不起，选择的订单已完成签收！");
						isFind =true;
						break;
					}else if(names[i] != null && states[i]==0 && signOrderId == i+1){
						states[i] = 1;
						System.out.println("订单签收成功！");
						isFind =true;
						break;
					}
				}
				if(!isFind){
					System.out.println("对不起，没找到订单！");
				}
				break;
			case 5:
				System.out.println("********删除餐袋********");
				System.out.print("删除订单的序号：");
				int delId = cin.nextInt();
				int delIndex = -1;
				boolean isDelFind = false;
				for(int i =0;i<names.length;i++){
					if(names[i] != null && states[i]==1 && delId==i+1){
						delIndex = i;
						isDelFind = true;
						break;
					}else if(names[i] != null && states[i]==0 && delId==i+1){
						System.out.println("你选择的订单未签收，不能删除！");
						isDelFind = true;
						break;
					}
				}
				if(!isDelFind){
					System.out.println("此条订单不存在！");
				}
				if(delIndex != -1){
					for(int i=delIndex;i<names.length-1;i++){
						names[i] = names[i+1];
						dishMegs[i] = dishMegs[i+1];
						times[i] = times[i+1];
						addresses[i] = addresses[i+1];
						states[i] = states[i+1];
					}
					names[names.length-1] = null;
					dishMegs[names.length-1] = null;
					times[names.length-1] = 0;
					addresses[names.length-1] = null;
					states[names.length-1] = 0;
					System.out.println("删除成功！");
				}
				break;
			case 6:
				System.out.println("********点赞/评价********");
				System.out.println("序号\t餐品名\t单价\t点赞数\t评价");
				for(int j=0;j<dishNames.length;j++){
					String price = prices[j] + "元";
					String praise = praiseNums[j] + "赞";
					System.out.println((j+1)+"\t"+dishNames[j]+"\t"+price+"\t"+praise+"\t"+evaluations[j]);
				}
				System.out.print("输入要点赞的餐品序号：");
				int dishId = cin.nextInt();
				praiseNums[dishId-1]++;
				System.out.println("点赞成功！");
				System.out.println(dishNames[dishId-1]+" "+praiseNums[dishId-1]+"赞");
				System.out.print("是否评价：");
				String select = cin.next();
				if("是".equals(select)){
					System.out.print("输入评价：");
					String evaluation = cin.next();
					if("无".equals(evaluations[dishId-1])){
						evaluations[dishId-1] = evaluation;
					}else{
						evaluations[dishId-1] = evaluations[dishId-1]+","+evaluation;
					}
					System.out.println("评价成功!");
				}
				break;
			case 7:
				break;
			default:
				break;
			}
			if(choose <1 || choose>6){
				break;
			}else{
				System.out.println("输入0返回：");
				num = cin.nextInt();
			}
		}while(num == 0);
		System.out.println("谢谢使用~~");
		cin.close();
	}
}
