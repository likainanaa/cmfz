package com.likainan.cmfz.untils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class IcodeUtils {
	public static  char[] getRandomChars(){
		char[] chs="0123456789ABCDEFGHIJKLMNabcdefghijklmn".toCharArray();
		char[] vcode=new char[4];
		Random random=new Random();
		for(int i=0;i<vcode.length;i++){
			vcode[i]=chs[random.nextInt(38)];
		}
		return vcode;
	}
	public static BufferedImage getImage(char[]  icode){
		BufferedImage buffer=new BufferedImage(90, 40, BufferedImage.TYPE_INT_RGB);
		Graphics g=buffer.getGraphics();
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 90, 10);
		g.setColor(Color.WHITE);
		g.drawString(icode[0]+"", 10, 25);
		g.drawString(icode[1]+"", 30, 25);
		g.drawString(icode[2]+"", 50, 25);
		g.drawString(icode[3]+"", 70, 25);
		g.dispose();
		return buffer;
	}
}
