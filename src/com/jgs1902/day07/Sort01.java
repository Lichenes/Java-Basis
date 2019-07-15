package com.jgs1902.day07;

//冒泡排序
public class Sort01 {
	public static void main(String[] args) {
		int[] arr= new int[]{2,9,6,7,4,1};
		printArrary(arr);
		bubbleSort(arr);//小到大
		printArrary(arr);
	}
	
	private static void bubbleSort(int[] arr) {
		for(int times = 1;times <= arr.length - 1;times ++){
			for(int i = 1; i <= arr.length - times ;i ++){
				if(arr[i-1] > arr[i]){
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
				}
			}
		}
	}

	public static void printArrary(int[] arr) {
		for(int index : arr){
			System.out.print(index + " ");
		}
		System.out.println();
	}
}
