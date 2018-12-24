package com.qf.cs_aop_test.service.impl;

import com.qf.cs_aop_test.service.AopTestService;
import org.springframework.stereotype.Controller;

@Controller
public class AopTestServiceImpl implements AopTestService {
    @Override
    public void add() {
        System.out.println("add:start");
    }
}
