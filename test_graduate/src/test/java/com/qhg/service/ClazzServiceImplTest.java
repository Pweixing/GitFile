package com.qhg.service;

import com.qhg.NewApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: admin
 * @Date: 2019/5/10 20:13
 * @Description:
 */
@SpringBootTest(classes =NewApplication.class)
@RunWith(SpringRunner.class)
public class ClazzServiceImplTest {
    @Autowired
    ClazzService clazzService;
    @Test
    public void clazzName() {
        boolean b = clazzService.clazzName("111");
        System.out.println(b);

    }
}