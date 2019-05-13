package com.qhg.controller;

import com.qhg.NewApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Auther: admin
 * @Date: 2019/4/24 15:48
 * @Description:
 */
@SpringBootTest(classes =NewApplication.class)
@RunWith(SpringRunner.class)
public class TaskControllerTest {

    @Test
    public void inStuTaskList() {
        Date date = new Date();
        System.out.println(date.getTime());
//        Date date2 = new Date("2019-04-30");
        String time="2019-04-30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date2 = sdf.parse(time);
            System.out.println(date2.getTime());
            if (date2.getTime()<=date.getTime()){
                System.out.println("data");
            }else {
                System.out.println("data2");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}