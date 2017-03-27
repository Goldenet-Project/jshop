package net.jeeshop.core.util;

import java.util.UUID;

public class UUIDGeneratorUtil { 
    public UUIDGeneratorUtil() { 
    } 
    /** 
     * 获得一个没有'-'的UUID ,
     * @return String UUID 
     */ 
    public static String getUUID(){ 
        String s = UUID.randomUUID().toString(); 
        //去掉“-”符号 
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24); 
    } 
    /** 
     * 获得一个有'-'的UUID 
     * @return String UUID 
     */ 
    public static String getSrcUUID(){ 
        String uuid = UUID.randomUUID().toString();        
        return uuid;
    } 
    /** 
     * 获得指定数目的UUID 
     * @param number int 需要获得的UUID数量 
     * @return String[] UUID数组 
     */ 
    public static String[] getUUID(int number){ 
        if(number < 1){ 
            return null; 
        } 
        String[] ss = new String[number]; 
        for(int i=0;i<number;i++){ 
            ss[i] = getUUID(); 
        } 
        return ss; 
    } 
   
}   