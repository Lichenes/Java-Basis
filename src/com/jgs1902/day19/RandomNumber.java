package com.jgs1902.day19;

import java.util.Random;
import java.util.UUID;

public class RandomNumber {
		public StringBuilder random(){
//			String code = UUID.randomUUID().toString().substring(0, 6);
//			System.out.println(code);
			String str = "ABCDEFGHIJKLMNOPQRSTUVWXYXZ";
			str += str.toLowerCase();
			str += "123456789";
			StringBuilder sb =new StringBuilder(6);
			for (int i = 0; i < 6; i++) {
				char ch = str.charAt(new Random().nextInt(str.length()));
				sb.append(ch);
			}
			return sb;
		}
}