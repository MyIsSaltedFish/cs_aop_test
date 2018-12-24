package com.qf.cs_aop_test;

import com.qf.cs_aop_test.service.AopTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CsAopTestApplicationTests {
    @Autowired
    private AopTestService aopTestService;
    @Test
    public void contextLoads() {
        aopTestService.add();
    }

}
