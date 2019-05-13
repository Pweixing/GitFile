package com.qhg.utils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * ID 生成器
 */
public class IdGenerator {
    private static SimpleDateFormat format = new SimpleDateFormat("yyMMddHH");

    public static String getID() {
        String rs = null;
        //表示通用唯一标识符 (UUID) 的类。
        rs = UUID.randomUUID().toString().replace("-", "").substring(26); //
        rs = format.format(new Date()) + "_" + rs;
        return rs;
    }
    public static String getMinId() {
        String rs = null;
        //表示通用唯一标识符 (UUID) 的类。
        rs = UUID.randomUUID().toString().replace("-", "").substring(28); //
        rs = format.format(new Date()) + "_" + rs;
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(getMinId());
    }
}
