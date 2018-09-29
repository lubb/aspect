package com.lbb.module.aspect.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAop {

    @Pointcut("execution(public * com.lbb.module.aspect.controller..*.add*(..))")
    public void httpBeforeLog() {}

    @Pointcut("execution(public * com.lbb.module.aspect.controller..*.sub*(..))")
    public void httpAfterLog() {}

    @Pointcut("execution(public * com.lbb.module.aspect.controller..*.remainder*(..))")
    public void httpAroundLog() {}

    @Before("httpBeforeLog()")
    public void doBeforeAdvice(JoinPoint joinPoint){
        System.out.println("我是前置通知1!!!");
    }

    @After("httpAfterLog()")
    public void doAfterAdvice() {
        System.out.println("我是后置通知1!!!");
    }

    @Before("@annotation(com.lbb.module.aspect.annotation.BeforeRead)")
    public void doBeforeAnnotationAdvice(JoinPoint joinPoint){
        System.out.println("我是前置通知2!!!");
    }

    @After("@annotation(com.lbb.module.aspect.annotation.AfterRead)")
    public void doAfterAnnotationAdvice(JoinPoint joinPoint){
        System.out.println("我是后置通知2!!!");
    }

    @Around("httpAroundLog())")
    public Object doAroundAdvice(ProceedingJoinPoint joinPoint){
        Object result =null;
        try{
            System.out.println("我是环绕通知前!!!");
            result = joinPoint.proceed();
            System.out.println("我是环绕通知后!!!");
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("环绕的异常通知");
        }
        System.out.println("环绕的后置通知");
        return result;
    }

    @AfterThrowing(value="execution(* com.lbb.module.aspect.aop.*.*(..))",throwing = "e")
    public void doAfterThrowingAdvice(JoinPoint joinPoint, Exception e) {
        System.out.println("我是异常通知!!!");
    }

    @AfterReturning(value="execution(* com.lbb.module.aspect.controller.*.*(..))",returning = "result")
    public void doAfterReturningAdvice(JoinPoint joinPoint, Object result) {
        System.out.println("我是AfterReturning通知!!!");
    }

}
