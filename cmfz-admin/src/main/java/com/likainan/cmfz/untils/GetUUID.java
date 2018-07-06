package com.likainan.cmfz.untils;

import java.util.UUID;

/**
 * 获得UUid
 * likainan
 * Created by ASUS on 2018/7/6.
 */
public class GetUUID {
    public static String getUUID(){
       return UUID.randomUUID().toString().replace("-","");
    }
}
