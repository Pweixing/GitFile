package com.qhg.utils;

import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @Auther: admin
 * @Date: 2019/4/29 13:03
 * @Description:        文件下载
 */
public class FileUtils {

   public static void downFile(HttpServletResponse response, String fileName, File file) {
       if (file.exists()) {
           response.setContentType("application/force-download");// 设置强制下载不打开
           try {
               fileName = URLEncoder.encode(fileName, StandardCharsets.UTF_8.toString()); //中文乱码
           } catch (UnsupportedEncodingException e) {
               e.printStackTrace();
           }
           response.setContentType(MediaType.APPLICATION_OCTET_STREAM.toString());

           // 解决中文文件名乱码关键行
           response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"; filename*=utf-8''" + fileName);// 设置文件名
           byte[] buffer = new byte[1024];
           FileInputStream fis = null;
           BufferedInputStream bis = null;
           try {
               fis = new FileInputStream(file);
               bis = new BufferedInputStream(fis);
               OutputStream os = response.getOutputStream();
               int i = bis.read(buffer);
               while (i != -1) {
                   os.write(buffer, 0, i);
                   i = bis.read(buffer);
               }
               System.out.println("success");
           } catch (Exception e) {
               e.printStackTrace();
           } finally {
               if (bis != null) {
                   try {
                       bis.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
               if (fis != null) {
                   try {
                       fis.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           }
       }
   }
}