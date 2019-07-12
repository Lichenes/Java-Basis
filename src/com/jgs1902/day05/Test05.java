package com.jgs1902.day05;

//鸡兔同笼
public class Test05 {
	public static void main(String[] args) {
	int i = 1;
		while(i<39){
			int j = 50-i;
			while(j>=1){
				if(i+j==50&&i*4+j*2==160){
					System.out.println("兔子= "+i+" 鸡 = "+j);
				}
				j--;
			}
			i++;
		}
		/*for(int i=1;i<39;i++){
			for(int j=50-i;j>=1;j--){
				if(i+j==50&&i*4+j*2==160){
					System.out.println("i="+i+" j="+j);
				}
			}
		}*/
	}
}
