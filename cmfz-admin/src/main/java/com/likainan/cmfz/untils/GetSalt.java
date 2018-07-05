package com.likainan.cmfz.untils;

import java.util.Random;

public class GetSalt {
	public static  String salt(){
		char[] chs="0123456789ABCDEFGHIJKLMNabcdefghijklmn".toCharArray();
		char[] sc=new char[4];
		Random random=new Random();
		for(int i=0;i<sc.length;i++){
			sc[i]=chs[random.nextInt(38)];
		}
		return String.valueOf(sc);
	}
}
