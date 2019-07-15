package com.jgs1902.day07;

import java.util.Arrays;

// Arrays 比较equals 排序sort 转换成字符串toString 将所有值赋值为同一个fill 复制copyof 二分查找binarySearch
public class Arrays01 {
	public static void main(String[] args) {
		int[] arr1= new int[]{2,9,6,7,4,1};
		int[] arr2= new int[]{2,9,6,7,4,1};
		Arrays.sort(arr1);
		for(int i : arr1){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("***********************************");
		boolean flag = Arrays.equals(arr1, arr2);
		System.out.println(flag);
		System.out.println("***********************************");
		System.out.println(Arrays.toString(arr1));
		System.out.println("***********************************");
		Arrays.fill(arr2, 0);
		System.out.println(Arrays.toString(arr2));
		System.out.println("***********************************");
		int[] arr3=Arrays.copyOf(arr1, 10);
		System.out.println(Arrays.toString(arr3));
		System.out.println("***********************************");
		int index = Arrays.binarySearch(arr1, 6);
		System.out.println(index);
	}
}
