package com.likainan.cmfz.untils;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {
	public static String encryption(String content){
		return DigestUtils.md5Hex(content);
	}
	public static boolean chexkPasseord(String src,String pwd){
		if(src==null)throw new RuntimeException();
		if(pwd==null)throw new RuntimeException();
		if(encryption(src).equals(pwd))
			return true;
		return false;
	}
}
