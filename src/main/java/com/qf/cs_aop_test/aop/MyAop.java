package com.qf.cs_aop_test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {

    //进入之前
    @Before("execution(* com.qf.cs_aop_test.service.AopTestService.* (..))")
    public void before(JoinPoint jp){
        System.out.println("进入前");
    }
    //退出之后
    @After("execution(* com.qf.cs_aop_test.service.AopTestService.* (..))")
    public void after(JoinPoint jp){
        System.out.println("退出后");
    }
    //环绕
    @Around("execution(* com.qf.cs_aop_test.service.AopTestService.* (..))")
    public Object arount(ProceedingJoinPoint jp){
        Object result = null;
        try {
            System.out.println("开始");
            result = jp.proceed();
            System.out.println("提交");
        }catch (Throwable ex){
            System.out.println("回滚");
        }

        return  result;
    }
}
